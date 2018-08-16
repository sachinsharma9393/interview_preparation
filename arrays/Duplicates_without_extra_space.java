package arrays;

/**
 * Created by sachin on 6/19/2018.
 */
public class Duplicates_without_extra_space {
    public static void main(String[] args) {
        //numbers should be in range 0----n-1
        int a[]={1,2,3,4,2,6,1,1,2,3,0,0};
        for (int i = 0; i <a.length ; i++) {
            if(a[Math.abs(a[i])]>0)
                a[Math.abs(a[i])]=-1*(a[Math.abs(a[i])]);
            else System.out.println(Math.abs(a[i])+"is repeating");
        }

    }
}
