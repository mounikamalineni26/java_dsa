
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS{
    public static void bfs(int start, ArrayList<ArrayList<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int v = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(2).add(0);
        graph.get(3).add(1);
        bfs(0, graph);
    }

}
// Time Complexity = O(V+E)
// Space Complexity = O(V)
/*
Output:
0 1 2 3 
*/
