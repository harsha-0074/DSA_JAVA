//Given an integer array coins[ ] representing different denominations of currency and an integer sum,
//find the number of ways you can make sum by using different combinations from coins[ ]. 
//Assume that you have an infinite supply of each type of coin. Therefore, you can use any coin as many times as you want.
public class Coin_Change {
    public int count(int coins[],  int sum) {
      int  n = coins.length;
        long[] dp = new long[sum + 1];  // solved using dynamic programming
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            int coin = coins[i];
            for (int j = coin; j <= sum; j++) {
                dp[j] = dp[j] + dp[j - coin];
            }
        }

        return (int) dp[sum]; // convert safely
    }
    public static void main(String[] args) {
        Coin_Change sol = new Coin_Change();
        int[] coins = {1, 2, 3};
        int sum = 4;
        System.out.println("Number of ways to make " + sum + " is: " + sol.count(coins, sum));// output : 4
    }
}
