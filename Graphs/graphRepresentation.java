
import java.util.ArrayList;

public class graphRepresentation{
    static ArrayList<ArrayList<Integer>> createGraph(int v, int edges[][]){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<v; i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v1 = edges[i][1];
            graph.get(u).add(v1);
            graph.get(v1).add(u);
        }
        return graph;
    }
    public static void main(String[] args) {
        int v = 3;
        int edges[][] = {{0,1}, {0,2}, {1,2}};
        ArrayList<ArrayList<Integer>> graph = createGraph(v, edges);
        for(int i=0; i<graph.size(); i++){
            System.out.print(i + " -> ");
            for(int j=0; j<graph.get(i).size(); j++){
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}

// time Complexity = O(V+E)
// Space Complexity = O(V+E)

/* output:
   0 -> 1 2 
   1 -> 0 2 
   2 -> 0 1 */
