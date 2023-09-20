package Programmers.level_2;

import java.util.Arrays;

public class 숫자_변환하기 {

    public static void main(String[] args) {

        int x = 10;
        int y = 40;
        int n = 5;

        Solution solution = new Solution();

        System.out.println(solution.solution(x,y,n));


    }
    
    static class Solution {
        public int solution(int x, int y, int n) {
            int answer = 0;

            int[] dp = new int[y + 1];

            for (int i = x; i < y + 1; i++) {

                // x랑 관련없는 수들
                if (i != x && dp[i] == 0) {

                    dp[i] =-1;
                    continue;
                }

                if (i * 2 <= y) {

                    dp[i * 2] = dp[i * 2] == 0 ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 2]);
                }

                if (i * 3 <= y) {

                    dp[i * 3] = dp[i * 3] == 0 ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 3]);
                }

                if (i + n <= y) {

                    dp[i + n] = dp[i + n] == 0 ? dp[i] + 1 : Math.min(dp[i] + 1 ,dp[i + n]);
                }
            }

            answer = dp[y];

            return answer;
        }
    }
}
