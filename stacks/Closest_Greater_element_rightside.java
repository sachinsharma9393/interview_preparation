package stacks;

import java.util.Stack;

/**
 * Created by sachin on 6/24/2018.
 */
public class Closest_Greater_element_rightside {
    public static void main(String[] args) {
        int a[]={10,20,1,5,25,50,60};
        int b[]=find_closest_greater(a);
        for (int val:b
             ) {

            System.out.println(val);
        }
    }

    private static int[] find_closest_greater(int[] a) {


        Stack<Integer> st=new Stack<>();
		int gr[]=new int[a.length-1];//as last index greater is of no use
		int i=1;
		st.push(0);
		while(i<a.length)
		{
			
			while(!st.isEmpty() &&a[st.peek()]<=a[i])
			{

                int t=st.pop();
				gr[t]=a[i];


            }
			st.push(i++);
		}
	


    return gr;
    }
}


