package stacks;

/**
 * Created by sachin on 7/17/2018.
 */
import java.util.*;
import java.lang.*;
import java.io.*;
class Longest_valid_Parenthesis
{
    public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        int ta[]=new int[t];
        for(int i=0;i<t;i++)
        {
            String s=sc.next();
            ta[i]=valid(s,s.length());
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(ta[i]);
        }
    }
    static int valid(String s,int l)
    {
        int len=0;

        Stack<Integer>st=new Stack<>();
        st.push(-1);
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c=='(')st.push(i);
            else
            {
                st.pop();


                if(!st.isEmpty())
                    len=Math.max(len,i-st.peek());

                else
                {
                    st.push(i);
                }
            }
        }
        return len;

    }
}
