package 입문;

public class 평행 {
    public static void main(String[] args) {
        int[][] dots = {
                {1, 4},
                {9, 2},
                {3, 8},
                {11, 6}
        };

        int a = solution(dots);
        System.out.println(a);
    }

    static int solution(int[][] dots) {
        if(checkDots(dots[0], dots[1], dots[2], dots[3])) return 1;
        if(checkDots(dots[0], dots[2], dots[1], dots[3])) return 1;
        if(checkDots(dots[0], dots[3], dots[1], dots[2])) return 1;
        return 0;
    }

    static boolean checkDots(int[] dot1, int[] dot2, int[] dot3, int[] dot4) {
        int x1 = dot2[0] - dot1[0];
        int y1 = dot2[1] - dot1[1];
        int x2 = dot3[0] - dot4[0];
        int y2 = dot3[1] - dot4[1];
        return x1 * y2 == x2 * y1;
    }
}


