package string;
import java.util.*;
/**
 * Created by sachin on 6/20/2018.
 */
public class Max_occuring_char {
    public static void main(String[] args) {
        
		//4 methods 
		//m-1 brute force storing counts and comapring ,two variables maxchar,max count   0(n2) appraoch
		// m-2 sorting and compare through adjacent and storing in 2 variables maxchar,max count  0(n log n)
		//m-3 try to make balanced bst and maintain count on that node (n log n for making balanced  + space 0(n)
		//m-4 Linked hash map appraoch    0(n) time and space
		
		
		String s="sachinsharma";
		LinkedHashMap<Character,Integer> l=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char t=s.charAt(i);
			if(l.containsKey(t))
			{
				int val=l.get(t);
				l.replace(t,val,val+1);
			}
			else l.put(t,1);
			
		}
		
		Set  st=l.keySet();
		Iterator i=st.iterator();
		char c=0;int max=0;
		while(i.hasNext())
		{
			char key=(char)i.next();
			int val=l.get(key);
			if(val>max)
			{
				max=val;
				c=key;
			}
			
		}
		System.out.println("max occuring character is  "+c+" and its count is "+max);
		
		
		
		
    }
}
