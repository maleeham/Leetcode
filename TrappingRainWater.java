/*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.


T*/


class Solution {
  public int trap(int[] height) {
        int l = height.length;
       if(l == 0)
       {
           return 0;
       }
        int leftMax = height[0];
        int sum = 0;
        int finalSum = 0;
        for(int i=1;i<l;i++)
        {
            if(height[i]>=leftMax)
            {
                leftMax = height[i];   
                finalSum = finalSum+sum;
                sum=0;
            }
            else
            {
                sum = sum + (leftMax-height[i]);
            }
            
        }
        int rightMax=height[l-1];
        sum=0;
        for(int i=l-2;i>=0;i--)
        {
            if(height[i]>rightMax)
            {
                rightMax = height[i];   
                finalSum = finalSum+sum;
                sum=0;
            }
            else
            {
                sum = sum + (rightMax-height[i]);
            }
            
        }
        return finalSum;
    }
}
