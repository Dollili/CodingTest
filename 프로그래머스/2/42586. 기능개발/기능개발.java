import java.util.*;
class Solution {
     static final int percent = 100;
     public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            int remain = (percent - progresses[i]) % speeds[i];
            int remainSpeed = (percent - progresses[i]) / speeds[i];
            if (remain > 0) {
                remainSpeed++;
            }
            list.add(remainSpeed);
        }
        int flag = list.get(0);
        int cnt = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > flag) {
                flag = list.get(i);
                result.add(cnt);
                cnt = 1;
            } else {
                cnt++;
            }
            if (i == list.size() - 1) {
                result.add(cnt);
            }
        }
        return result;
    }
}