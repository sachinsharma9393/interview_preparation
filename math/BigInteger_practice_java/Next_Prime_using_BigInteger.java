package math.BigInteger_practice_java;

/**
 * Created by sachin on 7/18/2018.
 */


import java.util.*;
        import java.lang.*;
        import java.io.*;
        import java.math.*;
class Next_Prime_using_BigInteger
{
    public static void main (String[] args) throws IOException
    {
        //code

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        //int n=sc.nextInt();
        int  a[]=new int[n];
        for( int i=0;i<n;i++)
        {       int x=Integer.parseInt(br.readLine());
            int b[]=new int[x];String s="";
           // while(br.readLine()!=null)
                s+=br.readLine();
            StringTokenizer st=new StringTokenizer(s," ");
            for(int j=0;j<x;j++)
            {
                b[j]=Integer.parseInt(st.nextToken());
            }
            int sum=0;
            for(int j=0;j<x;j++)
            {
                sum+= b[j];
            }
            BigInteger bi=new BigInteger(String.valueOf(sum));
            System.out.println("sum is "+sum);
            System.out.println("PRIME = "+bi.isProbablePrime(sum));
            System.out.println(bi.nextProbablePrime());
            if(bi.isProbablePrime(10))
                a[i]=0;
            else a[i]= bi.nextProbablePrime().intValue()-sum;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}