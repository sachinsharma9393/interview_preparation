
package trees.BST;

/**
 * Created by sachin on 7/3/2018.
 */
public class Deleting_Node {
    public static void main(String[] args) {
        Bst_Node root=new Bst_Node(10);
        Bst_Node.insert(23,root);
        Bst_Node.insert(7,root);
        Bst_Node.insert(5,root);
        Bst_Node.insert(1,root);
        Bst_Node.insert(9,root);
        System.out.println("SEEING WHETHER INSERTED CORRECT BY DOING INORDER TRAVERSAL WHICH SHOULD BE SORTED");
        inorder(root);

       // delete(root,5);//having 1 child case
        delete(root, 9);//leaf case
        System.out.println("after deleting 9 ");inorder(root);
        delete(root, 1);//having 2 child case
        System.out.println("after deleting 1 ");inorder(root);

    }

    private static Bst_Node delete(Bst_Node root, int key) {

        if(root==null)return root;
        else
        {
            if(root.data>key)
                root.left=delete(root.left,key);
            if(root.data<key)
                root.right=delete(root.right,key);

            if(root.data==key)
            {
                if(root.right==null&&root.left==null )return null;//nop child
                //case 1 having no child or 1 child
                else if(root.left==null)return root.right;
                else if(root.right==null)return root.left;


                //case 3 having both child

              else {
                    Bst_Node p = root.right;
                    while (p.left != null) p = p.left;//inorder succesor step
                    p.left = root.left;
                    return root.right;
                }

            }



        }


    return root;}

    private static int successor(Bst_Node right) {
        int min=0;
        Bst_Node temp=right;
        while(temp.left!=null)
        {
            temp=temp.left;
        }
        return temp.data;

    }

    private static void inorder(Bst_Node root) {
    if(root!=null)
    {
        inorder(root.left);
        System.out.print(root.data+"\t");
        inorder(root.right);
    }
    }


}
/*
/*
Bst_Node p, p2, n;
if (root.data == data)
        {
        Bst_Node lt;
        Bst_Node rt;
        lt = root.left;
        rt = root.right;
        if (lt == null && rt == null)
        return null;
        else if (lt == null)
        {
        p = rt;
        return p;
        } else if (rt == null)
        {
        p = lt;
        return p;
        } else
        {
        p2 = rt;
        p = rt;
        while (p.left != null)
        p = p.left;
        p.left=lt;
        return p2;
        }
        }
        if (data < root.data)
        {
        n = delete(root.left, data);
        root.left=(n);
        } else
        {
        n = delete(root.right, data);
        root.right=(n);
        }*/