package Programmers.level_2;

public class 멀리_뛰기 {

    public static void main(String[] args) {

        int n = 4;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }

    static class Solution {
        public long solution(int n) {

            long[] map = new long[2001];

            map[1] = 1;
            map[2] = 2;

            for (int i = 3; i <= n; i++) {

                map[i] = (map[i - 2] + map[i - 1])% 1234567;
            }

            long answer = map[n];

            return answer;
        }
    }
}
