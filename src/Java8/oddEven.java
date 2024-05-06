package Java8;

public class oddEven {
    public static void main(String[] args) {
        sortArrayByParity(new int[]{1,0});
    }
    public static int[] sortArrayByParity(int[] nums) {
        int evenNumber=0;
        int oddNumber=0;
        int length=nums.length-1;
        int i=0;
        while(i<=length)
        {
            if(nums[i]%2!=0&&oddNumber==0)
            {
                oddNumber=nums[i];
            }
            if(nums[i]%2==0)
            {
                i++;
            }
            if(nums[length]%2==0&&evenNumber==0)
            {
                evenNumber=nums[length];
            }
            if(nums[length]%2!=0)
            {
                length--;
            }
            if(oddNumber!=0&&evenNumber!=0)
            {
                int temp=nums[i];
                nums[i]=nums[length];
                nums[length]=temp;
                oddNumber=0;
                evenNumber=0;
                i++;
                length--;
            }


        }
        return nums;
    }
}
