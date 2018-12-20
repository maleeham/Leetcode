/* Given a non-empty array of integers, every element appears twice except for one. Find that single one.*/


class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        a=0
        for i in nums:
            a=a^i
        return a
