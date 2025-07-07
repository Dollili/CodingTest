import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<String, Integer> sortedV = new HashMap<>(); // 순서 정하기 위한 map
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>(); // 크기별 고유번호 정렬
        for (int i = 0; i < genres.length; i++) {
            sortedV.put(genres[i], sortedV.getOrDefault(genres[i], 0) + plays[i]);
            map.put(i, genres[i]);
            map2.put(i, plays[i]);
        }
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(sortedV.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        List<Map.Entry<Integer, Integer>> sortedPList = new ArrayList<>(map2.entrySet());
        sortedPList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> stringIntegerEntry : sortedList) {
            String genre = stringIntegerEntry.getKey();
            int cnt = 0;
            for (Map.Entry<Integer, Integer> integerIntegerEntry : sortedPList) {
                int a = integerIntegerEntry.getKey();
                if (map.get(a).equals(genre)) {
                    if (cnt == 2) {
                        break;
                    }
                    cnt++;
                    answer.add(a);
                }
            }
        }
        return answer;
    }
}