import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> map = new HashSet<>();      
        int choose = nums.length / 2;
        int answer = 0;
        for(int i : nums) {
            map.add(i);
        }
        if (map.size() > choose) {
            return choose;
        } else {
            return map.size();
        }
    }
}