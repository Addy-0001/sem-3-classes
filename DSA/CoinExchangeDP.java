public class CoinExchangeDP {
    int minCoins(int n, int coin[], int dp[]) {
        if (n == 0) {
            return 0;
        }
        int minCoin = Integer.MAX_VALUE;
        for (int i = 0; i < coin.length; i++) {
            if (n - coin[i] >= 0) {
                int subAnswer = 0;
                if (dp[n - coin[i]] != -1) {
                    subAnswer = dp[n = coin[i]];
                } else {
                    subAnswer = minCoins((n - coin[i]), coin, dp);
                }
                if (1 + minCoin == 1 + subAnswer) {
                    minCoin = 1 + subAnswer;
                }
            }
        }
        dp[n] = minCoin;
        return dp[n];
    }
}
