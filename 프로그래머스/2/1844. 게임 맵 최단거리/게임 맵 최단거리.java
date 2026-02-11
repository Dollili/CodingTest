import java.util.*;
class Solution {    
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {-1, 1, 0 ,0};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visit = new boolean[n][m];
        visit[0][0] = true;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        
        while(!queue.isEmpty()) {
            int[] values = queue.poll();
            int x = values[0];
            int y = values[1];
            int count = values[2];
            
            if (x == (n - 1) && y == (m - 1)) return count;
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1 && !visit[nx][ny] ) {
                    visit[nx][ny] = true;
                    queue.add(new int[]{nx, ny, count + 1});
                }
            }
        }
        return -1;
    }
    
}