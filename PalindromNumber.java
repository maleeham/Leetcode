/*Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.*/

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!= 0))
            return false;
        int rev=0;
        int z=x;
        while (z!=0){
            int temp=z%10;
            z/=10;
            rev=rev*10+temp;
        }
     
        if(rev==x)
            return true;
        
        else
            return false;
    }
    
}
