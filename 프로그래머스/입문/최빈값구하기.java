package 입문;

import java.util.HashMap;
import java.util.Map;

//최빈값
public class 최빈값구하기 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2};
        int result = solution(array);
        System.out.println(result);
    }

    static int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int resultKey = 0;

        for (int i : array) {
            int seq = map.getOrDefault(i, 0) + 1;
            map.put(i, seq);

            if (max < seq) {
                max = seq;
                resultKey = i;
            } else if (max == seq && resultKey != i) {
                resultKey = -1;
            }
        }

        return resultKey;
    }
}
