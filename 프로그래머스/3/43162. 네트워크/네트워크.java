class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(n, computers, i, visited);
                answer++;
            }
        }
        
        return answer;
    }
    
    private static void dfs(int node, int[][] computers, int n, boolean[] visit) {
        visit[n] = true;
        for (int i = 0; i < node; i++) {
            if (!visit[i] && computers[n][i] == 1) {
                dfs(node, computers, i, visit);
            }
        }
    }
}