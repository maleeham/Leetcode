/*Given an unsorted integer array, find the smallest missing positive integer.*/

//O(n) time and constant extra space

class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums==null||nums.length==0)
            return 1;
         int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || nums[i] > nums.length) {
                continue;
            }
            nums2[nums[i] - 1] = nums[i];
        }
        for(int i = 0; i < nums2.length; i++) {
            if(nums2[i] == 0) {
                return i + 1;
            }
        }
        return nums2.length + 1;
        
        
    }
}
