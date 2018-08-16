package trees.view_problems;

import trees.Node;
import trees.view_problems.Vertical_Order_Traversal;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

/**
 * Created by sachin on 7/4/2018.
 */
public class Top_View {
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
        TreeMap<Integer,Vector<Node>>g= Vertical_Order_Traversal.findVerticalOrder(root);
        topview(g);

    }

    private static void topview(TreeMap<Integer, Vector<Node>> g) {
    //top view corresponds to first element of every key of treemap
        System.out.println(" TOP VIEW OF THIS TREE INCLUDE ");
        Set s=g.keySet();
        Iterator i=s.iterator();
        while(i.hasNext())
        {
            int key=(int)i.next();
            System.out.println(g.get(key).get(0).data);//first element of vector of particular key
        }
    }
}
