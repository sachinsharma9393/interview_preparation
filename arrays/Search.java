package arrays;

class Search
{
	
	static int  binarySearch(int[] a, int low, int high, int key)
	{
		if(high >=low )
		{
			int mid=(high+low)/2;
			if(a[mid]==key)
			{
				return mid;
			}
			if(a[mid]>key)
			{
				return binarySearch(a,low,mid-1,key);
				
			}
			else
				return binarySearch(a,mid+1,high,key);
		}
		
		//System.out.println("Element not found");
		return -1;
	}
	
	public static void main(String []args)
	{
		int a[]={1,2,3,4,5,6,7};
		//linear search
		int key=3;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				System.out.println("element found at i is "+i);
				break;
			}
			
		}
	
			System.out.println("now binary search recursive ");
			int low=0;
			int high=a.length-1;
			int success=binarySearch(a,low,high,key);
			if(success==-1)System.out.println("not found");
		else {

				System.out.println("found at i = " + success);
			}

		System.out.println("now iterating binary search");
		
		while(low<=high)
		{
			int mid=(low +high)/2;
			if(a[mid]==key)
			{
				System.out.println("found at i = "+mid);
				break;
			}
			if(a[mid]>key)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}


	}
}