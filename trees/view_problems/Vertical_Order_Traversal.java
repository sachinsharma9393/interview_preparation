package trees.view_problems;

import trees.Node;

import java.util.*;

/**
 * Created by sachin on 7/4/2018.
 */
class Pair
{
    Node n;
    int distance;
    Pair(int distance, Node root)
    {
        this.distance=distance;
        n=root;
    }
}
public class Vertical_Order_Traversal {
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
         findVerticalOrder(root);
    }

    public static TreeMap findVerticalOrder(Node root) {
        TreeMap<Integer,Vector<Node>>t=new TreeMap<>();
        //depending upon question some wants from level wise verticla views
        //for that take LinkedHashMap otherwise from leftmost to write as top/bottom take TreeMap as it is sorted
        if(root==null) System.out.println("NULL TREE");
        else {

            //treemap because it stores sorted order of keys
            int d=0;//initial distance of root is 0;
            Queue<Pair>q=new LinkedList<>();//Pair because for everynode we need to have its horizontal distance from root
            q.offer(new Pair(d,root));
            Vector<Node>val = new Vector<>();   //for every key entry we will have a vector of values so as to have multimap
            val.add(root);
            t.put(0,val);
            //now same as always perform level order traversal
            while(!q.isEmpty())
            {
                int loop=q.size();

                for (int i = 0; i <loop ; i++) {
                    Pair p=q.poll();
                    Node temp=p.n;
                    int h_distance=p.distance;

                    if(temp.left!=null)
                    {
                        q.offer(new Pair(h_distance-1,temp.left));
                        if(t.containsKey(h_distance-1))
                        {
                            t.get(h_distance-1).add(temp.left);
                        }
                        else {
                            Vector<Node> v=new Vector<>();
                            v.add(temp.left);
                            t.put(h_distance-1,v);
                        }
                    }
                    if(temp.right!=null)
                    {
                        q.offer(new Pair(h_distance+1,temp.right));
                        if(t.containsKey(h_distance+1))
                        {
                            t.get(h_distance+1).add(temp.right);
                        }
                        else {
                            Vector<Node> v=new Vector<>();
                            v.add(temp.right);
                            t.put(h_distance+1,v);
                        }
                    }
                }
            }
            //now after filling treemap lets print its values


            System.out.println(" VERTICAL ORDER TRAVERSAL ");
            Set s=t.keySet();
            Iterator i=s.iterator();
           while (i.hasNext())
           {
               int k=(int)i.next();
               Vector<Node>v=t.get(k);
               System.out.print(" key is " + k+"\t\t");
               System.out.print(" VALUES ARE ");
               for (int j = 0; j <v.size() ; j++) {
                   System.out.print(v.get(j).data+"\t");
               }
               System.out.println();
           }

//vertical order traversal is necessary for top,bottom,left,right view
            Object[] v=t.values().toArray();
            for (Object f:v
                 ) {
                Node temp= (Node) f;
                System.out.println(temp.getData());
            }


        }

        return t;
   }

}
