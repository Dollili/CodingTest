import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < priorities.length; i++) {
            map.put(i, priorities[i]);
        }

        while (!map.isEmpty()) {
            Map.Entry<Integer, Integer> clone = map.entrySet()
                    .iterator()
                    .next();
            int current = clone.getKey();
            int currentV = clone.getValue();
            System.out.println(current + " " + currentV);
            boolean change = false;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (!entry.getKey()
                        .equals(current) && entry.getValue() > currentV) {
                    change = true;
                    break;
                }
            }

            if (change) {
                map.remove(current);
                map.put(current, currentV);
            } else {
                map.remove(current);
                if (current == location) {
                    return answer;
                }
                answer++;
            }
        }
        return answer;
    }
}