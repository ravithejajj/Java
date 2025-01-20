package datastructure.trees;

import java.util.*;

public class LevelOrderTraversal {
   static  List<Node> list = new ArrayList();
   static Node node;
   public static void LevelOrder()
   {
       Deque<Node> deque = new ArrayDeque();
       if (node != null)
       {
           deque.add(node);
       }
       while(!deque.isEmpty())
       {
           Node temp = deque.poll();
           if(temp.left!=null&&temp.right!=null) {
               deque.add(temp.left);
               deque.add(temp.right);
           }
           System.out.println(temp.value);
       }
   }
   public static void IterativePreOrderTraversal()
   {
       Deque<Node> deque = new ArrayDeque();
       deque.add(node);
       while(!deque.isEmpty())
       {
           Node temp = deque.poll();
           System.out.println(temp.value);
          if(temp.left!=null&& temp.right!=null){
              deque.addFirst(temp.right);
              deque.addFirst(temp.left);
          }
       }
   }
    public static void IterativeInOrderTraversal()
    {
        Deque<Node> deque = new ArrayDeque();
        deque.add(node);
        while(node!=null)
        {
            if(node.left!=null){
                deque.add(node.left);
                node=node.left;
                continue;
            }

             if(node.right!=null){
                deque.add(node.right);
                node=node.right;
            }
        else if(node.left==null && node.right==null)
        {
            node = deque.removeLast();
            node.left=null;
            System.out.println(node.value);

        }

    }}

    public static void IterativePostOrderTraversal() {
       Stack<Node> stack1 = new Stack<>();
       Stack<Node> stack2 = new Stack<>();
       stack1.push(node);
       while(true)
       {

           Node temp = stack1.pop();
           stack2.push(temp);
           if(temp.left!=null) {
               stack1.push(temp.left);
           }
           if(temp.right!=null) {
               stack1.push(temp.right);
           }
           if(stack1.isEmpty())
           {
               break;
           }
       }
            while(!stack2.isEmpty())
               {
                   System.out.println(stack2.pop().value);
               }
    }
    public static void printBoundaries()
    {
        Node temp = node;
        list.add(temp);
        while (temp.left != null)
        {
            if(temp.left.left==null && temp.left.right==null)
            {
                break;
            }

            temp=temp.left;
            list.add(temp);

        }
        printLeafNodes(node);
        printRight();
        list.stream().map(e->e.value).forEach(System.out::println);
    }
    public static void printRight()
    {
        Stack<Node> stack = new Stack<>();
        Node temp = node;
        while (temp.right != null)
        {
            if(temp.right.left==null && temp.right.right==null)
            {
                break;
            }
            temp=temp.right;
            stack.add(temp);
        }
        while(!stack.isEmpty())
        {
            list.add(stack.pop());
        }

    }
    static void printLeafNodes(Node node)
    {

        // If node is null, return
        if (node == null)
            return;

        // If node is leaf node, print its data
        if (node.left == null &&
                node.right == null)
        {
            list.add(node);
         //   System.out.print(node.value + " ");
            return;
        }

        // If left child exists, check for leaf
        // recursively
        if (node.left != null)
            printLeafNodes(node.left);

        // If right child exists, check for leaf
        // recursively
        if (node.right != null)
            printLeafNodes(node.right);
    }

    public static void main(String[] args) {
 node = new Node(5);
node.left = new Node(6);
node.right=new Node(9);
node.left.left=new Node(4);
node.left.right = new Node(1);
node.right.left=new Node(3);
node.right.right=new Node(90);
       /* System.out.println("=================level====================");
        LevelOrder();
        System.out.println("=================preOrder====================");
        IterativePreOrderTraversal();
        System.out.println("============IterativePostOrderTraversal=============");*/
       // IterativePostOrderTraversal();
        printBoundaries();

    }



}

class Node
{
    Node left;
    Node right;
    int value;
    Node(int value)
    {
        this.value=value;
    }
}
