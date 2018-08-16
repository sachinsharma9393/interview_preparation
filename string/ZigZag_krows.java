package string;

/**
 * Created by sachin on 6/21/2018.
 */
import java.util.*;
import java.lang.*;
import java.io.*;
class ZigZag_krows
{
    public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String ta[]=new String[t];
        for(int i=0;i<t;i++)
        {
            String s=sc.next();
            int k=sc.nextInt();
            boolean b=true;

            StringBuilder sb[]=new StringBuilder[k];
            for (int j = 0; j <k ; j++) {
                sb[j]=new StringBuilder();
            }

            if(k==1)
                ta[i]=s;
            else
            {
                int r=0;
                for(int j=0;j<s.length();j++)
                {
                    sb[r].append(s.charAt(j));

                    if(r==k-1)b=false;
                    if(r==0)b=true;

                    if(b)r++;
                    else
                        r--;
                }
                String h="";
                for(int j=0;j<k;j++)
                {

                        h+=sb[j].toString();

                }
                ta[i]=h;

            }

        }
        for(int i=0;i<t;i++)

        {
            System.out.println(ta[i]);
        }


    }
}