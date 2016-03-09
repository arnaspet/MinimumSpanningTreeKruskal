package lt.petruskevicius;

import lt.petruskevicius.graph.Edge;
import lt.petruskevicius.graph.Graph;
import lt.petruskevicius.graph.Vertex;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Edge edgeAB = new Edge(vertexA, vertexB, 2);
        Edge edgeBC = new Edge(vertexB, vertexC, 4);
        Edge edgeCD = new Edge(vertexC, vertexD, 8);
        Edge edgeDA = new Edge(vertexD, vertexA, 5);
        Edge edgeAC = new Edge(vertexA, vertexC, 3);
        Edge edgeBD = new Edge(vertexB, vertexD, 7);

        graph.addVertex(vertexA);
        graph.addVertex(vertexB);
        graph.addVertex(vertexC);
        graph.addVertex(vertexD);

        graph.addEdge(edgeAB);
        graph.addEdge(edgeBC);
        graph.addEdge(edgeCD);
        graph.addEdge(edgeDA);
        graph.addEdge(edgeAC);
        graph.addEdge(edgeBD);

        Graph result = Kruskal.getMinimumumSpanningTree(graph);

        System.out.println("Start: ");
        System.out.println(graph);
        System.out.println("Result: ");
        System.out.println(result);
    }
}
