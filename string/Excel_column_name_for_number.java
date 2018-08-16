package string;

/**
 * Created by sachin on 6/21/2018.
 */
public class Excel_column_name_for_number {
    public static void main(String[] args) {

    }
}
/*
import java.util.*;
        import java.lang.*;
        import java.io.*;
class GFG
{
    public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        String s[]=new String[l];
        for(int i=0;i<l;i++)
        {
            int n=sc.nextInt();
            StringBuilder sb=new StringBuilder();
            while(n>0)

            {
                int rem=n%26;
                if(rem==0)
                {
                    sb.append("Z");
                    n=(n/26)-1;
                }
                else {
                    sb.append((char)(rem-1 +'A'));
                    //   System.out.println(sb);
                    n=n/26;
                }
            }
            s[i]=sb.reverse().toString();
        }
        for(int  i=0;i<l;i++)
        {
            System.out.println(s[i]);
        }
    }
*/
