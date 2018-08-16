package arrays;
import java.util.*;
/**
 * Created by sachin on 6/18/2018.
 */
public class TWO_Elements_SUM_CLOSE_TO_0 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER SIZE OF ARRAY");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER ELEMENTS");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
		Arrays.sort(a);
		int l=0,r=n-1,lfinal=0,rfinal=n-1;
		int current=0;int close_sum=Integer.MAX_VALUE;
        while(l<r)
		{
			current=a[l]+a[r];
			if(Math.abs(current)<Math.abs(close_sum))
			{
				lfinal=l;rfinal=r;
				close_sum=current;
				
			}
			if(current<0)
				l++;
			else
				r--;
		}


        System.out.println(" ist element = " + a[lfinal] + " 2nd element = " + a[rfinal]);
//sample input ={0,59,-9,69,-79,84}    output= -79,84
 //input={5,10,-8,2,3,-5} output=5,-5

    }
}
