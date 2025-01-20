package datastructure.trees;

public class MaxHeightOfTree {
static Node node;
    public static void main(String[] args) {
        node = new Node(5);
        node.left = new Node(6);
        node.right=new Node(9);
        node.left.left=new Node(4);
        node.left.right = new Node(1);
        node.right.left=new Node(3);
        node.right.right=new Node(90);
        node.right.left=new Node(95);
        node.right.left.left=new Node(65);
        System.out.println(getHeight(node));
    }

    public static int getHeight(Node node)
    {
        int left=0;
        int right=0;
        if(node.left!=null)
        {
           left =  getHeight(node.left);
        }
        if(node.right!=null)
        {
          right =  getHeight(node.right);
        }
        int height=1+Math.max(left,right);
        return height;
    }

}
