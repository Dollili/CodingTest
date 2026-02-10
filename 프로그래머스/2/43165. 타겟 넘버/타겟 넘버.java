
class Solution {
    public static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }
    
    private static void dfs(int[] numbers, int depth, int target, int result) {
        if (numbers.length == depth) {
            if (result == target) {
                answer++;
            }
        } else {
            dfs(numbers, depth + 1, target, result + numbers[depth]);
            dfs(numbers, depth + 1, target, result - numbers[depth]);
        }    
    }
}