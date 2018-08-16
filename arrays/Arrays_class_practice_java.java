package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * Created by sachin on 7/10/2018.
 */
public class Arrays_class_practice_java {
    public static void main(String[] args) {
        int d=1234;
        String er=String.valueOf(d);
        System.out.println(er);

        char h[]=er.toCharArray();
        System.out.println(h.length);
        Arrays.sort(h,1,3);
        System.out.println(h);


        Integer a[]={4,1,3,2,3,1};
        Character s[]={'a','b','c','d','e','f'};
        Arrays.sort(s,2,5,Collections.reverseOrder());
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);
        }

        Arrays.sort(a, Collections.reverseOrder());
StringBuilder sb=new StringBuilder();
        for (int i = 0; i <5 ; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        sb.append(3210);
        System.out.println(sb);
        String k=sb.toString();
        String t=sb.reverse().toString();
        if(k.equals(t)) System.out.println("yes");
        else System.out.println("no");


        Integer b[]={1,2,3,4};
        Collections.rotate(Arrays.asList(b),2);
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);
        }
        LinkedHashMap<Integer,Integer> l=new LinkedHashMap<>();
        l.put(0,0);
        l.put(1,1);
        l.clear();
        System.out.println(l.isEmpty());
        int q[]={2,3,4};
        int w[]=Arrays.copyOf(q,q.length);
        for (int i = 0; i <q.length ; i++) {
            System.out.println(w[i]);
        }

        System.out.println("revrse");
        Integer p[]={30,35,40,80,100};
        Arrays.sort(p,0,2,Collections.reverseOrder());
        System.out.println(p[0]);

        Collections.rotate(Arrays.asList(p),3);
    }
}
