package math;

import java.math.BigInteger;

/**
 * Created by sachin on 7/23/2018.
 */
public class Array_lcm {
    public static void main(String[] args) {
        int a[]={1,2,8,3};
        System.out.println("LCM OF ARRAY IS "+find_lcm(a));
        BigInteger h=new BigInteger("12");
        for (int i = 1; i <20 ; i++) {
            h=h.multiply(new BigInteger(""+i));
        }
        System.out.println(h);
    }

    private static int find_lcm(int[] a) {
        int ans =a[0];
        for (int i = 1; i <a.length ; i++) {
            ans=(ans*a[i])/gcd(ans,a[i]);
        }
        return ans;
    }
    static int gcd(int a, int b)
    {
        if(b==0)
            return a;
        else return gcd(b,a%b);
    }
}
