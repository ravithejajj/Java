package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        findDisappearedNumbers(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean visited[] = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length ; i++) {

            if (!visited[nums[i]])
                visited[nums[i]] = true;
            else
                visited[nums[i]] = false;

            //System.out.println(visited[nums[i]]);

        }
        for(boolean flag:visited)
        {
            System.out.println(flag);
        }
        return new ArrayList();
    }
}