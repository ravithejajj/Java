package datastructure.Arrays;

import javax.swing.*;

public class CheckArrayIsSortedUsingRecursion {
    public static void main(String[] args){
        int[] a={20, 20, 45, 89, 89, 90,3};
        CheckArrayIsSortedUsingRecursion isSortedUsingRecursion = new CheckArrayIsSortedUsingRecursion();
        int i=0;
       boolean flag =  isSortedUsingRecursion.getIsSorted(a,i);
    System.out.println(flag);
    }
    public boolean getIsSorted(int[] a,int i){
        if(i==a.length-1)
        {
            return true;
        }

       return a[i+1]>=a[i] && getIsSorted(a,i+1);

    }
}
