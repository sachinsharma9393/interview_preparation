package backtracking;



import java.util.TreeSet;

/**
 * Created by sachin on 8/17/2018.
 */
public class String_Permutation {
    static TreeSet<String> tm=new TreeSet<>();
    static String cmp=null;
    public static void main(String[] args) {
        String s="abcd";
        cmp=s;
        permute(s);
        System.out.println(tm);
    }

    private static void permute(String s) {
        int k=s.length();
        tm.add(s);
        for(int i=0;i<k;i++)
        {

            char h=s.charAt(i);
            StringBuilder sb=new StringBuilder(s);
            sb.deleteCharAt(i);
            sb.append(h);
            String e=sb.toString();
            if(e.equals(cmp)||tm.contains(e))return;
            else permute(sb.toString());



        }
    }
}
