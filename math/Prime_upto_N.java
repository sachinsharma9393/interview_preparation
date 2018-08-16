package math;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sachin on 7/23/2018.
 */
public class Prime_upto_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime_uto_N(n);
    }

    private static void prime_uto_N(int n) {
        int ans =0;
        int a[]=new int[n+1];
        Arrays.fill(a,1);
        for(int i=2;i<Math.sqrt(n);i++)
        {
            fill(a,i);
        }
        for(int i=2;i<n;i++)
        {
            if(a[i]==1) System.out.print(i+" ");
        }
    }

    private static void fill(int[] a, int i) {
        for (int j = i*2; j <a.length ; j+=i) {
            a[j]=0;
        }
    }

}
