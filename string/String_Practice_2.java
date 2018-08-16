package string;

import java.util.Collections;
import java.util.Vector;

/**
 * Created by sachin on 7/26/2018.
 */
public class String_Practice_2 {
    public static void main(String[] args) {
        String s="SACH&JK^@HDSLW*";
        //repace special character with space
        System.out.println(s.replaceAll("[[\\&][\\^][\\@][\\*]]", ""));

        //replace space with %20 problem

        StringBuilder sb=new StringBuilder("sac is hf");
        for(int i=0;i<sb.length();i++){

            if(sb.charAt(i)==' ' )
            {
                sb.replace(i,i+1,"%20");
            }
        }
      //  sb.insert(5,"me");
        System.out.println(sb);
        //or using string
        s="THIS IS POKEMON";
        System.out.println(s.replaceAll(" ", "%20"));


       /* String gr="101010001001";
        char[] c=gr.toCharArray();
        int []a=new int[c.length];
        for(int i=0;i<c.length;i++)
        {
            if(c[i]-48==0)
            a[i]=-1;
            else
                a[i]=c[i]-48;
        }

        for (int g:a
             ) {
            System.out.println(g);
        }*/




    }
}
