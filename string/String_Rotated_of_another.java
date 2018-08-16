package string;

import java.util.Vector;

/**
 * Created by sachin on 6/20/2018.
 */
public class String_Rotated_of_another {
    public static void main(String[] args) {
        //m-1 brute force find all rotations and compare n rotations in worst case *n length of string =n2
		//m-2 append main string to itself and see whether string to omapre is a substring of itself

		
		String s="sachin";
		String to_compare="hinsac";
		
		s+=s;
		if(s.contains(to_compare)){   //Also indexOf method works,if index found then -1 else index of starting
			System.out.println("yes rotated");
		}
		else
			System.out.println("NOT ROTATED");
    }
}
