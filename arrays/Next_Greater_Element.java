package arrays;
import java.util.*;
/**
 * Created by sachin on 6/21/2018.
 */
public class Next_Greater_Element {
    public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();



		StringBuilder sb=new StringBuilder(String.valueOf(n));
        System.out.println(sb);
        boolean b=false; int index=0;
		for(int i=sb.length()-1;i>0;i--)
		{
			//concept is see a[i-1]<a[i] means left digit is less than right digit 
			
			if((int)sb.charAt(i-1)<(int)sb.charAt(i))
			{

                b=true;//means found such index
				index=i;
				
			}
		}

        if(!b)System.out.println("NO NEXT GREATER AMONG THE DIGITS");
		else
		{
			//since we got index...find max in index to length and swap it 
			int l=index;int r=sb.length();
			char c[]=sb.toString().toCharArray();
			Arrays.sort(c,l,r);

            char temp=c[l-1];
            c[l-1]=c[l];
            c[l]=temp;

            System.out.println(Arrays.toString(c));

        }

    }
}
