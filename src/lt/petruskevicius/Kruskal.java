package lt.petruskevicius;

import com.eclipse.DisjointSet;
import lt.petruskevicius.graph.*;

import java.util.Collections;

/**
 * Class implementing Kruskal minimum spanning tree algorithm
 */
public class Kruskal {
    /**
     *
     * @param Graph graph
     * @return Graph of a minimum spanning tree
     */
    public static Graph getMinimumumSpanningTree(Graph graph) {
        Graph result = new Graph();
        result.setVertices(graph.getVertices());
        DisjointSet<Vertex> vertexDisjointSet = new DisjointSet<Vertex>();

        for (Vertex v: graph.getVertices()) {
            vertexDisjointSet.makeSet(v);
        }
        Collections.sort(graph.getEdges());

        for (Edge e: graph.getEdges()) {
            if (vertexDisjointSet.findSet(e.getFrom()) != vertexDisjointSet.findSet(e.getTo())) {
                result.addEdge(e);
                vertexDisjointSet.union(e.getFrom(), e.getTo());
            }
        }

        return result;
    }
}
