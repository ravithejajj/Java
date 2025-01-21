package datastructure.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5} ;
        int d = 1;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(arr,d);
        for(int i:arr)
        {
      System.out.println(i);
        }
    }
    private void rotate(int[] arr, int rotates)
    {
        int length = arr.length-1;
             for(int i=0;i<rotates;i++)
             {
                 int temp = arr[length];
                 for(int j=length;j>0;j--)
                 {
                     arr[j]=arr[j-1];
                 }
                 arr[0]=temp;

             }
    }
}
