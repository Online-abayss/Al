package Programmers.codetest_basic_100;

public class 양꼬치 {

    public static void main(String[] args) {

        int n = 10;
        int k = 3;

        Solution solution = new Solution();

        System.out.println(solution.solution(n, k));

    }

    static class Solution {
        public int solution(int n, int k) {
            int answer = 0;

            answer = n * 12000 + k * 2000 - (n / 10) * 2000;

            return answer;
        }
    }
}
