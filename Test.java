public class Test {
	public static void main(String args[]) {
		GraphHelper g = new GraphHelper(5);
		g.addEdge(0, 1);
	    g.addEdge(0, 2);
	    g.addEdge(1, 2);
	    g.addEdge(2, 0);
	    g.addEdge(2, 3);
	    g.addEdge(3, 3);
	    g.bfs(2);
	    g.dfs(2);
	}
}