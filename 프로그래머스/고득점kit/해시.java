package 고득점kit;

import java.util.*;

public class 해시 {
    public static void main(String[] args) {
        String[] a = {"leo", "kiki", "eden"};
        String[] b = {"kiki", "eden"};
        String st = solution(a, b);
    }

    static String solution(String[] participant, String[] completion) {
        // 참여 / 완주
        Map<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }
        for(String key : map.keySet()) {
            if(map.get(key) == 1) {
                return key;
            }
        }
        return "";
    }
}
