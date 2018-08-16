package arrays;

/**
 * Created by sachin on 6/18/2018.
 */
public class Product_leaving_element_divisionoperator {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int l=a.length;
        //maintain product of array leaving a[i] from left and right side
        int lp[]=new int[l];
        int rp[]=new int[l];
        int product[]=new int[l];
        lp[0]=a[0];
        rp[l-1]=a[l-1];
        for (int i = 1; i <l ; i++) {
           lp[i]=lp[i-1]*a[i];
            rp[l-1-i]=rp[l-i]*a[l-1-i];

        }



    }

}
