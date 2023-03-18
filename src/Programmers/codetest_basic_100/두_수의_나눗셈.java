package Programmers.codetest_basic_100;

public class 두_수의_나눗셈 {

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 16;

        Solution solution = new Solution();

        System.out.println(solution.solution(num1, num2));

    }
    static class Solution {
        public int solution(int num1, int num2) {
            int answer = 0;

            answer = (int) ((num1 / (double)num2) * 1000);

            return answer;
        }
    }
}
