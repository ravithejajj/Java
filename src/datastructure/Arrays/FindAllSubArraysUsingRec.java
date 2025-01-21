package datastructure.Arrays;

public class FindAllSubArraysUsingRec {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        FindAllSubArraysUsingRec findAllSubArraysOfArray = new FindAllSubArraysUsingRec();
        findAllSubArraysOfArray.findSubArrays(arr,0,0);
    }

    private void findSubArrays(int[] arr,int length,int j) {
        if(j==arr.length)
        {
            return;
        }
        else if(arr.length==length)
        {
            findSubArrays(arr,j,j+1);
    } else {
      for (int i = j; i <= length; i++) {
        System.out.print(arr[i]);
      }
      System.out.println("");
      findSubArrays(arr, length + 1, j);
}
    }

}
