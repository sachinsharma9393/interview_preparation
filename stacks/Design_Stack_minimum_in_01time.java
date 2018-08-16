package stacks;

import java.util.Stack;

/**
 * Created by sachin on 6/24/2018.
 */
public class Design_Stack_minimum_in_01time {
    public static void main(String[] args)
    {
        //FIRST METHOD

        //2stacks
        Stack<Integer>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        int a[]={10,20,5,15,3,6,2,1};//array will be added by putting values in stack ,at every insertion means i we will see get_Minimum function
        st1.push(a[0]);
        st2.push(a[0]);
        //insertion
        for (int i = 1; i <a.length ; i++) {
            if(st1.peek()<a[i])
            {
               //if this done then max
                st2.push(st1.peek());
            }
            else  st2.push(a[i]);

            st1.push(a[i]);
            System.out.print("Minimum after " + (i+1) + " values is ");
            getMinimum(st2);//top of st2 will give max value
            System.out.println();
        }

        //similarly can be seen for deletion


        //method-2 ,do not write duplicates in stack 2 as of method 1
        //while delete only delete from st2 when st1.top==st.top otherwisee only delete from st1
        //some space gets save here


        //m-3 only 1 stack rather than 2 stacks
        System.out.println("-------------------------------------------------");
        System.out.println("METHOD--3");
        int min=0;
        Stack<Integer>mv=new Stack<>();
        min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(min>a[i])
            {
                min=a[i];
                mv.push(a[i]-mv.peek());//while deleting we can recover actual value by
            }
            else {
                mv.push(a[i]);//push directly
            }
            System.out.println("MINIMUM AFTER "+(i+1)+" VALUES IS " + min);
        }

        System.out.println("PERFORMING DELETION ON M-3 AND SEE GET_MINIMUM");
    }

    private static void getMinimum( Stack<Integer> st2) {
        System.out.print(st2.peek());
    }
}
