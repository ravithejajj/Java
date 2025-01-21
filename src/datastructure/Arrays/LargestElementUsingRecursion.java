package datastructure.Arrays;

public class LargestElementUsingRecursion {

    public static void main(String[] args){
        int max=Integer.MIN_VALUE;
         int[] a ={ 10, 324, 45, 90, 9808};
        LargestElementUsingRecursion l = new LargestElementUsingRecursion();
       max= l.findLargest(a,0);
       System.out.println(max);
    }
    public int findLargest(int[] a,int i)
    {
    if (a.length - 1 ==i) {
        return a[i];
        }
    int max=findLargest(a,i+1);
        return Math.max(max,a[i]);
    }
}
