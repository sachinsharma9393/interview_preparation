package gfg;

/**
 * Created by sachin on 7/19/2018.
 */
import java.util.Scanner;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
class Binary_to_circular_list{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==0){
                System.out.println(0);
                continue;
            }
            Node root = null;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                int a1=sc.nextInt();
                char lr=sc.next().charAt(0);
                if(i==0){
                    root=new Node(a);
                    switch(lr){
                        case 'L':root.left=new Node(a1);
                            break;
                        case 'R':root.right=new Node(a1);
                            break;
                    }
                }
                else{
                    insert(root,a,a1,lr);
                }
            }
            //inorder(root);
            GfG_ g=new GfG_();
            root =  g.bTreeToClist(root);

            Binary_to_circular_list tn = new Binary_to_circular_list();
            tn.displayCList(root);


                /* inorder(root);
                 System.out.println();*/

        }
    }
    public static void insert(Node root,int a,int a1,char lr){
        if(root==null){
            return;
        }
        if(root.data==a){
            switch(lr){
                case 'L':root.left=new Node(a1);
                    break;
                case 'R':root.right=new Node(a1);
                    break;
            }
            return;
        }
        insert(root.left,a,a1,lr);
        insert(root.right,a,a1,lr);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    void displayCList(Node head)
    {
        Node itr = head;
        do
        {
            System.out.print(itr.data + " ");
            itr = itr.right;
        } while (head!=itr);
        System.out.println();
        itr=itr.left;
        do{
            System.out.print(itr.data + " ");
            itr=itr.left;
        }while(head!=itr);
        System.out.println(itr.data + " ");
    }
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/
//User function Template for Java
/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class GfG_
{
    int a[]=new int[101];
    int index=0;
    Node stack[]=new Node[101];
    int top=0;
    Node bTreeToClist(Node root)
    {
        //your code here
        if(root==null)return null;

        // stack[top++]=root;
        Node c=root;
        while(top!=0 || c!=null)
        {
            if(c!=null)
            {
                stack[top++]=c.left;
                c=c.left;
            }
            else
            {
                Node t=stack[top--];
                a[index++]=t.data;
                c=t.right;

            }
        }
        Node t=root;
        for(int i=1;i<index;i++)
        {
            Node g=new Node(a[i]);
            t.right=g;
            g.left=t;
            t=t.right;

        }
        t.right=root;
        root.left=t;
        return root;
    }

}