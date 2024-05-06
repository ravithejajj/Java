package datastructure.Queue;

import java.util.Arrays;

public class Arraymani {
    public static void main(String[] args) {
        int[] i = new int[10];
        int[] j = {4,6,3,7,1,9,9};
        for(int v:j)
        {
            i[v]++;
        }
       Arrays.stream(i).forEach(System.out::println);
    }
}
