public class NumberConversion {
    public static void main(String[] args) {
        int N = 13;
        boolean isPossible = isConversionPossible(N);

        if (isPossible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isConversionPossible(int N) {
        for (int d = 0; d < N; d++) {
            int result = (int) Math.pow(2, d);
            if (result == N - Math.pow(d, 2)) {
                return true;
            }
        }
        return false;
    }
}
