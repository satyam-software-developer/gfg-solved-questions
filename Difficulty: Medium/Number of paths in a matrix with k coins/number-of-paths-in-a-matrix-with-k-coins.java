class Solution {
    public int numberOfPath(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        Integer[][][] dp = new Integer[n][m][k + 1];
        return helper(0, 0, k, mat, dp, n, m);
    }

    private int helper(int i, int j, int remaining, int[][] mat, Integer[][][] dp, int n, int m) {
        if (i >= n || j >= m || remaining < 0) return 0;
        if (i == n - 1 && j == m - 1)
            return remaining == mat[i][j] ? 1 : 0;
        if (dp[i][j][remaining] != null) return dp[i][j][remaining];
        int newRemaining = remaining - mat[i][j];
        int down = helper(i + 1, j, newRemaining, mat, dp, n, m);
        int right = helper(i, j + 1, newRemaining, mat, dp, n, m);
        return dp[i][j][remaining] = down + right;
    }
}
