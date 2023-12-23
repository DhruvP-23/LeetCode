class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        leng = len(needle)
        for i in range(len(haystack) - leng + 1):
            if haystack[0+i : leng+i] == needle:
                return i
        return -1