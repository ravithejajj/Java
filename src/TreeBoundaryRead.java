import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeBoundaryRead {
   static Node head;
   static List<Integer> list = new ArrayList<Integer>();

   public static void boundaryTraversal()
   {

   }
   public static void leftTraversalExcludingLeaf()
   {
       Node temp = head;
       while(temp!=null)
       {
           if(temp.left.left==null && temp.left.right==null)
           {
            break;
           }
           list.add(temp.value);
           temp =temp.left;
       }
   }
   public static void leafNodeTraversal()
   {
       Stack<Node> stack1 = new Stack<>();
       Stack<Node> stack2 = new Stack<>();
        Node temp = head;
        stack1.push(temp);
       while(true)
       {
         if(stack1.isEmpty())
         {
             break;
         }
           Node temp1 = stack1.pop();
           stack2.push(temp1);
           if(temp1.left!=null)
           {
               stack1.push(temp1.left);
           }
           if(temp1.right!=null)
           {
               stack1.push(temp1.right);
           }

       }
   }



  public static void main(String[] args) {
    head = new Node(4);
    head.left=new Node(5);
    head.right = new Node(7);
    head.left.left=new Node(9);
    head.left.right = new Node(10);
    head.right.left = new Node(11);
    head.right.right = new Node(23);
    }


}
class Node{
    Node left;
    Node right;
    int value;
    Node(int value)
    {
        this.value=value;
    }
}