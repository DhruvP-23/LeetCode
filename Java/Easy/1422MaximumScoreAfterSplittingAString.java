class Solution {
    public int maxScore(String s) {
        int output = 0;
        for(int i = 0; i < s.length()-1; i++){
            int left = 0 , right = 0;
            char[] r = s.substring(i+1, s.length()).toCharArray(), l = s.substring(0, i+1).toCharArray();

            for(char c : r){
                if(c == '1') right++;
            }
             for(char c : l){
                if(c == '0') left++;
            }

            output = Math.max(output, (left + right));

        }

        return output;
    }
}



// Example 1:

// Input: s = "011101"

// Output: 5 
// Explanation: 
// All possible ways of splitting s into two non-empty substrings are:
// left = "0" and right = "11101", score = 1 + 4 = 5 
// left = "01" and right = "1101", score = 1 + 3 = 4 
// left = "011" and right = "101", score = 1 + 2 = 3 
// left = "0111" and right = "01", score = 1 + 1 = 2 
// left = "01110" and right = "1", score = 2 + 1 = 3
// Example 2:

// Input: s = "00111"
// Output: 5
// Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
// Example 3:

// Input: s = "1111"
// Output: 3