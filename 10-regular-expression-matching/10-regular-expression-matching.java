class Solution {
    public boolean isMatch(String s, String p) {
        char[] arr = s.toCharArray();
        char[] pattern = p.toCharArray();
        boolean[][] dp = new boolean[pattern.length + 1][arr.length + 1];
        dp[0][0] = true;
        for (int i = 1; i <= pattern.length; i++) {
            if (pattern[i - 1] == '*') {
                dp[i][0] = dp[i][0] || dp[i - 2][0];
            }
        }
        for (int i = 1; i <= pattern.length; i++) {
            for (int j = 1; j <= arr.length; j++) {
                if (pattern[i - 1] == arr[j - 1] || pattern[i - 1] == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pattern[i - 1] == '*') {
                    // if dp[i - 1][j] is true, previous pattern x will be '.' or match current j, so current dp[i][j] will be true for sure with the pattern x*.
                    // we can always skip * and it's previous character dp[i - 2][j]
                    // so we can always use dp[i - 1][j] || dp[i - 2][j] as default value if current value is '*'
                    dp[i][j] = dp[i - 1][j] || dp[i - 2][j];
                    if (!dp[i][j] && (pattern[i - 2] == '.' || pattern[i - 2] == arr[j - 1])) {
                        // for x* has been matched multiple times.
                        // for example
                        /*
                        *  T   T   T   T
                        a  F   T   F   F
                        #  T   F   F   F
                           #   a   a   a
                        */
                        dp[i][j] = dp[i][j - 1];
                    }
                }
            }
        }
        return dp[pattern.length][arr.length];
    }
}