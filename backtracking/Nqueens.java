package backtracking;

/**
 * Created by sachin on 7/25/2018.
 */
import java.util.*;
import java.lang.*;

class Nqueens
{
    static String sol="";

    public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        String ta[]=new String[t];
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int d[][]=new int[n][n];
            /*for (int[] r : d)
                Arrays.fill(r, 1);*/
         Vector<String>sb=new Vector<>();
            for(int j=0;j<n;j++)
            {
                if(solve(d,j,n,sb,sol))
                {
                    //here we got a solution
                    System.out.println("here"+j);
                    sol+="[";
                    for(int k=0;k<n;k++)
                    {
                        for(int l=0;l<n;l++)
                        {
                            if(d[k][l]==1)sol+=(l+1)+" ";
                        }
                    }
                    sol+="]";

                }
                System.out.println(sb);
            }
            ta[i]=sol;
            sol="";

        }
        for(int i=0;i<t;i++)
        {
            System.out.println(ta[i]);
        }



    }
    static boolean	solve(int[][] a, int col, int n, Vector<String> sb, String w)
    {
        int index;
        //if we got col>= size return
        if(col>=n)
        {
            sb.add(w);
            return true;
        }
        else

        {
            //now check every possibility just like tuple checking of backtracking
            //concept
            for( index=0;index<n;index++)
            {
                if(isSafe(a,index,col))
                {
                    //means we got some combination
                    a[index][col]=1;
                    if(solve(a,col+1,n,sb,w+col+""))return true;
                    a[index][col]=0;//backtracking step
                }
            }

        }
        return false;
    }
    static	boolean isSafe(int [][]a,int index,int col)
    {
        int i,j;
        //first check in its row
        //we have to actually traverse all left to 0 whethet we have formed
        //valid combinations
        for(i=0;i<col;i++)
            if(a[index][i]==1)return false;
        //now we will go upper diagonally,means i,j both decreasing
        for(i=index,j=col;i>=0 && j>=0;i--,j--)
        {
            if(a[i][j]==1)return false;
        }
        //now we will go diagonally down
        for(i=index,j=col;i<a[0].length &&j>=0;i++,j--)
        {
            if(a[i][j]==1)return false;
        }
        //if we reach here means we got some valid stuff
        return true;
    }
}