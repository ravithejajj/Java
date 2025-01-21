package datastructure.Arrays;

public class RotateArrayByReverse {
    public static void main(String[] args){
        RotateArrayByReverse rotateArrayByReverse = new RotateArrayByReverse();
        int arr[] = {1, 2, 3, 4, 5, 6} ;
        int d = 7;
        rotateArrayByReverse.rotate(arr,d);
    }

    private void rotate(int[] arr,int rotations) {
        int length=arr.length-1;
    if(rotations>length+1)
    {
     rotations%=length+1;
    }
        reverse(arr,length,0);
        reverse(arr,rotations-1,0);
        reverse(arr,length,rotations);

    }

    private void reverse(int[] arr,int length,int begin) {

        for(int i=begin;i<=length;i++,length--)
        {
            int temp=arr[length];
            arr[length]=arr[i];
            arr[i]=temp;
        }
        System.out.println("reversed array");
        for(int i:arr)
        {
            System.out.print(i);
        }
    }
}
