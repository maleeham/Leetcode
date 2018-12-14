/*Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.*/

class Solution {
   public String toLowerCase(String str) {
        if (str == null) {
            return null;
        }
        char chars[] = str.toCharArray();
        char target[] = new char[chars.length];
        int delta = 'a' - 'A';
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                target[i] = (char) (chars[i] + delta);
            } else {
                target[i] = chars[i];
            }
        }
        return new String(target);
    }
}
