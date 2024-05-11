public class Fibonacci {
    int fib(int n, int[] dp) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int n = 50;
        // implementing dynamic programming.
        int dp[] = new int[n];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        System.out.println("Finding the fibonacci of: " + 50);
        System.out.println(f.fib(n, dp));
    }
}
