package backtracking;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

/**
 * Created by sachin on 8/17/2018.
 */
public class All_subarrays_subsets {
    static Vector<String>v=new Vector<>();
    static TreeSet<String> ts=new TreeSet<>();
    public static void main(String[] args) {
        int a[]={1,2,3,3};
        String s="";
        for (int i = 0; i <a.length ; i++) {
            s+=a[i];
        }
        print_subsets(s);
      //  System.out.println(v);
        System.out.println(ts);

    }

    private static void print_subsets(String s) {
        int k=s.length();
        v.add(s);
        ts.add(s.replaceAll(""," "));

        for (int i = 0; i <k ; i++) {
            StringBuilder d=new StringBuilder(s);
            d.deleteCharAt(i);
            if(d.length()==0)return;
            else print_subsets(d.toString());
        }

    }
}
/*
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
      static TreeSet<String> ts=new TreeSet<>();
	public static void main (String[] args)
	 {
	 //code
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    StringBuilder f[]=new StringBuilder[t];
	    for(int i=0;i<t;i++)
	    {
	        int n=sc.nextInt();
	        int te[]=new int[n];
	        for(int j=0;j<n;j++)
	        {
	            te[j]=sc.nextInt();
	        }

	          String s="";
        for (int j = 0; j <te.length ; j++) {
            s+=te[j];
        }
        ts.add("()");
        print_subsets(s);
        f[i]=new StringBuilder();
        for(String y:ts)
        {
            f[i].append(y);
        }
        ts.clear();

	    }
	    for(int i=0;i<t;i++)
	    {
	        System.out.println(f[i].toString());
	    }
	 }
	 static void print_subsets(String s) {
        int k=s.length();

        ts.add("("+s+")");
        for (int i = 0; i <k ; i++) {
            StringBuilder d=new StringBuilder(s);
            d.deleteCharAt(i);
            if(d.length()==0)return;
            else print_subsets(d.toString());
        }

    }
}
 */