class Solution:
    def isPalindrome(self, x: int) -> bool:

        #[::-1} reverses the string
        # returns reversed str == str
        return str(x)[::-1] == str(x)
