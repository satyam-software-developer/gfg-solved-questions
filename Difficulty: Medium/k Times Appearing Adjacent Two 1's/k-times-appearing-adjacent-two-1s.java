class Solution {
	public int countStrings(int n, int k) {
		int mod = 1000000007;
		long[] dp0 = new long[k + 2];
		long[] dp1 = new long[k + 2];
		
		dp0[0] = 1;
		dp1[0] = 1;
		
		for (int i = 2; i <= n; i++) {
			long[] new0 = new long[k + 2];
			long[] new1 = new long[k + 2];
			
			for (int j = 0; j <= k; j++) {
				new0[j] = (dp0[j] + dp1[j]) % mod;
				new1[j] = (new1[j] + dp0[j]) % mod;
				if (j + 1 <= k) {
					new1[j + 1] = (new1[j + 1] + dp1[j]) % mod;
				}
			}
			
			dp0 = new0;
			dp1 = new1;
		}
		
		return (int)((dp0[k] + dp1[k]) % mod);
	}
}
