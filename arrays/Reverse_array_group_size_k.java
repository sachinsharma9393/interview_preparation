package arrays;
import java.util.*;
/**
 * Created by sachin on 6/19/2018.
 */
public class Reverse_array_group_size_k {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();

        }
        System.out.println("enter group size ");
        int k=sc.nextInt();
        for (int i = 0; i <n ; i+=k) {
            int j=i+k-1;
            if(j>n-1)//condition for last group whether having complete k elements or not by checking if array exceeds bounds or not
            {
                j=i+(n%k)-1;//bcoz index starts from 0
            }
            int l=i,r=j;

            while(l<r)
            {
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;
                r--;
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(a[i]+"\t");
        }

    }
}
