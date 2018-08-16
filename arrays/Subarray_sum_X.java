package arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;

/**
 * Created by sachin on 6/18/2018.
 */
public class Subarray_sum_X {
    public static void main(String[] args) {

        //for sub array sum 0 replace x with 0
        //question 1 say all are positive numbers (exclude -numbers)
		int a[]={1,2};
		int x=3;
		//m-1 brute force generate all sub arrays then check sum -----n2 for sub arrays then sum * numbers
		//m-2 **** 0(n) approach
		int f=sub_array(a,x);
        if(f==0) System.out.println("not found");

        //question 2 say it contains negative numbers as well then method 2 fails as increase left pointer may not
        //always decrease sum and similar for right it will not increase sum

        //m-3 hash method 0(n) space time and space

        int result=sub_array_hash(a,x);
        if(result==-1) System.out.println("not found");


    }

    private static int sub_array_hash(int[] a, int x) {
        
		LinkedHashMap<Integer,Integer> l=new LinkedHashMap<>();
		int sum=a[0];
		l.put(sum,0);
		int index=-1;
		for(int i=1;i<a.length;i++)
		{
			sum+=a[i];
			//also here 1 more condition that sub array complete array then
			//if(sum==x){}
			if(l.containsKey(sum-x))
			{
				//means found sub array from l.get(sum-x) and i 
				index =i;
				break;
				
			}
			else
				l.put(sum,i);
			
			
		}
        System.out.println(("----------------------------------------"));
        if(index !=-1)
		{
            System.out.println("SUB ARRAY THROUGH HASH METHOD");
            int start=l.get(sum-x);
			for(int i=start+1;i<=index;i++)
			{
                System.out.print(a[i]+"\t");

            }
            return 0;
		}
		else
        return -1;
    }

    private static int sub_array(int[] a,int x) {
       // Arrays.sort(a);//if we do arrays.sort here we will get max sub array here 1,2,3,4,5,6 as output
		int lp=0,rp=0;
		int sum=a[lp];
		while(rp<=a.length)
		{
			if(sum<x){
             ++rp;
                sum+=a[rp];

            }
			else {
                sum-=a[lp];
                ++lp;
            }
			if(sum==x)
			{
				System.out.println(" array index btw left -"+lp+" and right = "+rp);
                //lets print sub array
                System.out.println("sub array is ");
                for (int i = lp; i <=rp ; i++) {
                    System.out.print( a[i]+"\t");
                }
                return 1;
			}
			
			
		}
        return 0;
	 
    }
}
