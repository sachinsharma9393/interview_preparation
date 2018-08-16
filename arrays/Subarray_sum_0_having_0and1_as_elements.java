package arrays;

import java.util.LinkedHashMap;

/**
 * Created by sachin on 6/18/2018.
 */
class Subarray_sum_0_having_0and1_as_elements{
    public static void main(String[] args) {
        //m-1 brute force approach 0(n3) generating all sub arrays * counting= n2 *n =n3
		//m-2 make all 0's as -1 ,maintain sum array and  now this problems turns to max sub array whose sum is equal to 0
		//m-3 hash approach 
		int a[]={1,1,1,0,1,0,0,0,1,1,1,0};
		//changing all 0's to -1's
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				a[i]=-1;
		}
		int sum[]=new int[a.length];
        sum[0]=a[0];
        for (int i = 1; i < a.length; i++) {
            sum[i]=sum[i-1]+a[i];
        }

        //now find max sub array whose sum is 0 with hash approach

		LinkedHashMap<Integer,Integer> l=new LinkedHashMap<>();
		l.put(sum[0],0);
		
		int f_index=0,l_index=0;
		int max_length=0;
		for(int i=1;i<a.length;i++)
		{
			
			if(l.containsKey(sum[i]))//if same key contains means from f_index+1 to l_index sum is 0
			{
				//means found sub array
				//now check whether max sub-array

						if(i-l.get(sum[i])>max_length)
						{
							f_index=l.get(sum[i]);
							l_index=i;
							max_length=l_index-f_index;
						}
				
				
			}
			else
				l.put(sum[i],i);
		}
		System.out.println("Now lets see max length sub -array with equal number of 0 and 1");
		for (int i = f_index+1; i <=l_index ; i++) {
			System.out.println(a[i]);
		}
		System.out.println("length is " + max_length);



		//m-3 rather than sum use directly values to hash and check value-0 in hash


	}
}
