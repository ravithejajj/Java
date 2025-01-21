package datastructure.Arrays;

public class ThirdLargest {
    public static void main(String[] args){
        int[] a ={ 10,11236, 9808, 11337,45, 90, 324,11235};
        ThirdLargest thirdLargest = new ThirdLargest();
        thirdLargest.getThirdLargest(a);
    }
    public void getThirdLargest(int[] a)
    {
        int firstMax=-1;
        int secondMax=-1;
        int thirdMax=-1;
       for(int i=0;i<a.length;i++)
       {
           if(a[i]>firstMax)
           {
               thirdMax=secondMax;
               secondMax=firstMax;
               firstMax=a[i];
           }
          else if(a[i]>secondMax)
           {
               thirdMax=secondMax;
               secondMax=a[i];
           }
          else if(a[i]>thirdMax )
           {
               thirdMax=a[i];

           }
       }
    System.out.println("firstMax: "+firstMax);
    System.out.println("secondMax: "+secondMax);
    System.out.println("thirdMax: "+ thirdMax);
    }
}
