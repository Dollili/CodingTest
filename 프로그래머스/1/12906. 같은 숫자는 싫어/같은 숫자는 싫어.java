import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int tmp = arr[0];
        list.add(tmp);
        for (int j : arr) {
            if (tmp != j) {
                tmp = j;
                list.add(tmp);
            }
        }
        return list;
    }
}