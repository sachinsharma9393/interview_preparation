package arrays;

/**
 * Created by sachin on 7/13/2018.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Arrange_number_to_form_bigger_number {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        String ta[]=new String[t];

        for(int i=0;i<t;i++)
        {
            String ch=  br.readLine();
            int s=Integer.parseInt(ch);
            Vector<String>a=new Vector<>();
            StringTokenizer st=new StringTokenizer(br.readLine()," ");


            for(int j=0;j<s;j++)
            {
                a.add(st.nextToken());

            }

            ta[i]=	find_biggest(a);
        }
        for (int i = 0; i <t ; i++) {
            System.out.println(ta[i]);
        }
    }
    static String find_biggest(Vector<String> a)
    {
        Collections.sort(a,new Comparator<String>()
        {
            public  int compare(String x,String y)
            {
                String xy=x+y;
                String yx=y+x;
                return xy.compareTo(yx)>0?-1:1;
            }
        });
        String s="";
        for(int i=0;i<a.size();i++)
        {
            s+=a.get(i);
        }
        return s;
    }
}

//TEST CASE
/*


2
5
3 30 34 5 9
4
54 546 548 60
Output:

9534330
6054854654
 */