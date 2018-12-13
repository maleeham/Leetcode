class Solution:
    def numJewelsInStones(self, J, S):
        """
        :type J: str
        :type S: str
        :rtype: int
        """
        count = len(S)
        for char in S:
            if char not in J:
                count=count-1
        return count
        
