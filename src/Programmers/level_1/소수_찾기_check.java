package Programmers.level_1;

import java.util.Arrays;

public class 소수_찾기_check {

    public static void main(String[] args) {

        int n = 10;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }
// 에라토스테네스의 체
    static class Solution {
        public int solution(int n) {
            int answer = 0;

            int[] prime = new int[n +1];


            for (int i = 2; i <= n; i++) {

                if (prime[i] == 1) {

                    continue;
                }
                for (int j = 2 * i; j <= n; j+=i) {

                    prime[j] = 1;
                }

                ++answer;
            }

            return answer;
        }
    }
}
