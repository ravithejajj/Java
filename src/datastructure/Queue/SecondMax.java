package datastructure.Queue;

import java.util.*;

public class SecondMax {
    static int[] arr={4,3,6,5,8,7,6,9};
    static int  max=Integer.MIN_VALUE;
   static int second_max=Integer.MIN_VALUE;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(4); list.add(5);
        list.add(9);
        list.add(7);

        System.out.println(list);
       int x =  Collections.max(list);
        System.out.println(x);
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                second_max=max;
                max=arr[i];

            }
            else if(second_max<arr[i]){
                second_max=arr[i];
            }
        }
      //  System.out.println(second_max);
    }
}
