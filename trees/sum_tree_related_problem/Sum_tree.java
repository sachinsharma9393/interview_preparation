package trees.sum_tree_related_problem;

import trees.Node;

/**
 * Created by sachin on 7/4/2018.
 */
public class Sum_tree {
    public static void main(String[] args) {
        Node root=new Node(82);
        Node.insert(22,root);
        Node.insert(19,root);
        root.left.left=new Node(6);
        root.left.right=new Node(8);
        root.right.left=new Node(7);
        root.right.right=new Node(5);
        root.left.right.left=new Node(8);
        root.right.left.left=new Node(7);


        System.out.println("root is SUM TREE = ");
        System.out.println( check_sum_tree(root)>0?"SUM-TREE":"NOT A SUM TREE");
        Node root2=new Node(12);
        Node.insert(6,root2);
        Node.insert(4,root2);
        System.out.println("root2 is SUM TREE = ");
        System.out.println(check_sum_tree(root2)>0?"SUM-TREE":"NOT A SUM TREE");

    }

    private static int check_sum_tree(Node root) {
        if(root==null)return 1;
        else {
            if(root.getLeft() ==null && root.getRight() ==null)return root.getData();
            else {
               // System.out.println("here");
                int lsum,rsum;
                if(root.getLeft()!=null)
                lsum=check_sum_tree(root.getLeft());
                else lsum=0;
                if(root.getRight()!=null)
                rsum=check_sum_tree(root.getRight());
                else rsum=0;
              //  System.out.println("lsum at " + root.getData() + " is " + lsum + " and right sum is " + rsum);
                if(lsum+rsum== root.getData())
                {

                    return 2* root.getData();
                }

                else return 0;

            }



        }

    }
}
