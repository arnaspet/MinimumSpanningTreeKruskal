package lt.petruskevicius;

import lt.petruskevicius.graph.Graph;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KruskalTest {
    @Test
    public void testGetMinimumumSpanningTreeEmptyResult() throws Exception {
        Graph graph = new Graph();
        Graph minimumSpanningTree = Kruskal.getMinimumumSpanningTree(graph);
        
    }
}
