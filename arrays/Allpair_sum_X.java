package arrays;
import java.util.*;
class Allpair_sum_X
{
	public static void main(String[] args)
	{
		int X=5;
        Integer []a={1,2,3,4,5};
		//given input assume
        int count=0;
        ArrayList v= new ArrayList(Arrays.asList(a));//contains method "contains "just like hash
		for(int i=0;i<a.length;i++)
		{
			
			if(v.contains(X-a[i]))
			{
				++count;
				System.out.println(count+" pair is {"+a[i]+","+(X-a[i])+"}");
			}
		}
		
		
	}
}