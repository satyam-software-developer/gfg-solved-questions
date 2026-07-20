//Back-end complete function Template for Java
import java.util.*;
class Solution {
    public static void freqSorted(int arr[]) {
        // Your Code Here
         TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
    }
}