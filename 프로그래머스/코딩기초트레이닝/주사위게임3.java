package 코딩기초트레이닝;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 주사위게임3 {
    public static void main(String[] args) {
        System.out.println(solution(6, 4, 2, 5));
    }

    static int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = {a, b, c, d};
        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        int size = map.size();
        if (size == 4) { // 모두 다른 경우
            return Arrays.stream(arr).min().getAsInt();
        } else if (size == 1) { // 모두 같은 경우
            return a * 1111;
        } else if (size == 2) { // 3, 1 / 2, 2
            if (map.containsValue(3)) {
                int a1 = 0, b1 = 0;
                for (Integer key : map.keySet()) {
                    int val = map.get(key);
                    if (val == 3) {
                        a1 = key * 10;
                    } else if (val == 1) {
                        b1 = key;
                    }
                }
                return (int) Math.pow(a1 + b1, 2);
            } else {
                int a1 = 0, b1 = 0, cnt = 0;
                for (Integer key : map.keySet()) {
                    cnt++;
                    a1 += key;
                    if (cnt > 1) {
                        b1 -= key;
                        break;
                    }
                    b1 += key;
                }
                return a1 * Math.abs(b1);
            }
        } else if (size == 3) { // 2, 1, 1
            int a1 = 1;
            for (Integer key : map.keySet()) {
                if (map.get(key) != 2) {
                    a1 = a1 * key;
                }
            }
            return a1;
        }
        return 0;
    }
}
