/* Given a collection of distinct integers, return all possible permutations.*/

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        createPermute(nums, output, new ArrayList<Integer>());
        return output;
    }
    
    private void createPermute(int[] nums, List<List<Integer>> output, List<Integer> buffer) {
        if(buffer.size() == nums.length) {
            output.add(new ArrayList<>(buffer));
            return;
        }
        for(int i=0; i<nums.length; i++) {
            if(!buffer.contains(nums[i])) {
                List<Integer> set = new ArrayList<Integer>(buffer);
                set.add(nums[i]);
                createPermute(nums, output, set);
            }
        }
    }
}
