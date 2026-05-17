import java.util.*;

class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if (!stack.isEmpty() &&
                ((stack.peek() >= 0 && num < 0) || (stack.peek() < 0 && num >= 0))) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        return new ArrayList<>(stack);
    }
}