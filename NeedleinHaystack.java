/*Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.*/

class Solution {
    public int strStr(String haystack, String needle) {
        char [] sCharacters = haystack.toCharArray();
        char [] checkCharacters = needle.toCharArray();
        
        if (checkCharacters.length == 0){
            return 0;
        }
        
        for (int i = 0 ; i < sCharacters.length - checkCharacters.length + 1; i++){
            if (checkMatchingAtIndex(sCharacters, checkCharacters, i)){
                return i;
            }
        }
        
        return -1;
     }
    
    private boolean checkMatchingAtIndex(char [] sCharacters, char [] checkCharacters, int startingIndex){
        
        for (int i = 0 ; i < checkCharacters.length; i++){
            if (sCharacters[i+ startingIndex] != checkCharacters[i]){
                return false;
            }
        }
        
        return true;
        
    }
