package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * Created by sachin on 7/15/2018.
 */
public class Java_String_Practice {
    public static void main(String[] args) {
        char hop=(char)(48+1);
        System.out.println(hop);
        String we="a a a a a   a ";
        System.out.println(we.charAt(0) == hop);
        System.out.println(we.replace(" ", ""));
        System.out.println(we.trim());
        StringBuilder sb=new StringBuilder("10101220022");
        System.out.println("-----"+Collections.frequency(Arrays.asList(sb), '2'));
        StringBuilder res=sb.reverse();
    //    sb.delete

        System.out.println(res+"--"+sb);
       // System.out.println(sb.toString().matches("w[0-9]]"));
String s="1asbv";
        System.out.println(s.matches("\\*[a-z]]\\*"));
        Character d[]=new Character[3];
        System.out.println(d[0]);
            String ma="acprcxsopcvovniwgfmnqatit";
        Character h[]=new Character[ma.length()];
        for(int i=0;i<ma.length();i++)
        {
            h[i]=ma.charAt(i);
        }
        Collections.sort(Arrays.asList(h));
        String t="microsoft";

        Character j[]=new Character[t.length()];
        for(int i=0;i<t.length();i++)
        {
            j[i]=t.charAt(i);
        }
        Collections.sort(Arrays.asList(j));
        System.out.println(j[0]);
        System.out.print(h[0]);

        for(int i=0;i<j.length;i++)
        {
            System.out.print(j[i]);
        }
        System.out.println();
        for(int i=0;i<h.length;i++)
        {
            System.out.print(h[i]);
        }

        String[][] x={{"saa"},{"aws"},{"qsd"}};

        String q="geeksforgeeks";
        String w="geeks";
        System.out.println(q.indexOf(w,w.length()));
    }
}
