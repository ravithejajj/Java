package datastructure.Arrays;

public class SecondLargest {
    public static void main(String[] args){
        int[] a ={ 10,11236, 9808, 11337,45, 90, 324,11235};
        SecondLargest secondLargest = new SecondLargest();
      int secondMax=   secondLargest.findSecondLargest(a);
      System.out.println(secondMax);
    }
    public int findSecondLargest(int[] a)
    {
        int max=Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        if(a[0]>a[1])
        {
            max=a[0];
            secondMax=a[1];
        }
        else{
            max=a[1];
            secondMax=a[0];
        }

        for(int i=2;i<a.length;i++)
        {
            if(a[i]>max)
            { secondMax=max;
                max=a[i];

            }
            else if(a[i]>secondMax&& a[i]<=max)
            {
                secondMax=a[i];
            }
        }
    System.out.println(max);
return secondMax;
    }
}
