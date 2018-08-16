package gfg;

/**
 * Created by sachin on 7/14/2018.
 */

        import java.util.*;
class TreeNode
{
    int key;
    TreeNode left, right;
    public TreeNode(int key)
    {
        this.key = key;
        left = right = null;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            TreeNode root = null;
            if(n==0){
                System.out.println();
                continue;
            }
            for(int i=0;i<n;i++){
                int a1=sc.nextInt();
                int a2=sc.nextInt();
                char ch=sc.next().charAt(0);
                if(root==null){
                    root=new TreeNode(a1);
                    switch(ch){
                        case 'L':root.left=new TreeNode(a2);
                            break;
                        case 'R':root.right=new TreeNode(a2);
                            break;
                    }
                }
                else{
                    insert(root,a1,a2,ch);
                }
            }
            GfG g = new GfG();
            g.printTopView(root);
            System.out.println();
        }
    }
    public static void insert(TreeNode root,int a1,int a2,char ch){
        if(root==null)
            return;
        if(root.key==a1){
            switch(ch){
                case 'L':root.left=new TreeNode(a2);
                    break;
                case 'R':root.right=new TreeNode(a2);
                    break;
            }
        }
        else{
            insert(root.left,a1,a2,ch);
            insert(root.right,a1,a2,ch);
        }
    }
}



/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below
Node is as follows
class TreeNode
{
    int key;
    TreeNode left, right;
    public TreeNode(int key)
    {
        this.key = key;
        left = right = null;
    }
}*/
class Pair
{
    TreeNode n;
    int d;
    Pair(TreeNode n,int d)
    {
        this.n=n;
        this.d=d;
    }
}
class GfG
{
    public void printTopView(TreeNode root)
    {
        //add code here.
        if(root==null)return;
        else
        {
            LinkedHashMap<Integer,Vector<Integer>>map=new LinkedHashMap<>();
            Queue<Pair>q=new LinkedList<>();
            q.offer(new Pair(root,0));
            Vector<Integer> k=new Vector();
            k.add(root.key);
            map.put(0,k);
            while(!q.isEmpty())
            {
                int loop=q.size();
                for(int i=0;i<loop;i++)
                {
                    Pair p=q.poll();
                    TreeNode t=p.n;
                    int dw=p.d;
                    if(t.left!=null)

                    {

                        q.offer(new Pair(t.left,dw-1));
                        if(map.containsKey(dw-1))
                        {
                            map.get(dw-1).add(t.left.key);
                        }
                        else
                        {
                            Vector<Integer>v=new Vector<>();
                            v.add(t.left.key);
                            map.put(dw-1,v);
                        }
                    }
                    if(t.right!=null)
                    {
                        q.offer(new Pair(t.right,dw+1));
                        if(map.containsKey(dw+1))
                        {
                            map.get(dw+1).add(t.right.key);
                        }
                        else
                        {
                            Vector<Integer>v=new Vector<>();
                            v.add(t.right.key);
                            map.put(dw+1,v);
                        }

                    }
                }

            }
            Set s=map.keySet();
            Iterator it=s.iterator();
            while(it.hasNext())
            {
                int key=(int)it.next();
                System.out.print(map.get(key).get(0)+" ");
            }

        }

    }
}