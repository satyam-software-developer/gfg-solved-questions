import java.util.Arrays;

class Solution {
    public int sumDiffPairs(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] dp = new int[n];

        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1];

            if (arr[i] - arr[i - 1] < k) {
                int sum = arr[i] + arr[i - 1];
                if (i >= 2) {
                    sum += dp[i - 2];
                }
                dp[i] = Math.max(dp[i], sum);
            }
        }

        return dp[n - 1];
    }
}