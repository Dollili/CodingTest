package 코딩기초트레이닝;

public class 정수를나선형으로배치하기 {
    public static void main(String[] args) {
        //solution(4);
    }

    static void solution(int n) {
        int a = 0, b = 0;
        int a1 = n - 1, b1 = n - 1;
        int[][] arr = new int[n][n];
        int cnt = 1;
        while (a <= a1 && b <= b1) {
            for (int i = b; i <= b1; i++) {
                arr[a][i] = cnt++;
            }
            a++;

            for (int i = a; i <= a1; i++) {
                arr[i][b1] = cnt++;
            }
            b1--;

            if (a <= a1) {
                for (int i = b1; i >= b; i--) {
                    arr[a1][i] = cnt++;
                }
                a1--;
            }

            if (b <= b1) {
                for (int i = a1; i >= a; i--) {
                    arr[i][b] = cnt++;
                }
                b++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "       ");
                if (j == n - 1) {
                    System.out.println();
                }
            }
        }
    }
}
