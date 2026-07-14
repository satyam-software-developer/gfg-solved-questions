class Solution {
	public int lastRemaining(int n, int k) {
		// code here
		int survivor = 0;
		
		for (int i = 2; i <= n; i++) {
			survivor = (survivor + k) % i;
		}
		
		return survivor + 1;
		
	}
}
