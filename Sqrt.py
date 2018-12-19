/*Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.*/

class Solution:
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        i=1.0;
        while(True):
            j=(i+x/i)/2.0;
            if(abs(i-j)< 0.000000000005):
                break;
            i=j;
        return int(j);
