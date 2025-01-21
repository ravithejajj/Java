package datastructure.Arrays;

import java.util.Arrays;

public class reverseArrayUsingRec {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        reverseArrayUsingRec reverseArray = new reverseArrayUsingRec();
        reverseArray.reverse(arr,0,arr.length-1);
    Arrays.stream(arr).forEach(System.out::println);
    }

    private void reverse(int[] arr,int i,int length) {
        if(i>=length)
        {
            return;
        }
        int temp=arr[i];
        arr[i]=arr[length];
        arr[length]=temp;
        reverse(arr,i+1,length-1);

    }

}
