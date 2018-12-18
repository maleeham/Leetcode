/*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.*/

class Solution {
public int lengthOfLastWord(String s) {
    if (null == s || s.trim().length() == 0) return 0;
    
    s = s.trim();
    String lastWord = s.substring(s.lastIndexOf(" ") + 1);
    return lastWord.length();
}}
