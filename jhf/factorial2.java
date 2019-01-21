import java.lang.Math.*;
import java.math.BigInteger;

public class factorial2 {
    public static void main(String[] args) {
        int fac = 8;
        BigInteger fas = BigInteger.valueOf(1);
        int i = 1;
        for (; i <= fac;) {
            fas = fas.multiply(BigInteger.valueOf(i));
            i++;
        }
        System.out.println(fas);
    }

}