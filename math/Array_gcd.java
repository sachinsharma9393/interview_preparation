package math;

/**
 * Created by sachin on 7/23/2018.
 */
public class Array_gcd {
    public static void main(String[] args) {
        int a[]={4,3,5};
        System.out.println(gcd(a));
    }

    private static int gcd(int[] a) {
    int ans=a[0];
        for(int i=1;i<a.length;i++)
        {
            ans=gcd(ans,a[i]);
        }
    return ans;
    }

    private static int gcd(int a, int b) {
        if(b==0)return a;
        else return gcd(b,a%b);
    }
}
