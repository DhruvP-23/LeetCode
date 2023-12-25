public class RepeatedSubstringPattern {

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.repeatedSubstringPattern("abab"));
        System.out.println(sol.repeatedSubstringPattern("aba"));
        System.out.println(sol.repeatedSubstringPattern("abcabcabcabc"));
    }

        public boolean repeatedSubstringPattern(String s) {
        return (s+s).substring(1, 2*s.length()-1).contains(s);
    }


}

// Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

// Example 1:

// Input: s = "abab"
// Output: true
// Explanation: It is the substring "ab" twice.
// Example 2:

// Input: s = "aba"
// Output: false
// Example 3:

// Input: s = "abcabcabcabc"
// Output: true
// Explanation: It is the substring "abc" four times or the substring "abcabc" twice.