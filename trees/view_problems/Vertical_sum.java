package trees.view_problems;

import trees.Node;

import java.util.*;

/**
 * Created by sachin on 7/2/2018.
 */
public class Vertical_sum {
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
        //first get vertical tree order traversal and then sum them occordingly to  key value
        TreeMap<Integer,Vector<Node>>l=Vertical_Order_Traversal.findVerticalOrder(root);
        find_verticalsum(l);
    }

    private static void find_verticalsum(TreeMap<Integer, Vector<Node>> l) {
    //sum all the values to a particular key
        Set s=l.keySet();
        Iterator i=s.iterator();
        System.out.println("**VERTICAL SUM**");
        while(i.hasNext())
        {
            int key=(int)i.next();
            System.out.print("vertical sum of " + key +" " +
                    "is \t");
           // System.out.print(Collections.addAll(l.get(key)));
        }
        System.out.println();
    }
}
