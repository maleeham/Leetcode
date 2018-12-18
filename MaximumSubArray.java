/*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.*/

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0)
            return 0;
        int max_so_far=Integer.MIN_VALUE, max=0, i=0;
        while(i<nums.length){
            max = max + nums[i];
            if(max_so_far<max)
                max_so_far=max;
            if(max<0)
                max=0;
           i++;
        }
        return max_so_far;
    }
}
