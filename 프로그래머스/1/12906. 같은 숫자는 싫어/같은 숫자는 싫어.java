import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i=0; i< arr.length; i++) {
            if (i == arr.length - 1) {
                list.add(arr[i]);
                break;
            }
            if (arr[i] != arr[i+1]) {
                list.add(arr[i]);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}