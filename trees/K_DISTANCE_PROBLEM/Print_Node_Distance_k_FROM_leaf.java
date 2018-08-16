package trees;

/**
 * Created by sachin on 7/7/2018.
 */
public class Print_Node_Distance_k_FROM_leaf {
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
        int k=1;//means 1 distance from leaf

        //using same concep of storing path in array and printing path[k]
        int path[]=new int[10];
        print_K_from_leaf(root,k,path,0);

    }

    private static void print_K_from_leaf(Node root, int k, int[] path, int index) {
            if(root==null)return;
        else
            {
                path[index]=root.data;
                //if index++ here then at print path[index-k-1] bcoz index starts from 0
                if(root.left==null &&root.right==null)
                {
                    System.out.print(k + " distance away from " + root.data + " is \t");
                    print_node_k_away(path,k,index);
                }
                else
                {
                    index++;
                    print_K_from_leaf(root.left,k,path,index);
                    print_K_from_leaf(root.right,k,path,index);
                }
            }
    }

    private static void print_node_k_away(int[] path, int k, int index) {
        System.out.println(path[index - k]);
    }
}
