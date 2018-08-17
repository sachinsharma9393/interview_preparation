package backtracking;

import java.util.TreeSet;
import java.util.Vector;

/**
 * Created by sachin on 8/17/2018.
 */
public class String_Subsequences {
    static Vector<String>v=new Vector<>();//duplicacy
    static TreeSet<String>ts=new TreeSet<>();

    public static void main(String[] args) {
        String s="abc";
        print_subsequnces(s);
        System.out.println(v);//here duplicacy
        System.out.println(ts);
    }

    private static void print_subsequnces(String s) {

        int k=s.length();
                    v.add(s);
                    ts.add(s);
                    for(int i=0;i<k;i++)
                    {
                        StringBuilder sb=new StringBuilder(s);
                        sb.deleteCharAt(i);
                        if(sb.length()==0)return;
                        else
                        print_subsequnces(sb.toString());


                    }
    }
}
