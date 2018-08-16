package gfg;

/**
 * Created by sachin on 7/26/2018.
 */

//Code by Saksham Raj Seth
        import java.io.*;
        import java.util.*;
class Graph{
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int v = in.nextInt();
            int e = in.nextInt();
            LinkedList<Integer>[] alist = new LinkedList[v];
            for(int i=0;i<v;i++) alist[i] = new LinkedList<Integer>();
            while(e-->0) {
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                alist[n1].add(n2);
                alist[n2].add(n1);
            }
            Cycle_Undirected g = new Cycle_Undirected();
            if(g.isCyclic(v,alist)) {
                System.out.println(1);
            }
            else
                System.out.println(0);
        }
    }
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class Cycle_Undirected
{
    Boolean isCyclic(int V,LinkedList<Integer>[] alist)
    {
        //add code here.
        int c=0;
        Vector<Integer>[] blist= new Vector[V];

        for(int i=0;i<V;i++)
        {
            LinkedList<Integer>l=alist[i];
            blist[i]=new Vector<>();
            for(int j=0;j<l.size();j++)
            {
                int e=l.get(j);
                if(!blist[i].contains(e))
                blist[i].add(e);
            }

        }


        for(int i=0;i<V;i++)
        {

            Vector l=blist[i];
            //case -1 self loop

            for(int j=0;j<l.size();j++)
            {
                if((int)l.get(j)==i)return true;//self loop
            }
            if(l.size()%2==1 &&l.size()>=3)return true;
        }
        return false;

    }

}