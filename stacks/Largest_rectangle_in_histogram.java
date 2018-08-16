package stacks;

import java.util.Stack;

/**
 * Created by sachin on 6/24/2018.
 */
public class Largest_rectangle_in_histogram {
    public static void main(String[] args) {
        //brute force
        //using stack
        //dp with 0(n^2 ) time and space 0(n^2) also of space O(n) approach with 2 arrays as cache
        //nlogn segment tree approach divide and conquer
        //best is to to do with stack 0(n)
    //    int a[]={3,2,5,6,1,4};
        int a[]={6,2,5,4,5,1,6};
        int max_area=0;
        Stack<Integer>st=new Stack<>();
        st.push(0);int i;
        for( i=1;i<a.length;)
        {
            if(st.isEmpty() || a[st.peek()]<=a[i] )//more value than stack top just push in stack
            {
                st.push(i++);

            }
            else {
                int index=st.pop();
                 max_area=Math.max(max_area,a[index]*(st.empty()?i:i-st.peek()-1));
            }
        }
        //now there may be a case as stack might not get empty index remains
        //there will always a min index will get to remanin till last as it has largest breadth

        while(!st.isEmpty())
        {
            int index=st.pop();
            max_area=Math.max(max_area,a[index]*(st.isEmpty()?i:i-st.peek()-1));
        }

        System.out.println("LARGEST_AREA IS "+max_area);
    }
}
