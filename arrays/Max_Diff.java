package arrays;

class Max_Diff
{
	public static void main(String [] args)
	{
		int a[]={3,9,4,7,5,100,10};
		//2 methods 
		//m-1
		int min,current,max_diff;
		//initially min,current is first element
		
		min=a[0];max_diff=0;current=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			else{
				//now we get here bcoz of false condition i.e element is not min,so there is possibility of max diff
				current=a[i]-min;
				if(current>max_diff)
				{
					max_diff=current;
				}
				
			}
		}
		System.out.println("MAX DIFFERENCES IN THE ARRAY IS "+max_diff);
		
		
		
		//m-2 diff array + max sum subarray dynamic programming
		int n=a.length;
		int diff[]=new int[n-1];
		for (int i = 0; i < diff.length; i++) {
			diff[i]=a[i+1]-a[0];
		}

		for (int x:diff
			 ) {
			System.out.println(x);
		}
		//in this method of kadane algorithm we take max,current,index . after getting index we traverse backward form index till we get sum
		int curr=0,max=0,index=0;
		for(int i=0;i<diff.length;i++)
		{
			curr+=diff[i];
			if(curr<0)curr=0;
			if(curr>max)
			{
				max=curr;
				index=i;	
			}
			
		}
		//System.out.println(diff[index]);


		System.out.println("MAX DIFFERENCES IN THE ARRAY IS "+max_diff);
		System.out.println("finding sub array as we have that index ");
		int sum=0;
		int second=index;//bcoz this index is second element ,through index we will move backwards to find another
		//index such that a[second]-a[index ] max diff
		System.out.println(index);
		while(index>=0)
		{
			sum+=diff[index];
			if(sum==max)
				break;
			index--;
		}

		System.out.println("so the elements of array are  "+a[index]+", "+a[second]);

	}
}