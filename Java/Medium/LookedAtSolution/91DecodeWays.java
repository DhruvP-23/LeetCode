package Java.Medium.LookedAtSolution;

class Solution {
    public int numDecodings(String s) {
        // Check for invalid input
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; ++i) {
            int oneDigit = s.charAt(i - 1) - '0'; // Get the value of the current digit
            int twoDigits = Integer.parseInt(s.substring(i - 2, i)); // Get the value of the current two digits

            // If the current digit is not zero, it can be decoded individually
            if (oneDigit != 0) {
                dp[i] += dp[i - 1];
            }

            // If the current two digits form a valid number between 10 and 26, it can be decoded as a pair
            if (10 <= twoDigits && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n]; // Return the number of ways to decode the given string
    }
}