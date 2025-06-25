package 입문;

public class 분수의덧셈 {
    public static void main(String[] args) {
        int[] result = solution(1, 2, 3, 4);
    }

    static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2;
        numer1 = denom2 * numer1;
        numer2 = denom1 * numer2;
        int sum = numer1 + numer2;

        return reduceFraction(sum, denom);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int[] reduceFraction(int numer, int denom) {
        int gcd = gcd(numer, denom);
        return new int[]{numer / gcd, denom / gcd};
    }

}
