package arrays;

/**
 * Created by sachin on 6/18/2018.
 */
public class Equilibrium_Index {
    public static void main(String[] args) {
       //2 methods
	   // m-1 brute force appraoch is check for every index and then comapare for all - 0(n2)complexity
	   //m-2 0(n) time ans space  appraoch using left sum array amd right sum array
        //m-3 0(n) time and space 0(1) maintaing 2 variables
	   int a[]={10,5,15,3,4,21,2};
	   //make l_sum array
	   int n=a.length;
	   int ls[]=new int[n];
	   int rs[]=new int[n];
	   ls[0]=a[0];
        rs[n-1]=a[n-1];//last element
	   for(int i=1;i<n;i++)
	   {
		   
		   ls[i]=ls[i-1]+a[i];//filling from left side
           rs[(n-1)-i]=a[(n-1)-i]+rs[n-i];//filling from right side
	   }
        /*for (int x:ls
             ) {
            System.out.print(x+"\t");

        }
        System.out.println();
        for (int x:rs
             ) {
            System.out.print(x+"\t");
        }*/

        for (int i = 0; i <n-1 ; i++) {
            if(ls[i]==rs[i+1])
            {
                System.out.println("equilibrium index using m-2 is " + i);
            }
        }
        int lsum=0,sum=0;
        for (int i = 0; i <n ; i++) {
            sum+=a[i];
        }
        for(int i=0;i<n;i++)
        {
            lsum+=a[i];//this will show all sum to left of i including i
            sum-=a[i];//this is sum of all elements to right of index of i
            if(lsum==sum)
            {
                System.out.println("using method -3 FOUND EQUILIBRIUM INDEX AT i= " + i);//means 0--i ,i+1 to last index
                break;

            }

        }


    }
}
