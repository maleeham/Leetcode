class Solution {
    public String reverseString(String s) {
        if(s==null)
            return s;
        char[] string= s.toCharArray();
        for(int low=0,high=string.length-1; low<=high;low++,high--){
            char temp= string[low];
            string[low]=string[high];
            string[high]= temp;
        }
        return new String(string);
    }
}
