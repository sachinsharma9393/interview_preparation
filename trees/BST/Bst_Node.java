package trees.BST;

import trees.Node;

/**
 * Created by sachin on 7/3/2018.
 */
public class Bst_Node{
    int data;
    Bst_Node left,right;

    Bst_Node(int data)
    {
        this.data=data;
        left=right=null;
    }
    static Bst_Node insert(int data, Bst_Node root)
    {

        if(root!=null)
         {

            if(data>root.data)
            {
                if(root.right==null)
                {
                    root.right=new Bst_Node(data);
                    return root;
                }
                else insert(data,root.right);
            }
            if(data<root.data)
            {
                if(root.left==null)
                {
                    root.left=new Bst_Node(data);
                    return root;

                }
                else insert(data,root.left);
            }


        }
    return root;
    }
}
