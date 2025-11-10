class Solution {
    public int maxProfit(int arr[]) {
        int n = arr.length;
        if (n == 0) return 0;
        int[] buy = new int[n];
        int[] sell = new int[n];
        buy[0] = -arr[0];
        sell[0] = 0;
        for (int i = 1; i < n; i++) {
            buy[i] = Math.max(buy[i - 1], (i > 1 ? sell[i - 2] : 0) - arr[i]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + arr[i]);
        }
        return sell[n - 1];
    }
}
