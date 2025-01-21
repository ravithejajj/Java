package datastructure.Arrays;

public class CheckArrayIsSorted {
    public static void main(String[] args){
        int[] a={20, 20, 78, 98, 99, 97};
        CheckArrayIsSorted checkArrayIsSorted  = new CheckArrayIsSorted();
        boolean flag = checkArrayIsSorted.checkIfArrayIsSortedOrNot(a);
    System.out.println(flag);
    }
    public boolean checkIfArrayIsSortedOrNot(int[] a)
    {
      for(int i=0;i<a.length-1;i++)
      {
          if(a[i]>a[i+1])
          {
              return false;
          }
      }
      return true;
    }
}
