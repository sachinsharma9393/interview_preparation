package trees.K_DISTANCE_PROBLEM;

import trees.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sachin on 7/4/2018.
 */
public class Print_Node_Distance_k_FROM_ROOT {
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
        int k=3;
        System.out.println("USING LEVEL ORDER ");
        print_K_away_level_order(root,3);
        System.out.println("USING RECURSIVE");
        print_K_away_recursive(root,k,0);
    }

    private static void print_K_away_recursive(Node root, int k, int current_distance_from_root) {
        if(root==null)return;
        else {
            if(current_distance_from_root==k)
            {

                System.out.println("3 distance away node is " + root.data);
                return;
            }

            else {
                print_K_away_recursive(root.left,k,current_distance_from_root+1);
                print_K_away_recursive(root.right,k,current_distance_from_root+1);
            }
        }
    }

    private static void print_K_away_level_order(Node root, int k) {
        if(root==null)return;
        else {
            Queue<Node> q=new LinkedList<>();
            q.offer(root);
            int current_distance_from_root=0;
            while(!q.isEmpty())
            {
                int loop=q.size();

                for (int i = 0; i <loop ; i++) {
                    Node temp=q.poll();
                    if(temp.left!=null)q.offer(temp.left);
                    if(temp.right!=null)q.offer(temp.right);
                }
                current_distance_from_root++;
                if(k==current_distance_from_root)
                {
                    print_queue_elements(q);
                    break;
                }

            }



        }

    }

    private static void print_queue_elements(Queue<Node> q) {
        int loop=q.size();
        for (int i = 0; i <loop ; i++) {
            System.out.println(q.poll().data);
        }
    }
}
