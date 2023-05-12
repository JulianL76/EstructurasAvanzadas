
package Ejercicio_4;

import java.util.*;
public class MinimumHeightTrees { // (Grafos) , Solution using BFS(Breadth First Search), Busqueda en anchura

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if (n == 1) {
            res.add(0);
            return res;
        }
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        int[] degree = new int[n];
        //Que son "degree" en grafos, hay 2 tipos de degrees: indegree y outdegree
        //haremos lo siguiente: Suponiendo el (nodo X, este apunta a Y y Z) (nodo Y, apunta a Z) y (nodo Z, apunta a X y Y)
        //indegree, de un vertice o nodo, son la cantidad de nodos que estan apuntando al nodo que se esta evaluando
        // en el caso de X, el unico nodo que apunta a X es Z, por ende tan solo X tiene 1 indegree 
        //outdegree, ahora sabiendo lo de indegree, en outdegree, son los nodos a los que apunta 1 nodo, en el caso de X, tiene 2 outdegree, porque apunta a Y y Z
        for (int[] edge : edges) {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
            ++degree[edge[0]];
            ++degree[edge[1]];
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == 1) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int node = q.poll();
                list.add(node);
                degree[node] = 1;
                List<Integer> neighbours = map.get(node);
                for (int m = 0; m < neighbours.size(); m++) {
                    int v = neighbours.get(m);
                    --degree[v];
                    if (degree[v] == 1) {
                        q.add(v);
                    }
                }
            }
            res = list;
        }
        return res;
    }
}
