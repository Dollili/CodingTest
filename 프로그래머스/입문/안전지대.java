package 입문;

public class 안전지대 {
    public static void main(String[] args) {
        int[][] board = {{1, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 1}};
        System.out.println("result: " + solution(board));
    }

    static int solution(int[][] board) {
        int[][] boardCopy = new int[board.length + 2][board.length + 2];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    int x = i + 1, y = j + 1;
                    boardCopy[x][y] = board[i][j];
                    boardCopy[x + 1][y + 1] = 1;
                    boardCopy[x - 1][y - 1] = 1;
                    boardCopy[x + 1][y - 1] = 1;
                    boardCopy[x - 1][y + 1] = 1;
                    boardCopy[x + 1][y] = 1;
                    boardCopy[x - 1][y] = 1;
                    boardCopy[x][y + 1] = 1;
                    boardCopy[x][y - 1] = 1;
                }
            }
        }

        int cnt = 0;
        for (int i = 1; i <= board.length; i++) {
            for (int j = 1; j <= board.length; j++) {
                if (boardCopy[i][j] == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
