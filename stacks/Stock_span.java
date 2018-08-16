package stacks;
import java.util.*;
/**
 * Created by sachin on 6/24/2018.
 */
public class Stock_span {
	
    public static void main(String[] args) {
        int a[]={10,2,3,15,22,9,25};
        //output span {1,1,2,4,5,1,7};
        //m-1 brute force approach 0(n^2)
		//using concept of stacks
		Stack<Integer>st=new Stack<>();
		st.push(0);//pushing first element onto stack
		int span[]=new int[a.length];

        int p=0;
        span[0]=1;//all elements will have minimum span as they individual ....some take it as 0..here i took 1
		for(int i=1;i<a.length;i++)
		{
			
			while(!st.isEmpty()&& a[st.peek()]<a[i])//means for how many elemnets that index is actually a selling
			//thats why continous pop
			{
				st.pop();
			}
			if(st.isEmpty()){p=-1;}
			else
            {p=st.peek();}
			span[i]=i-p;
			
			st.push(i);
		
		}
		
		System.out.println("PRINTING SPAN OF ELEMENTS REPRESENTING STOCK PRICES");
	
	for(int x: span)
	{
		System.out.println(x);
	}
		
		
    }
	
}
