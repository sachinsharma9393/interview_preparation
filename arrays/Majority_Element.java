package arrays;

class Majority_Element
{
	public static void main(String [] args)
	{
		//sorted array
		int a[]={1,2,3,3,3,3,4};//occuring atleast n/2 times
		//linear search
        int n=a.length;
		if(n%2==0)n=n/2-1;//even then last case of majority element is at n/2-1
		else n=n/2;//otherwise odd can have to n/2
		for(int i=0;i<n;i++)
		{
			if(a[i]==a[i+a.length/2])//occuring more than length/2
			{
                System.out.println("found majority element at i = " + i +" element is "+a[i]);
                break;
            }
			
		}
		//Binary search
        int low=0,high=n-1;
        while(low<=high)
        {

            int mid=(low+high)/2;
            if(a[mid]==a[mid+n/2])//concept is a[mid]==a[mid-1] go left for more binary search otherwise that mid itself is majority
            {
                System.out.println("found majority element  = " + a[mid]);
                break;
            }
            else {
               high=mid-1;
            }
        }
		
	}
}