package math.BigInteger_practice_java;

import java.math.BigInteger;


/**
 * Created by sachin on 7/15/2018.
 */
public class BigInteger_Practice {
    public static void main(String[] args) {
        BigInteger k=new BigInteger("0");
        System.out.println(k.setBit(0));
        BigInteger b=new BigInteger("33");
       b= b.multiply(new BigInteger("12"));
        System.out.println(b.intValue());
        b=b.divide(new BigInteger("12"));
        System.out.println(b);
        System.out.println(b = b.nextProbablePrime());
        System.out.println(b.isProbablePrime(12));
        int c=9;
        BigInteger h=new BigInteger(String.valueOf(c));

       // b.toString()

    }
}
