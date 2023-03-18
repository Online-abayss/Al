package Programmers.codetest_basic_100;

public class 두_수의_곱 {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 4;

        Solution solution = new Solution();

        System.out.println(solution.solution(num1, num2));

    }

    static class Solution {
        public int solution(int num1, int num2) {
            int answer = 0;

            answer = num1 * num2;

            return answer;
        }
    }

}
