/*Given a list of sorted characters letters containing only lowercase letters, and given a target letter target, find the smallest element in the list that is larger than the given target.

Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'. */

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low= 0, high=letters.length;
        while(low<high){
            int mid= (low+high)/2;
            if(letters[mid]<=target)
                low=mid+1;
            else
                high=mid;
        }
        return letters[low%letters.length];
    }
}

//Time complexity: O(logN)
//Space complexity: O(1)

