package trees.view_problems;

import trees.Node;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by sachin on 7/8/2018.
 */
class sPair
{
    Node r;
    int d;
    sPair(Node r, int d)
    {
        this.d=d;
        this.r=r;
    }
}
public class Diagonal_Traversal {
    public static void main(String[] args) {
        Node root=new Node(1);
        Node.insert(2,root);
        Node.insert(3,root);
        Node.insert(4,root);
        Node.insert(5,root);
        Node.insert(6,root);
        Node.insert(7,root);
        Node.insert(8,root);
        Node.insert(9,root);
        Node.insert(10,root);
        Node.insert(11,root);
        Node.insert(12,root);
        Node.insert(13,root);
        Node.insert(14,root);
        Node.insert(15,root);
        find_boundary(root);
    }

    private static void find_boundary(Node root) {

        int d=0;
        Queue<sPair>q=new LinkedList<>();
        LinkedHashMap<Integer,Vector<Integer>>l=new LinkedHashMap<>();
        q.offer(new sPair(root,d));
        Vector<Integer>v=new Vector<>();
        v.add(root.data);
        l.put(0,v);
        while(!q.isEmpty())
        {
            int loop=q.size();

            for(int i=0;i<loop;i++)
            {
                sPair h=q.poll();
                int dis=h.d;
                System.out.print(dis+"\t");
                Node n=h.r;
                System.out.print(n.data);
                System.out.println();
                if(n.left!=null)
                {
                    q.offer(new sPair(n.left,dis-1));
                    if(l.containsKey(dis-1))
                    {
                        l.get(dis-1).add(n.left.data);
                    }
                    else
                    {
                        Vector<Integer>a=new Vector<>();
                        a.add(n.left.data);
                        l.put(dis-1,a);
                    }
                }
                if(n.right!=null)
                {
                    q.offer(new sPair(n.right,dis));
                    if(l.containsKey(dis))
                    {
                        l.get(dis).add(n.right.data);
                    }
                    else {
                        Vector<Node> vs=new Vector<>();
                        vs.add(n.right);
                        l.put(dis,v);
                    }

                }
            }
        }
        System.out.println(" BOUNDRY  ORDER TRAVERSAL ");

        Set s=l.keySet();
        Iterator i=s.iterator();
        while (i.hasNext())
        {
            int k=(int)i.next();
            Vector<Integer> va=l.get(k);
            System.out.print(" key is " + k+"\t\t");
            System.out.print(" VALUES ARE ");
            for (int j = 0; j <va.size() ; j++) {
                System.out.print(va.get(j)+"\t");
            }
            System.out.println();
        }
        List<Vector<Integer>> j= (List<Vector<Integer>>) l.values();
        System.out.println(j.size());
        for(int k=0;k<j.size();k++)
        {
            Vector<Integer>we=j.get(k);
            for(int y=0;y<we.size();y++)
            {
                System.out.println(we.get(y) + " ");
            }
        }
    }
}

