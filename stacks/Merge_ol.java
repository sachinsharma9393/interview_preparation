package stacks;

/**
 * Created by sachin on 7/23/2018.
 */
import java.util.*;
import java.lang.*;
import java.io.*;
class Pair implements Comparable<Pair>
{
    Integer x;
    Integer y;

    public Pair(Integer a, Integer b)
    {
        x = a;
        y = b;
    }
    public int compareTo(Pair o1)
    {


        return  x<=o1.x?-1:1;
    }
}

class GFG
{
    public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String ta[]=new String[t];
        for(int i=0;i<t;i++)
        {
            int k=sc.nextInt();
            Pair a[]=new Pair[k];
            for(int j=0,r=0;j<2*k;r++)
            {
                int x=sc.nextInt();

                int y=sc.nextInt();
                a[r]=new Pair(x, y);
                j+=2;

            }
            Stack<Integer>s=new Stack<>();
            Stack<Integer>e=new Stack<>();
            s.push(a[0].x);e.push(a[0].y);
            Collections.sort(Arrays.asList(a));
            System.out.println(a[0].x+"--"+a[0].y);

            for(int j=1;j<a.length;j++)
            {
                int p=a[j].x;
                int q=a[j].y;
                int ss=s.peek();
                int ee=e.peek();
                if(ee<p)
                {

                    e.push(q);

                    s.push(p);


                }
                else
                {
                    e.pop();
                    e.push(q);
                }
            }
            String temp="";
            for(int j=0;j<e.size();j++)
            {
                temp+=s.get(j)+" "+e.get(j)+" ";
            }
            ta[i]=temp;
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(ta[i]);
        }

    }
}
