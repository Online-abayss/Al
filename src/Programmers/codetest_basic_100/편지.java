package Programmers.codetest_basic_100;

public class 편지 {

    public static void main(String[] args) {

        String message = "happy birthday!";

        Solution solution = new Solution();

        System.out.println(solution.solution(message));
    }

    static class Solution {
        public int solution(String message) {
            int answer = 0;

            answer = message.length() * 2;
            return answer;
        }
    }
}
