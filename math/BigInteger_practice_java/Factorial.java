package math.BigInteger_practice_java;

import java.math.BigInteger;

/**
 * Created by sachin on 7/23/2018.
 */
public class Factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(5));
    }

    private static int fact(int j) {
        BigInteger b=new BigInteger("1");
        for(int i=2;i<=j;i++)
        {
            b=b.multiply(new BigInteger(""+i));
        }
        return b.intValueExact();
    }
}
