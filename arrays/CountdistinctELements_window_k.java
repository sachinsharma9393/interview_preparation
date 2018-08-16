package arrays;

/**
 * Created by sachin on 7/18/2018.
 */
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.HashMap;
class CountdistinctELements_window_k
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++)
                a[i] = sc.nextInt();
            //int k = sc.nextInt();

            GfG g = new GfG();
            g.countDistinct(a,k,n);
            System.out.println();

            t--;
        }
    }
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*You are required to complete below method */
class GfG
{
    void countDistinct(int a[], int k, int n)
    {
        // Your code here
        LinkedHashMap<Integer,Integer>h=new LinkedHashMap<>();
        for(int i=0;i<k;i++)
        {
            if(h.containsKey(a[i]))h.replace(a[i],h.get(a[i])+1);
            else h.put(a[i],1);
        }
        System.out.print(h.values().stream().filter(x->x>=1).count()+" ");
        //Collections.max(h.values()); for max in a window size k
        for(int i=k;i<n;i++)
        {
            //remove element from window
            int remove=a[i-k];
            int val=h.get(remove);
            h.replace(remove,val-1);
            //adding elemnet to window
            if(h.containsKey(a[i]))h.replace(a[i],h.get(a[i])+1);
            else h.put(a[i],1);
            System.out.print(h.values().stream().filter(x->x>=1).count()+" ");
        }


    }
}
