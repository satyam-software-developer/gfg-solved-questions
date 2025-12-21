class Solution {
    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            int x = q[2];

            int left = lowerBound(arr, x);
            int right = upperBound(arr, x) - 1;

            if (left < n && right >= 0) {
                int start = Math.max(left, l);
                int end = Math.min(right, r);
                if (start <= end) {
                    result.add(end - start + 1);
                } else {
                    result.add(0);
                }
            } else {
                result.add(0);
            }
        }
        return result;
    }

    private int lowerBound(int[] arr, int x) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < x) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    private int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= x) low = mid + 1;
            else high = mid;
        }
        return low;
    }
        
}