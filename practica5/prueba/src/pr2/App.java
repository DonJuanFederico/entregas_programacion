package pr2;

import static jdk.vm.ci.aarch64.AArch64.v1;

public class App {
    public static void main(String[] args){
        Graph<Integer> graph = new Graph<>();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);

        System.out.println(graph.addEdge(1, 2));

        graph.addEdge(1, 5);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(5, 4);
    }
}

