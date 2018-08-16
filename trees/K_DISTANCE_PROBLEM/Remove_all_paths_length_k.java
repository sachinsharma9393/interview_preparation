package trees.K_DISTANCE_PROBLEM;

import trees.Node;

/**
 * Created by sachin on 7/7/2018.
 */
public class Remove_all_paths_length_k {
    public static void main(String[] args) {
        //here removing all path length less thn or equal to k
        //means we have to see all leaves at <=k
        int k = 3;
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(7);
        root.right.right = new Node(6);
        root.right.right.left = new Node(8);
        System.out.println("Inorder Traversal of Original tree");
        trees.Recursive_Tree_Traversals.inorder(root);

        //printInorder(root);
        System.out.println("Inorder Traversal of Modified tree");
        Node res = removeShortPathlessthanK(root, k);
        trees.Recursive_Tree_Traversals.inorder(res);



    }

    private static Node removeShortPathlessthanK(Node root, int k) {

        if(root==null)return null;
        else
        {
            if(root.left==null&&root.right==null&&k==0)
            {
                //remove this node
                return null;

            }
            else if(root.left!=null&&k>0)
               root.left=removeShortPathlessthanK(root.left,k-1);
            else if(root.right!=null&&k>0)
                root.right= removeShortPathlessthanK(root.right,k-1);
            else return root;
        }
return root;
    }
}
