package 입문;

public class 옹알이 {
    public static void main(String[] args) {
        String[] q = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        int a = solution(q);
    }

    static int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (String s : babbling) {
            if (checkValue(s, words)) {
                answer++;
            }
        }
        return answer;
    }

    static boolean checkValue(String s, String[] words) {
        if(s.isEmpty()) return true;
        for (String word : words) {
            if (s.startsWith(word)) {
                String string = s.substring(word.length());
                return checkValue(string, words);
            }
        }
        return false;
    }
}
