package string;

/**
 * Created by sachin on 8/9/2018.
 */
public class String_Regex {
    public static void main(String[] args) {
        String s="aaaassd";
        System.out.println(s.matches("ssd"));
        System.out.println(s.contains("ssd"));
        StringBuilder sb=new StringBuilder("122334");
        sb.replace(3,5,"1233444444");
        sb.delete(1,7);
        System.out.println(sb);

    }
}
