package string;

/**
 * Created by sachin on 8/3/2018.
 */
import java.util.*;
import java.lang.*;
import java.io.*;


class Smallest_Distinct_Window_for_a_String
{
    public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        String s[]=new String[k];
        for(int i=0;i<k;i++)
        {
            String s1=sc.next();
            //String s2=sc.next();
            LinkedHashSet<Character>lhs=new LinkedHashSet<>();
            int n1=s1.length();

            for(int j=0;j<n1;j++)
            {
                lhs.add(s1.charAt(j));
            }
            Iterator it=lhs.iterator();
            String s2="";
            while(it.hasNext())
            {
                s2+=(Character)it.next();
            }
            int n2=s2.length();
            if(n2>n1)s[i]="-1";
            else
            {
                int main[]=new int[256];
                int sub[]=new int[256];
                int start =0,ind=-1,len=Integer.MAX_VALUE;
                for(int j=0;j<n2;j++)sub[s2.charAt(j)]++;
                int count=0;
                for (int j = 0; j <n1 ; j++) {
                    main[s1.charAt(j)]++;

                    if(sub[s1.charAt(j)]!=0 && main[s1.charAt(j)]<=sub[s1.charAt(j)])count++;
                    if(count==n2)
                    {
                        //minimizing

                        while(main[s1.charAt(start)]>sub[s1.charAt(start)]|| main[s1.charAt(start)]==0)
                        {

                            if(main[s1.charAt(start)]>sub[s1.charAt(start)])main[s1.charAt(start)]--;

                            start++;
                        }
                        int lw=j-start+1;
                        if(len>lw)
                        {
                            len=lw;
                            ind=start;
                        }
                    }
                }
                // System.out.println(ind+"--"+len);
                s[i]=String.valueOf(len);
            }

        }
        for(int  i=0;i<k;i++)
        {
            System.out.println(s[i]);
        }
    }
}