import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] clo : clothes) {
            map.put(clo[1], map.getOrDefault(clo[1], 0) + 1);
        }

        int answer = 1;
        for (int value : map.values()) {
            answer *= (value + 1);
        }
        return answer - 1;
    }
}