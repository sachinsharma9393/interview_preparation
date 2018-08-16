package arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by sachin on 7/12/2018.
 */
public class Smallest_no_not_formed_from_array_elements_sum {
    public static void main(String[] args) {
        Integer a[]={4,13,2,3,1};
        //we have to see which value smallest is not formed by array elements
        //initially say p=1 is not formed
        //sort the array or if question is sorted array

        Arrays.sort(a);
        int p=1;
        for (int i = 0; i <a.length ; i++) {
        if(p>=a[i])p+=a[i];
            else break;
        }
        System.out.println(p);
    }
}
