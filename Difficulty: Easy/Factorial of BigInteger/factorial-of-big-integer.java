import java.math.BigInteger;
class Solution {
    public static BigInteger factorial(int n) {
        // code here
         BigInteger fact = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        return fact;
        
    }
}
