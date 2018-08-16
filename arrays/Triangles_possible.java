package arrays;

import java.util.Arrays;

/**
 * Created by sachin on 7/12/2018.
 */
public class Triangles_possible {
    public static void main(String[] args) {
        int arr[] =   {10, 21, 22, 100, 101, 200, 300};
        //method -1 is naive approach
        //sorting and finding
        Arrays.sort(arr);
        int count=0;
        for (int i = 0; i <arr.length-2 ; i++) {
            int k=i+2;
            for (int j = i+1; j <arr.length ; j++) {
                while(k<arr.length &&arr[i]+arr[j]>arr[k])k++;//k<arr.length otherwise out of bound
                count+=k-j-1;
            }
        }
        System.out.println(count);
    }
}
