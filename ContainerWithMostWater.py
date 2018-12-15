class Solution:
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        low = 0
        high = len(height) - 1
        maxArea = 0
        while low < high :
            width = high - low
            waterheight = height[low] if height[high] > height[low] else height[high]
            area = width*waterheight
            maxArea = maxArea if maxArea >area else area
            if (height[low] < height[high]):
                low += 1
            else:
                high-=1

        return maxArea
