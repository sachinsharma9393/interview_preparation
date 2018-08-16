package string;

import java.util.*;


/**
 * Created by sachin on 6/21/2018.
 */
public class First_Non_repeating_character {

    public static void main(String[] args) {
        //brute force   n2 approach
        //hash approach
        String s="kxiksxjecwmkwabhsl";
        LinkedHashMap<Character,Integer>v=new LinkedHashMap<>();

        v.put(s.charAt(0),0);
        char i_ret=0;
        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(v.containsKey(ch))
            {
                int val=v.get(ch);
                v.replace(ch,val,val+1);

            }
            else v.put(ch,0);
        }
        Set sk=v.keySet();
        Iterator it=sk.iterator();
        while(it.hasNext())
        {
            char k=(char)it.next();
            System.out.println("k--" + k + " val--" + v.get(k));
            if(v.get(k)>0){
                i_ret=k;break;
            }
        }
        System.out.println(i_ret);

    }
}
