package trees.view_problems;

        import java.util.*;
        import java.util.Map.Entry;
//Tree node
class TreeNode
{
    int data; //node data
    TreeNode left, right; //left and right child's reference
    // Tree node constructor
    TreeNode(int d)
    {
        data = d;
        left = right = null;
    }
}
class DiagonalPrint
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t --  >0 )
        {
            int n=sc.nextInt();
            TreeNode root=null;
            if(n==1)
            {
                int a=sc.nextInt();
                System.out.println(a);
                continue;
            }
            else
            {
                while(n-->0){
                    int n1=Integer.parseInt(sc.next());
                    int n2=Integer.parseInt(sc.next());
                    char lr=sc.next().charAt(0);
                    if(root==null)
                    {
                        root=new TreeNode(n1);
                        switch(lr)
                        {
                            case 'L':
                                root.left=new TreeNode(n2);
                                break;
                            case 'R':
                                root.right=new TreeNode(n2);
                                break;
                        }
                    }
                    else{
                        insert(root,n1,n2,lr);
                    }
                }
            }
            GfG tree = new GfG();
            tree.diagonalPrint(root);
            System.out.println();

        }
    }
    public static void insert(TreeNode root,int n1,int n2,char lr){
        if(root==null)
            return;
        if(root.data==n1){
            switch(lr)
            {
                case 'L':
                    root.left=new TreeNode(n2);
                    break;
                case 'R':
                    root.right=new TreeNode(n2);
                    break;
            }
        }
        else{
            insert(root.left,n1,n2,lr);
            insert(root.right,n1,n2,lr);
        }
    }
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Node is defined as
class TreeNode
{
    int data; //node data
    TreeNode left, right; //left and right child's reference
    // Tree node constructor
    public TreeNode(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/
class Pair_
{
    TreeNode t;
    int d;
    Pair_(TreeNode t, int d)
    {
        this.t=t;
        this.d=d;
    }
}
class GfG
{
    public void diagonalPrint(TreeNode root)
    {
        //add your code here.
        LinkedHashMap<Integer,Vector<Integer>>map=new LinkedHashMap<>();
        Queue<Pair_>q=new LinkedList<>();
        q.add(new Pair_(root,0));
        Vector <Integer>v=new Vector<>();
        v.add(root.data);
        map.put(0,v);
        while(!q.isEmpty())
        {
            int loop=q.size();

            for(int i=0;i<loop;i++)
            {
                Pair_ p=q.poll();
                TreeNode tr=p.t;
                int dt=p.d;
                if(tr.left!=null)
                {
                    q.offer(new Pair_(tr.left,dt+1));
                    System.out.println(tr.left.data);
                    if(map.containsKey(dt+1))
                    {
                        map.get(dt+1).add(tr.left.data);
                    }
                    else
                    {
                        Vector<Integer> vt=new Vector<>();
                        vt.add(tr.left.data);
                        map.put(dt+1,vt);
                        System.out.println(map.get(dt + 1).get(0));
                    }

                }
                if(tr.right!=null)
                {
                    q.offer(new Pair_(tr.right,dt));
                        map.get(dt).add(tr.right.data);
                }
            }
        }

        Set s=map.keySet();
        Iterator it=s.iterator();

       /* while(it.hasNext())
        {
            int k=(int)it.next();
            Vector<Integer> out=map.get(k);
            for(int i=0;i<out.size();i++)
            {
                System.out.print(out.get(i)+" ");
            }


        }*/
        while (it.hasNext())
        {
            int k=(int)it.next();
            Vector<Integer> out=map.get(k);
            System.out.print(" key is " + k+"\t\t");
            System.out.print(" VALUES ARE ");
            for (int j = 0; j <v.size() ; j++) {
                System.out.print(v.get(j)+"\t");
            }
            System.out.println();
        }
    }

}