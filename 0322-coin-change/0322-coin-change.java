class Solution {
    public int coinChange(int[] coins, int amount) {
        // dp[i] will store the minimum number of coins needed to make amount i
        int[] dp = new int[amount + 1];

        // Initialize dp array with amount + 1 (representing infinity)
        // because the maximum number of coins needed can't exceed the amount itself (if all coins are 1)
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
        }

        // Base case: 0 coins are needed to make amount 0
        dp[0] = 0;

        // For each amount from 1 to the target amount
        for (int i = 1; i <= amount; i++) {
            // Try every coin denomination
            for (int coin : coins) {
                if (i - coin >= 0) {
                    // If we can take this coin, the total coins needed is 1 + coins needed for (amount - coin)
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        // If dp[amount] is still amount + 1, it means the amount cannot be reached
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
