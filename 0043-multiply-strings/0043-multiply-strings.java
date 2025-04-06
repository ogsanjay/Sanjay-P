
import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
          
        BigInteger q1 = new BigInteger(num1);
        BigInteger q2 = new BigInteger(num2);

        BigInteger res = q1.multiply(q2);

        return res.toString();

    }
}