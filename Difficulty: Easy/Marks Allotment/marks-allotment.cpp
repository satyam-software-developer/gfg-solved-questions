class Solution {
	public:
	int marks(int a) {
		try {
			if (a < 0 || a > 100)
				throw a;
			return a;
		}
		catch (...) {
			return - 1;
		}
	}
};
