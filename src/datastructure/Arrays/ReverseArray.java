package datastructure.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverse(arr);

    }

    private void reverse(int[] arr) {
        int length = arr.length-1;
        for(int i=0;i<=length;i++,length--)
        {
            if(i>=length)
            {
                break;
            }
            int temp=arr[i];
            arr[i]=arr[length];
            arr[length]=temp;

        }
    Arrays.stream(arr).forEach(System.out::println);
    }
}
