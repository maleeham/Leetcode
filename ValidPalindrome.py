/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.*/

class Solution:
    def isPalindrome(self, s):
        translator = str.maketrans('', '', string.punctuation + ' ')
        s = s.translate(translator)
        s = s.lower()
        return s == s[::-1]  
        s = "".join([c.lower() for c in s if c.isalnum()])
        return s == s[::-1]
