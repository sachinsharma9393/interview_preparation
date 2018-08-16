package trees.view_problems;

import trees.Node;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

/**
 * Created by sachin on 7/4/2018.
 */
public class Diagonal_problem {
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
        diagonal_view(root);
    }

    private static void diagonal_view(Node root) {
        if(root==null)
            return;
        else
        {
            LinkedHashMap<Integer,Vector<Integer>>distance_to_nodes=new LinkedHashMap<>();
            Queue<Node>q=new LinkedList<>();
            q.offer(root);
            int loop=q.size();
            for (int i = 0; i <loop ; i++) {

            }
        }
    }
}
