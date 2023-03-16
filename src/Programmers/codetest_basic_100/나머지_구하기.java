package Programmers.codetest_basic_100;

public class 나머지_구하기 {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 2;

        Solution solution = new Solution();

        System.out.println(solution.solution(num1, num2));

    }

    static class Solution {
        public int solution(int num1, int num2) {
            int answer = num1 % num2;


            return answer;
        }
    }
}
