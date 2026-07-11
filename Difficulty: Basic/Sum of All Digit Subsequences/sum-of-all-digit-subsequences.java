class Solution {
	public int subsequenceSum(String s) {
		// code here
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - '0';
		}
		
		return sum * (1 << (s.length() - 1));
	}
}
