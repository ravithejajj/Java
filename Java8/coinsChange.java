package Java8;

import java.util.Arrays;

class coinsChange {
    static int count=0;
    static boolean flag=false;
    public static void main(String[] args) {

        int arr[] = new int[]{1,5,2};
        ;
        System.out.println(coinChange(arr,11));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int c : coins) {
                if (c <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - c]);
                }
            }
        }
        return dp[amount] != (amount + 1) ? dp[amount] : -1;
    }
}