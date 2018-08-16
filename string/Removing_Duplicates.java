package string;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Stream;

/**
 * Created by sachin on 6/20/2018.
 */
public class Removing_Duplicates {

    public static void main(String[] args) {
        //m-1 for every element check in array whether it is present or not 0(n2)
		//m-2 maintain an output array and hash so as to reduce searching time of 0(n) to 0(1)
		// m-3 in that same array maintain hash as well keep repeated at one side and non-repeated at one side 
		//m-4 string builder remove
		//LinkedHashSet in java maintains order and no duplicates		
		
		String s="gaadbbaaggaij";      //output should be gadbij
		StringBuilder sb=new StringBuilder(s);
		LinkedHashMap<Character,Integer> l=new LinkedHashMap<>();
		l.values().stream().filter(x->x>=1).count();

		for(int i=0;i<sb.length();i++)
		{
			char t=sb.charAt(i);
			if(l.containsKey(t))sb.deleteCharAt(i);
            else l.put(t,0);
			
			
		}
		System.out.println(sb);
		

        LinkedHashSet<Character> h=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			h.add(s.charAt(i));
			
		}
		
		System.out.println(h);



        //m-3 only hash table processing in array by dividing into repeated and non repeated
		
		int index=-1;
		//take hashtable
        StringBuilder b=new StringBuilder(s);
		Hashtable<Character,Integer>ht=new Hashtable<>();
		for(int i=0;i<s.length();i++)
		{
			char temp=b.charAt(i);
			if(ht.containsKey(temp)){
				if(index==-1) {
                    index = i;
                }

			}
			else
			{
                ht.put(temp,0);
				if(index>-1)//means we have got already some duplicates and we have to swap now with element of i,index
				{
					char swap=b.charAt(index);
                    b.setCharAt(index,b.charAt(i));
					b.setCharAt(i,swap);
                    index++;

				}
			}
		}
        System.out.println(b.substring(0,index));//as 1 index of last will also be incremented of index ++ thats till index-1 string

        System.out.println("first part is not repeated and second is repeated part "+b);


    }
}
