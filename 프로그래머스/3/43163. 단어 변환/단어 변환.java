import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int[] visit = new int[words.length];
        boolean check = false;
        Queue<Integer> que = new LinkedList<>(); 
        
        for(int i = 0; i < words.length; i++) {
            if (visit[i] == 0 && diff(begin, words[i]) == 1) {
                visit[i] = 1;
                que.add(i);
            }
            
            if (target.equals(words[i])) {
                check = true;
            }
        }
        
        if (!check) {
            return 0;
        }
        
        while(!que.isEmpty()) {
            int q = que.poll();
            String w = words[q];
            
            if (w.equals(target)) {
                answer = visit[q];
                break;
            }
            
            for(int i = 0; i < words.length; i++) {            
                if (visit[i] == 0 && diff(w, words[i]) == 1) {
                    que.add(i);
                    visit[i] = visit[q] + 1;
                }
            }   
        }   
        return answer;
    }
    
    private static int diff(String begin, String word) {
        int cnt = 0;
        for(int i = 0; i < word.length(); i++) {
            if (begin.charAt(i) != word.charAt(i)) {
                cnt++;            
            }
        }
        return cnt;
        
    }
}