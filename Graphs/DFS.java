import java.util.ArrayList;
public class Main{ 
    public static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int neighbour : graph.get(node)) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited, graph);
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

        boolean[] visited = new boolean[v];
        dfs(0,visited, graph);
    }

}
//  Time Complexity = O(V+E)
// Space Complexity = O(V)
/* Output:
0 1 3 2  */

