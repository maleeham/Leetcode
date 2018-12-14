/*Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.*/

class Solution:
    def toLowerCase(self, str):
        """
        :type str: str
        :rtype: str
        """
        strout=''
        for char in str:
            if ord(char)>64 and ord(char)<91:
                strout+=chr(ord(char)+32)
            else:
                strout+=char
        return strout
