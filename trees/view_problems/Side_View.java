package trees;

import java.util.*;

/**
 * Created by sachin on 7/4/2018.
 */
public class Side_View {
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
        Node.insert(13,root);
        Node.insert(14,root);
        Node.insert(15,root);
        left_side_view(root);
        right_side_view(root);

    }

    private static void right_side_view(Node root) {
        // level order ,print last node per level
		Queue<Node>q=new LinkedList<>();
        System.out.println("PRINTING RIGHT SIDE VIEW OF GIVEN TREE");
        if(root==null)return;
		else
		{
			q.offer(root);
			while(!q.isEmpty())
			{
				
				int loop=q.size();
				for(int i=0;i<loop;i++)
				{
					Node temp=q.poll();
					if(i==loop-1)//printing last value per level so as to view from right side
					{
						System.out.println(temp.data);
					}
					if(temp.left!=null)q.offer(temp.left);
					if(temp.right!=null)q.offer(temp.right);
					
				}
			}
		}

    }

    private static void left_side_view(Node root) {
        //in level order traversal print first node per level
		Queue<Node>q=new LinkedList<>();
        System.out.println("PRINTING LEFT SIDE VIEW OF GIVEN TREE ");
        if(root==null)return;
		else
		{
			q.offer(root);
			while(!q.isEmpty())
			{
				
				int loop=q.size();
				for(int i=0;i<loop;i++)
				{
					Node temp=q.poll();
					if(i==0)//printing from left side means first index per level
					{
						System.out.println(temp.data);
					}
					if(temp.left!=null)q.offer(temp.left);
					if(temp.right!=null)q.offer(temp.right);
					
				}
			}
		}

    }
}
