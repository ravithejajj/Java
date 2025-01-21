package datastructure.Arrays;

import java.util.Arrays;

public class ArrayAddition {
    static int[] a;
    public static void main(String[] args){
        a=new int[]{1,2,4,5,6,8,6,5,9,2};
   // Arrays.stream(a).forEach(System.out::println);
        addElement(a,4,12);
        Arrays.stream(a).forEach(System.out::print);
        removeElement(a,8);
    System.out.println("");
        Arrays.stream(a).forEach(System.out::print);
        findMinMaxInArray(a);
        findMinOrMaxUsingLinearSearch(a);
        tournamentMethod(a);

    }

    public static void addElement(int[] a,int key,int value)
    {
        int temp=0;
        int temp1;
        for(int i=0;i<a.length-1;i++)
        {
            //{1,2,4,5,6,8,6,5,9,2};
            if(i<=key)
            {
                if(i==key)
                {
                 temp=a[i+1];
                a[i+1]=a[i];
                a[i]=value;
                }
            }
            else
            {
                temp1=a[i+1];
             a[i+1]=temp;
             temp=temp1;
            }
        }
    }
    public static void removeElement(int[] a,int key)
    {
        boolean flag=false;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==key)
            {
                flag=true;
                a[i]=a[i+1];
            }
            else
            if(flag)
            {
                a[i]=a[i+1];
            }
        }
        a[a.length-1]=0;

    }
    public static void findMinMaxInArray(int[] a)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:a)
        {
            if(i<min)
            {
                min=i;
            }
            if(i>max)
            {
                max=i;
            }
        }
    System.out.println("minium : "+min);
        System.out.println("maximum : "+max);
    }

    public static void findMinOrMaxUsingLinearSearch(int[] a)
    {
        int min=a[0];
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
            if(a[i]>max)
            {
                max=a[i];
            }
        }
    System.out.println("min :"+min);
    System.out.println("max :"+max);
    }

    public static void tournamentMethod(int[] a)
    {
        int firstHalf=a.length/2-1;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<firstHalf;i++)
        {
            if(min1>a[i])
            {
                min1=a[i];
            }
            if(max1<a[i])
            {
                max1=a[i];
            }
        }
        for(int i=firstHalf;i<a.length;i++)
        {
            if(min2>a[i])
            {
                min2=a[i];
            }
            if(max2<a[i])
            {
                max2=a[i];
            }
        }
        if(min1<min2)
        {
            System.out.println("min_tournament: "+min1);
        }
        else
        {
            System.out.println("min_tournament: "+min2);
        }
        if(max1<max2)
        {
            System.out.println("max_tournament: "+max2);
        }
        else
        {
            System.out.println("max_tournament: "+max1);
        }
    }
}
