package math;

/**
 * Created by sachin on 7/24/2018.
 */
import java.util.*;
import java.lang.*;
import java.io.*;
class Simple_fraction
{
    public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner (System.in );
        int t=sc.nextInt();
        String ta[]=new String[t];
        for(int i=0;i<t;i++)
        {
            String ans="";
            int N=sc.nextInt();
            int D=sc.nextInt();
            if(N%D==0)
            {
                ans+=N/D;
                ta[i]=ans;
            }
            else
            {
                ans+=N/D+".";

                String frac="";
                String check="";
                N=(N%D)*10;boolean ch=false;
                while(N!=0&&!ch)
                {
                    int f=N/D;
                    check+=f;
                    int sa=check.length();
                    if(sa==2 &&(check.charAt(0)==check.charAt(1)))
                    {
                        ch=true;
                    }
                  else   if(sa%2==0&&sa>2)
                    {
                        int mid=sa/2;
                        if(check.charAt(0)==check.charAt(mid+1))
                            ch= see(check);
                    }

                    if(!ch)
                        N=(N%D)*10;
                }
                int l=check.length();
                if(l==2)
                {
                    ans+="("+check.charAt(0)+")";
                    ta[i]=ans;
                }
                else
                {
                    for(int j=0;j<check.length()/2;j++)
                    {
                        frac+=check.charAt(j);
                    }
                    ans+="("+frac+")";
                    ta[i]=ans;
                }

            }

        }
        for(int i=0;i<t;i++)
        {
            System.out.println(ta[i]);
        }

    }
    static boolean see(String s)
    {
        int l=s.length();
        int mid=l/2;

        if(l==2&&(s.charAt(0)==s.charAt(1)))return true;
        else if(l==2&&(s.charAt(0)!=s.charAt(1)))return false;
        else if(l>2)
        {
            for(int i=0;i<mid;i++)
            {
                if(s.charAt(i)!=s.charAt(mid+i))return false;
            }
        }
        return true;
    }
}
