import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    SinglyLinkedList adjList[];
    int v;

    public AdjacencyList(int v) {
        this.v = v;
        adjList = new SinglyLinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new SinglyLinkedList();
        }
    }

    public void addEdge(int s, int d) {
        adjList[s].addNodeTail(d);
        adjList[d].addNodeTail(s);
    }

    public void printGraph() {
        for (int i = 0; i < v; i++) {
            SinglyLinkedList.Node current = adjList[i].head;
            while (current != null) {
                System.out.println(i + " is connected to " + current.data);
                current = current.next;
            }
        }
    }

    public List<Integer> getAdjNode(int i) {
        List<Integer> list = new ArrayList<Integer>();
        SinglyLinkedList.Node current = adjList[i].head;
        while (current != null) {
            list.add(current.data);
            current = current.next;
        }
        return list;
    }

    public static void main(String[] args) {
        AdjacencyList adj = new AdjacencyList(6);
        adj.addEdge(0, 1);
        adj.addEdge(0, 2);
        adj.addEdge(0, 3);
        adj.addEdge(0, 5);
        adj.addEdge(2, 4);
        adj.addEdge(2, 3);
        adj.addEdge(1, 3);
        adj.addEdge(3, 5);
        adj.addEdge(4, 5);

        adj.printGraph();
        System.out.println(adj.getAdjNode(5));
    }
}
