import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AdjacencyMatrix {
    int v;
    int matrix[][];

    AdjacencyMatrix(int v) {
        this.v = v;
        matrix = new int[v][v];
    }

    void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    void printGraph() {
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (matrix[i][j] != 0) {
                    System.out.println("There is a connection between " + i + " and " + j);
                }
            }
        }
    }

    List<Integer> getAdjNode(int i) {
        // Get all adjacent nodes and return the list.
        List<Integer> nodes = new ArrayList<Integer>();
        for (int j = 0; j < v; j++) {
            if (matrix[i][j] != 0) {
                nodes.add(j);
            }
        }
        return nodes;
    }

    // BFS - Breadth First Search
    void BFS(int src) {
        boolean visited[] = new boolean[v];
        LinearQueue q = new LinearQueue(v);
        q.enqueue(src);
        visited[src] = true;
        while (!q.isEmpty()) {
            int u = q.dequeue();
            for (int j = 0; j < v; j++) {
                if (!visited[j]) {
                    q.enqueue(j);
                    visited[j] = true;
                }
            }
        }

    }

    // Shortest path vfs
    int shortestPathBFS(int source, int destination) {
        LinearQueue q = new LinearQueue(v);
        boolean visited[] = new boolean[v];
        int dist[] = new int[v];
        int prevpath[] = new int[v];

        for (int i = 0; i < v; i++) {
            dist[i] = Integer.MAX_VALUE;
            prevpath[i] = -1;
        }
        dist[source] = 0;
        q.enqueue(source);
        visited[source] = true;

        while (!q.isEmpty()) {
            int u = q.dequeue();
            for (int j = 0; j < v; j++) {
                if (matrix[u][j] != 0) {
                    if (!visited[j]) {
                        if (dist[u] + 1 < dist[j]) {
                            dist[j] = dist[u] + 1;
                            prevpath[j] = u;
                            q.enqueue(j);
                            visited[j] = true;
                        }
                    }
                }
            }
        }

        // print path to destination
        int path[] = new int[v];
        int crawling = destination;
        while (crawling != -1) {
            path[crawling] = prevpath[crawling];
            crawling = prevpath[crawling];
        }

        // print path to destination using stack
        Stack stk = new Stack<Integer>();
        int temp = destination; 
        stk.push(temp); 
        while(prevpath[temp] != -1){
            temp = prevpath[temp]; 
            stk.push(temp); 

        }

        System.out.println("printing path");
        while (!stk.isEmpty()){
            System.out.println(stk.pop());
        }
        return dist[destination];
    }

    void dfs(int s, boolean visited[]) {
        visited[s] = true;
        System.out.println(visited[s] + "is fully visited.");
        for (int j = 0; j < v; j++) {
            if (matrix[s][j] != 0) {
                if (!visited[j]) {
                    dfs(j, visited);
                }
            }
        }
    }

    // Write iterative implementation of DFS Algorithm
    void DFS(int s) {
        boolean visited[] = new boolean[v];
        dfs(s, visited);

    }

    public static void main(String[] args) {
        AdjacencyMatrix adj = new AdjacencyMatrix(5);
        adj.addEdge(0, 1);
        adj.addEdge(0, 2);
        adj.addEdge(2, 3);
        adj.addEdge(2, 4);
        adj.addEdge(1, 4);
        adj.addEdge(3, 4);

        adj.printGraph();

        System.out.println(adj.shortestPathBFS(0, 4));
    }
}
