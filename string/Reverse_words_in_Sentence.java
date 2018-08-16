package string;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by sachin on 6/21/2018.
 */

public class Reverse_words_in_Sentence {
    public static void main(String[] args) {
       /* String s="this is sachin sharma";
        // String a[]=s.split(Pattern.quote (".")); issues with (.,^) split remember 2 options \\,pattern.quote()
        String a[]  =s.split(" ");
        int n=a.length;
        int p=0;
        int q=n-1;
        while(p<q)
        {

            String t=a[p];
            a[p]=a[q];
            a[q]=t;

            p++;q--;
        }
        String result="";
        for(int i=0;i<n;i++)
        {
            result+=a[i]+".";
        }
        //result+=a[a.length-1];
        System.out.println(result);

        System.out.println(result.substring(0, result.length()-1));*/
        String s="ss.ss";
        String a[]=s.split("\\.");
        System.out.println(a[0]);
        int p=0;
        int q=a.length-1;
        while(p<q)
        {
            String t=a[p];
            a[p]=a[q];
            a[q]=t;
            p++;q--;

        }
        String g="";
        for(int i=0;i<a.length;i++)
        {
            g+=a[i]+".";
        }
        // g+=a[a.length-1];

        System.out.println(g);


    }
}
