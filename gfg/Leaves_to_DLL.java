package gfg;

/**
 * Created by sachin on 7/19/2018.
 */
import java.util.Scanner;
class Nodea
{
    int data;
    Nodea left,right;
    Nodea(int d){
        data=d;
        left=right=null;
    }
}
class Leaves_to_DLL
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==0){
                System.out.println(0);
                continue;
            }
            Nodea root = null;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                int a1=sc.nextInt();
                char lr=sc.next().charAt(0);
                if(i==0){
                    root=new Nodea(a);
                    switch(lr){
                        case 'L':root.left=new Nodea(a1);
                            break;
                        case 'R':root.right=new Nodea(a1);
                            break;
                    }
                }
                else{
                    insert(root,a,a1,lr);
                }
            }
            Nodea head = null;
            //inorder(root);
            GfGM g=new GfGM();
            root = g.convertToDLL(root);
            g.pritntDLL();
            System.out.println();

            // System.out.println(g.tilt(root));
        }
    }
    public static void insert(Nodea root,int a,int a1,char lr){
        if(root==null){
            return;
        }
        if(root.data==a){
            switch(lr){
                case 'L':root.left=new Nodea(a1);
                    break;
                case 'R':root.right=new Nodea(a1);
                    break;
            }
            return;
        }
        insert(root.left,a,a1,lr);
        insert(root.right,a,a1,lr);
    }
    public static void inorder(Nodea root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
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
Nodea defined as
class Nodea{
    int data;
    Nodea left,right;
    Nodea(int d){
        data=d;
        left=right=null;
    }
}
*/
class GfGM
{
    Nodea v[]=new Nodea[1000001];
    int f=-1;int r=-1;
    int out[]=new int[1000001];
    int index=0;
    Nodea head=null;
    void pritntDLL()
    {
        if(head==null)return;
        Nodea p=head;
        System.out.print(p.data+" ");
        while(p.right!=null)
        {
            p=p.right;
            System.out.print(p.data+" ");
        }
    }
    Nodea convertToDLL(Nodea root)
    {
        //your code here

        v[0]=root;
        f++;r++;
        while(f<=r )
        {
            int loop=r-f+1;
            for(int i=0;i<loop;i++) {
                Nodea temp = v[f++];
                if (temp != null) { //  System.out.print(temp.data + "\t");
                    //now put its left first then right
                    if (temp.right != null) v[r++] = (temp.right);
                    if (temp.left != null) v[r++] = (temp.left);
                    if (temp.left == null && temp.right == null) {
                        out[index++] = temp.data;
                    }
                }
            }
        }
        // 0 to index;
        head=new Nodea(out[0]);
        Nodea p=head;
        for(int i=1;i<index;i++)
        {
            Nodea g=new Nodea(out[i]);
            p.right=g;
            g.left=p;
            p=p.right;
        }


        return head;
    }
}

