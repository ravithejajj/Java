package datastructure.Arrays;

public class FindAllSubArraysOfArray {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        FindAllSubArraysOfArray findAllSubArraysOfArray = new FindAllSubArraysOfArray();
        findAllSubArraysOfArray.findSubArrays(arr);
    }
    public void findSubArrays(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
          System.out.print(arr[k]);
                }
                System.out.println("");
            }
        }
    }
}
