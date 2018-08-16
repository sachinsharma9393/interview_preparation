package arrays;
import java.util.*;
/**
 * Created by sachin on 6/18/2018.
 */
public class Triplet_sum_X {
    public static void main(String[] args) {
        //2 methods
        //brute force  0(n)
        // m-2 sort+partition algo of quicksort like using left and right pointer
		
		//m-2 0(n2 approach)
		int a[]={0,3,4,5,9,7};//X=19 , output={3,9,7};
		Arrays.sort(a);
		int x=19;
		for(int i=0;i<a.length;i++)
		{
			int l=i+1,r=a.length-1;
			while(l<r)
			{
			int sum=a[i]+a[l]+a[r];
			if(sum==x)
			{
                System.out.println("TRIPLET IS i = " + a[i] + " j= " + a[l] + " k = " +a[r] );
            }
			if(sum<x)//move lpointer
			l++;
			else//move rpointer
				r--;
			}
		}
        
    }
}
