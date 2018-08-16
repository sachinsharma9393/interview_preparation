package trees.view_problems;

import trees.Node;
//import trees.Vertical_Order_Traversal;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

/**
 * Created by sachin on 7/4/2018.
 */
public class Bottom_View {
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
        TreeMap<Integer,Vector<Node>> g= Vertical_Order_Traversal.findVerticalOrder(root);
        bottomview(g);

    }

    private static void bottomview(TreeMap<Integer, Vector<Node>> g) {
            Set s=g.keySet();
        System.out.println(" BOTTOM VIEW OF ABOVE TREE ");
        Iterator i=s.iterator();
        while(i.hasNext())
        {
            int key=(int)i.next();
            System.out.println(g.get(key).lastElement().getData());
        }
    }
}
