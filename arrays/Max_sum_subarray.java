package arrays;

/**
 * Created by sachin on 6/19/2018.
 */
public class Max_sum_subarray {
    public static void main(String[] args) {
       // int a[]={10,-5,-3,4,2,12,-8,-12,19};
        int a[]={-3,10,5,-20,4,11,-5,7};
        //3 methods 
		//m-1	brute force all subarrays then check in that max sum i.e 0(n2)*n for checking ===0(n3)
		//m-2 reducing ckecking part of 0(n) using concept of cummulative sum 0(n2) using brute force
        // in that cummulative sum using i,j (a[i]-a[j]) max
		//m-3 kadane algorithm in 0(n)time
        int current=0,max=0,index=0;
		for(int i=0;i<a.length;i++)
		{
			current+=a[i];
			if(current<0)
				current=0;
			if(current>max)
			{
				max=current;
				index=i;
			}
		}
		System.out.println(max);
		int end=index;
		int sum=0;
        System.out.println("printing elements of subarray , here reverse printed as we going backwards");
        while(index>=0)
		{
			sum+=a[index];
			System.out.print(a[index]+"\t");
			if(sum==max)
			{
				break;
			}
            index--;
		}
	
		
    }
}
