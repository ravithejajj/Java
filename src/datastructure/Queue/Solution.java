package datastructure.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,-1}; int k = 1;
        int[] result = maxSlidingWindow(nums,k);
        Arrays.stream(result).forEach(System.out::println);
    }
   static Deque<Integer> deque = new ArrayDeque();
    public static int[] maxSlidingWindow(int[] nums, int k) {

   int[] result = new int[nums.length-(k-1)];
   int i=0;
   int count=0;
           for(int j=0;j<nums.length;j++)
        {
            if(!deque.isEmpty()) {
                if ((j - deque.peekFirst()) >= k) {
                    deque.removeFirst();
                }
                if (!deque.isEmpty()&&nums[j] < nums[deque.peekLast()]) {
                    deque.add(j);
                } else {
                    while (!deque.isEmpty()&&nums[j] > nums[deque.peekLast()]) {
                        deque.removeLast();
                    }
                    deque.add(j);
                }
            }
            else {
                deque.add(0);
            }
            if(count>=(k-1)) {
                result[i] = nums[deque.peekFirst()];
                i++;
            }
          count++;
        }
return result;
    }
    
          
}