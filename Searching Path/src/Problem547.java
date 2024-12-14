public class Problem547 {
    public int findCircleNum(int[][] isConnected){
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int numberOfComponents = 0;
        for (int i = 0; i < n; i++){
            if(!visited[i]){
                numberOfComponents++;
                dfs(i, isConnected, visited);
            }
        }
        return numberOfComponents;
    }
    public void dfs(int node, int[][] isConnected, boolean[] visited){
        visited[node] = true;
        int len = isConnected.length;
        for (int i = 0; i < len; i++){
            if(isConnected[node][i] == 1 && !visited[i]){
                dfs(i, isConnected, visited);
            }
        }

    }
}
