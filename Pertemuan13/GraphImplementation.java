/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan13;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nanda D. Cahyo
 */
class Graph<T> {
    private final Map<T, List<T>> map = new HashMap<>();
    
    public void addVertex(T s) {
        map.put(s, new LinkedList<>());
    }
    
    public void addEdge(T source, T destination, boolean bidirectional) {
        if (!map.containsKey(source)) {
            addVertex(source);
        }
        
        if (!map.containsKey(destination)) {
            addVertex(destination);
        }
        
        map.get(source).add(destination);
        
        if (bidirectional == true) {
            map.get(destination).add(source);
        }
    }
    
    public void getVertexCount() {
        System.out.println("The graph has " + map.keySet().size() + " vertex");
    }
    
    public void getEdgesCount(boolean bidirection) {
        int count = 0;
        
        count = map.keySet().stream().map((v) -> map.get(v).size()).reduce(count, Integer::sum);
        
        if (bidirection == true) {
            count = count / 2;
        }
        
        System.out.println("The graph has " + count + " edges");
    }
    
    public void hasVertex(T s) {
        if (map.containsKey(s)) {
            System.out.println("The graph contains " + s + " as a vertex");
        } else {
            System.out.println("The graph doesn't contain " + s + " as a vertex");
        }
    }
    
    public void hasEdge(T s, T d) {
        if (map.get(s).contains(d)) {
            System.out.println("The graph has an edge between " + s + " and " + d);
        } else {
            System.out.println("The graph has no edge between " + s + " and " + d);
        }
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        map.keySet().stream().map((v) -> {
            builder.append(v.toString()).append(" : ");
            return v;            
        }).map((v) -> {
            map.get(v).forEach((w) -> {
                builder.append(w.toString()).append(" ");
            });
            return v;            
        }).forEachOrdered((item) -> {
            builder.append("\n");
        });
        
        return (builder.toString());
    }
}

public class GraphImplementation {
    public static void main(String[] args) {
        Graph<Integer> g = new Graph<>();
        
        g.addEdge(0, 1, true);
        g.addEdge(0, 4, true);
        g.addEdge(1, 2, true);
        g.addEdge(1, 3, true);
        g.addEdge(1, 4, true);
        g.addEdge(2, 3, true);
        g.addEdge(3, 4, true);
        
        System.out.println("Graph:\n" + g.toString());
        
        g.getVertexCount();
        g.getEdgesCount(true);
        g.hasEdge(3, 4);
        g.hasVertex(5);
    }
}
