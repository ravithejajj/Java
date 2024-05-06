package Java8;

public class Solution2 {
    int maxNumber=0;
    int start=0;
    int end=0;

    public static void main(String[] args) {
       int result =  findInMountainArray(3,new MountainArray());
        System.out.println(result);
    }
    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int maxNumber=0;
        int start=0;
       // int end=0;
        int index=0;
        int length = mountainArr.length();
        int end=length-1;
        int mid=length/2;
        while(start<end)
        {
            int highest=mountainArr.get(mid);
            int previousHighest=mountainArr.get(mid-1);
            int nextHighest=mountainArr.get(mid+1);
            if(previousHighest<=highest && highest>=nextHighest)
            {
                maxNumber=highest;
                index=end;
                break;
            }
            else if(highest<nextHighest)
            {
                start=mid+1;


            }
            else
            {
                end=mid;
            }
            mid=start+(end-start)/2;

        }
        //System.out.println(maxNumber);
        end=index;
        start=0;
         mid=end;
        while(start<end)
        {
            //System.out.println(mid);

            int value = mountainArr.get(mid);
            System.out.println(value);
            if(target<value)
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
            if(target==value)
            {
                return mid;
            }
            mid=start+(end-start)/2;
        }
        end=mountainArr.length();
        start=index;
        mid=index;
        while(start<end)
        {
            int value = mountainArr.get(mid);
            if(target>value)
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
            if(target==value)
            {
                return mid;
            }
            mid=start+(end-start)/2;
        }

        return -1;
    }

}
class MountainArray{
    int[] arr={1,2,3,4,5,3,1};
    public int length()
    {
        return arr.length;
    }
    public int get(int index)
    {
        return arr[index];
    }
}