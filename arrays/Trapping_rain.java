package arrays;

/**
 * Created by sachin on 6/21/2018.
 */
public class Trapping_rain {
    //how much water gets trapped problem
    public static void main(String[] args) {
        int a[]={1,0,2,0,1,0,3,1,0,2};
        //array values are actual heights
        //1 method is to find  min of max left side including and max right side ...then subtract height or a[i]
        //but his is 0(n^2) as for every element we will find right side and left side greatest value


        //best is to store greatest right in right array and greatest left in left sub array
        //in 0(n) we can find left and right
        int l=a.length;
        int left[]=new int[l];
        int right[]=new int[l];
        left[0]=a[0];
        for (int i = 1; i <left.length ; i++) {
            left[i]=Math.max(left[i-1],a[i]);
        }
        right[l-1]=a[l-1];
        for (int i = a.length-2; i >=0 ; i--) {
            right[i]=Math.max(right[i+1],a[i]);
        }


        int count=0;//water trapped counting
        for (int i = 0; i <l ; i++) {
            count+=Math.min(right[i],left[i])-a[i];
        }
        System.out.println("WATER TRAPPED IS " + count);
    }
}
