package 입문;

import java.util.HashMap;
import java.util.Map;

public class 겹치는선분의길이 {
    public static void main(String[] args) {
        int[][] array = {{0, 1}, {2, 5}, {3, 9}};
        int result = solution(array);
        System.out.println(result);
    }

    static int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < lines.length; i++) {
            for (int l = lines[i][0]; l < lines[i][1]; l++) {
                map.put(l, map.getOrDefault(l, 0) + 1);
            }
        }

        int answer = 0;
        for (Integer value : map.values()) {
            if (value > 1) {
                answer++;
            }
        }

        return answer;
    }
}
