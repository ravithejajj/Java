package datastructure.Arrays;

public class MoveZeroAtEnd {
    public static void main(String[] args){
       int arr[] = {10,20,0};
       MoveZeroAtEnd moveZeroAtEnd = new MoveZeroAtEnd();
       moveZeroAtEnd.swap(arr);
for(int i:arr)
{
      System.out.println(i);
}
    }

    private void swap(int[] arr) {
        int length=arr.length-1;
        int firstIndex=-1;
        int secondIndex=0;
        for(int i=0;i<=length;i++)
        {
            if(arr[i]==0)
            {
                if(firstIndex==-1)
               firstIndex=i;
            }
            else if(arr[i]>0&& firstIndex!=-1)
            {
                    secondIndex=i;

                    int temp=arr[secondIndex];
                    arr[secondIndex]=arr[firstIndex];
                    arr[firstIndex]=temp;
                    i=firstIndex;
                    firstIndex=-1;

            }
        }
    }
}
