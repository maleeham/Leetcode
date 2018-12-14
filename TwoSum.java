/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map= new HashMap<>(); //for mapping each time we have to find a compliment number from the array to add upto the target
        for(int i=0;i<nums.length;i++){
            int comp = target - nums[i]; //target=nums[i]+ comp
            if(map.containsKey(comp)){    //to see if the comp variable is in the array--> that would make the successful operation
                return new int[] { map.get(comp),i};  //for the indices of the elements which are the answer
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("x"); //does not exist
    }
}
