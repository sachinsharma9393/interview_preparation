package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by sachin on 7/18/2018.
 */
public class Largest_number_formed_from_array {
    public static void main(String[] args) {
        Integer a[]={3,30,34,5,9};
        Integer b[]={54,546,548,60};
        Collections.sort(Arrays.asList(a), new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                String x=""+o1;
                String y=""+o2;

                return y.compareTo(x);
            }
        });

        Stream.of(a).sorted((x,y)->(""+y+x).compareTo(""+x+y));
       // System.out.println(Stream.of(a).peek(x -> x.intValue()));
        System.out.println("largest number that can be formed from 3,30,34,5,9");
        for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]);
            }
        /*ArrayList<Integer>i=new ArrayList<Integer>(){
            {
                add(1);
                add(2);
            }
        };;*/
        Collections.sort(Arrays.asList(b), new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String x=""+o1;
                String y=""+o2;
                return x.compareTo(y);
            }
        });
        System.out.println();
        System.out.println("smallest number that can be formed from 54,546,548,60");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]);
        }
        StringBuilder sb =new StringBuilder();
        System.out.println("--"+sb.charAt(3));

    }
}
