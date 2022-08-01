/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan13;

/**
 *
 * @author Nanda D. Cahyo
 */
public class PrimsAlgorithm {

    private static final int V = 6;

    int minKey(int key[], Boolean mstSet[]) {
        int min = Integer.MAX_VALUE;
        int min_index = -1;

        for (int v = 0; v < V; v++) {
            if (mstSet[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }
        }

        return min_index;
    }

    void printMST(int parent[], int graph[][]) {
        System.out.println("Edge \tWeight");

        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    void primMST(int graph[][]) {
        int parent[] = new int[V];
        int key[] = new int[V];
        Boolean mstSet[] = new Boolean[V];

        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        key[0] = 0;
        parent[0] = -1;

        for (int count = 1; count < V - 1; count++) {
            int u = minKey(key, mstSet);

            mstSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }
        printMST(parent, graph);
    }

    public static void main(String[] args) {
        PrimsAlgorithm t = new PrimsAlgorithm();

        int graph[][] = new int[][]{
            {0, 3, 0, 0, 5, 0},
            {3, 0, 5, 0, 6, 0},
            {0, 5, 0, 9, 0, 3},
            {0, 0, 9, 0, 0, 7},
            {5, 6, 0, 0, 0, 2},
            {0, 0, 3, 7, 2, 0}
        };

        t.primMST(graph);
    }
}
