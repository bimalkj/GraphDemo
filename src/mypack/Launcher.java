package mypack;

public class Launcher {

	public static void main(String[] arg) {
		Graph g=new Graph(6);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(2,4);
        g.addEdge(4,5);
      
		
		for (int i = 0; i < g.novert; i++) {
			System.out.println("vertex:"+i);
			g.BFT(i);
			System.out.println();
		}
		
	}
}
