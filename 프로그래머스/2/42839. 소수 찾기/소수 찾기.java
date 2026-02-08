import java.util.*;
class Solution {
    public int solution(String numbers) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        dfs("", numbers, set);
        for (int n : set) {
            if (check(n)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private static void dfs(String pre, String nums, Set<Integer> s) {
        int n = nums.length();
        if (!pre.equals("")) {
            s.add(Integer.parseInt(pre));
        }
        
        for (int i = 0; i < n; i++) {
            dfs(pre + nums.charAt(i), nums.substring(0, i) + nums.substring(i + 1, n), s);   
        }        
    }
    
    private static boolean check(int n) {
        if (n < 2) return false;
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}