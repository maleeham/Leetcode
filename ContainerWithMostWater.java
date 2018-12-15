/*Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.*/

class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int low=0, high=height.length-1;
        while(low<high){
            maxarea= Math.max(maxarea, Math.min(height[low], height[high])*(high-low));
            if(height[low]<height[high])
                low++;
            else
                high--;
        }
        return maxarea;    
    }
}
