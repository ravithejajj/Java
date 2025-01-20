package datastructure.trees;


import com.sun.source.tree.BinaryTree;

public class ArrayTree {
    static Character[] arr =new Character[150];
    public static void main(String[] args) {
        getIndex("acreGffetdfgcd",1);
    }
    public static void getIndex(String node, int index)
    {
      for(Character c:node.toCharArray())
      {
          arr[(int)c]=c;
          if(arr[(int)c]==(int)'a'+index)
          {
              System.out.println(c);
              break;
          }
          if(arr[(int)c]==(int)'A'+index)
          {
              System.out.println(c);
              break;
          }

      }

    }
}
