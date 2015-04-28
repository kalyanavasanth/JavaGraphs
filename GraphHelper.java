import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Kalyana Vasanth
 *
 */
class GraphHelper {
	private HashMap<Integer, ArrayList<Integer>> adjacencyList;
	private int nodes = 0;

	public GraphHelper(int length) {
		adjacencyList = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < length; ++i) {
			adjacencyList.put(i, new ArrayList<Integer>());
		}
		nodes = length;
	}

	public boolean addEdge(int source, int destination) {
		boolean isSuccessful = adjacencyList.get(source).add(destination);
		return (isSuccessful);
	}

	public int getNodeCount() {
		return nodes;
	}

	public void bfs(int start) {
		LinkedList<Integer> bfsQueue = new LinkedList<Integer>();
		boolean[] visited = new boolean[nodes];
		for (int i = 0; i < nodes; ++i) {
			visited[i] = false;
		}
		bfsQueue.addLast(start);
		visited[start] = true;
		while (!bfsQueue.isEmpty()) {
			int current = bfsQueue.remove();
			System.out.println(current);
			ArrayList<Integer> tempList = adjacencyList.get(current);
			for (int temp : tempList) {
				if (visited[temp] == false) {
					bfsQueue.addLast(temp);
					visited[temp] = true;
				}
			}
		}
	}
	
	public void dfsUtility(int start, boolean[] visited){
		visited[start]=true;
		System.out.println(start);
		ArrayList<Integer> tempList=adjacencyList.get(start);
		for(int temp: tempList){
			if(visited[temp]==false){
				dfsUtility(temp, visited);
			}
		}
	}
	
	public void dfs(int start){
		boolean[] visited=new boolean[nodes];
		for(int i=0;i<visited.length;++i){
			visited[i]=false;
		}
		dfsUtility(start, visited);
	}
	
	
}