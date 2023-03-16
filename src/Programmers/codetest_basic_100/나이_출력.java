package Programmers.codetest_basic_100;

public class 나이_출력 {

    public static void main(String[] args) {

        int age = 23;

        Solution solution = new Solution();

        System.out.println(solution.solution(age));

    }

    static class Solution {
        public int solution(int age) {
            int answer = 0;

            answer = 2023 - age;
            return answer;
        }
    }
}
