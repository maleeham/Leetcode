/*Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.*/


class Solution:
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        maxprofit=0
        i=0
        minprice=sys.maxsize
        while(i<len(prices)):
            if(prices[i]<minprice):
                minprice=prices[i]
            elif(prices[i]-minprice>maxprofit):
                maxprofit=prices[i]-minprice;
            i+=1
            
        return maxprofit
                
                
            
        
