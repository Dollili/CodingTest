package 입문;

import java.util.ArrayList;
import java.util.List;

public class 연속된수의합 {
    public static void main(String[] args) {
        List<Integer> list = solution(3, 12);
        System.out.println(list);
    }

    static List<Integer> solution(int num, int total) {
        int a = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            a += i;
        }
        int init = (total - a) / num;
        for (int i = 0; i < num; i++) {
            list.add(init + i);
        }
        return list;
    }
}
