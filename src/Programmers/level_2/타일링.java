package Programmers.level_2;

public class 타일링 {

    public static void main(String[] args) {

        int n = 4;
        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }

    static class Solution {
        public int solution(int n) {

            int answer = 0;

            int[] dp = new int[60001];

            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 2;

            for (int i = 3; i <= n; i++) {

                dp[i] = (dp[i - 2] + dp[i - 1]) % 1000000007;
            }

            answer = dp[n] ;

            return answer;
        }
    }
}
