package datastructure.Arrays;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

    public static void main(String[] args){
        int[] a ={ 1, 2, 2, 3, 4, 4, 4, 5, 5,6};
        RemoveDuplicateFromArray removeDuplicateFromArray = new RemoveDuplicateFromArray();
        removeDuplicateFromArray.getDistinctArray(a);
    }
    public void getDistinctArray(int[] a)
    {
        int j=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]!=a[i-1])
            {
                a[j++]=a[i];
            }

        }
    Arrays.stream(a).limit(j).forEach(System.out::println);
    }
}
