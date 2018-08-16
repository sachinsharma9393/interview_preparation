package arrays;

import java.util.LinkedList;

/**
 * Created by sachin on 6/18/2018.
 */
public class Max_in_contigous_sub_array_size_k {
    public static void main(String[] args) {
        //3 methods
        //m-1 brute force .....(n-k)*k comparisons
        //m-2 maintain balanced bst of k elements 0(n-k)*(log k +log k +log k) -->1 log k for insert,delete,find max
        //m-3 maintaing list of size k and in just one scan (good method)


        int a[]={10,4,2,11,3,15,12,8,7,9,21,14};
        int n=a.length;
        int k=3;//window
        int out[]=new int[n-k+1];
        //m-1

      out[0]= findMax(a,0,k-1);

        int count=1;
        for(int j=k;j<n;j++) {//as index start from 0
        out[j-k+1]=findMax(a,count,j);
            count++;
        }

        for (int x:out
             ) {
            System.out.print(x+"\t");
        }
        //m-2

        System.out.println("\n-----------second method------------");
        findMax_m2(a,k);

    }

    private static void findMax_m2(int[] a, int k) {

		LinkedList<Integer> l=new LinkedList<>();
		//say output array 
		int out[]=new int[a.length-k+1];
		l.add(0);
		for(int i=1;i<k;++i)
		{
			while(!l.isEmpty()&&a[l.getLast()]<=a[i])
			{
				l.removeLast();
				
			}
			l.addLast(i);
		}
		//out[0]=a[l.getFirst()];
		
		for(int i=k;i<a.length;i++)
		{
			out[i-k]=a[l.getFirst()];
			while(!l.isEmpty()&&a[l.getLast()]<=a[i])
			{
				l.removeLast();
				
			}
			while(!l.isEmpty()&& (i-l.getFirst())>=k)
			{
				l.removeFirst();
			}
			l.addLast(i);
			
			
		}
		out[a.length-k]=a[l.getFirst()];

        for (int x:out
             ) {
            System.out.print(x+"\t");
        }
    }

    private static int findMax(int[] comp, int start, int end) {

        int max=0;
        for (int i = start; i <=end ; i++) {
            if(comp[i]>max)
                max=comp[i];
        }
    return max;
    }
}
