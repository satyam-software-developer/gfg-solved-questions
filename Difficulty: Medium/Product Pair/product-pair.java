import java.util.*;

class Solution {
    public boolean isProduct(int[] arr, long target) {
        HashSet<Long> set = new HashSet<>();

        for (int num : arr) {
            long val = num;

            if (val == 0) {
                if (target == 0) {
                    return true;
                }
            } else {
                if (target % val == 0 && set.contains(target / val)) {
                    return true;
                }
            }

            set.add(val);
        }

        return false;
    }
}