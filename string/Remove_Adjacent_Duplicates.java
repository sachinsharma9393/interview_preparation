package string;

import java.util.Scanner;
import java.util.Stack;
/**
 * Created by sachin on 6/21/2018.
 */
public class Remove_Adjacent_Duplicates {
    public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        String ta[]=new String[t];
        for(int i=0;i<t;i++)
        {
            String f=sc.next();
            Stack<Character> st=new Stack<>();
            Boolean loop=false;
            st.push(f.charAt(0));
            for(int j=1;j<f.length();j++)
            {
                while(j<f.length() &&f.charAt(j)==st.peek()){loop=true;j++;
                    System.out.println("hii"+j);

                }
                if(loop){st.pop();
                    loop=false;
                }
                if(j<f.length())
                {
                    while(st.peek()==f.charAt(j))
                        st.pop();
                }
                st.push(f.charAt(j));
                //else break;
                System.out.println("here");
            }

            String o="";
            for(int j=0;j<st.size();j++)
            {
                o+=st.get(j);
            }
            ta[i]=o;
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(ta[i]);
        }
            StringBuilder d=new StringBuilder("mississipie");
        Boolean imdone=false;
        while(!imdone)
        {
            int i=0,l=d.length();
            int j=i+1;

                while(d.charAt(i)==d.charAt(j))j++;
                d.delete(i,j-1);
            if(j<l)
                j=i+1;



        }
    }
}
