package Programmers.codetest_basic_100;

public class 숫자_비교하기 {

    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;

        Solution solution = new Solution();

        System.out.println(solution.solution(num1,num2));

    }

    static class Solution {
        public int solution(int num1, int num2) {
            int answer = 0;

            answer = num1 == num2 ? 1 : -1;

            return answer;
        }
    }
}
