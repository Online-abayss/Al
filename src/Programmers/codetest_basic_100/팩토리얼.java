package Programmers.codetest_basic_100;

public class 팩토리얼 {

    public static void main(String[] args) {

        int n = 3628800;
//        int n = 6;
        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            int sum = 1;

            for (int i = 1 ; i < 12; i++) {

                sum *= i;

                if (sum > n) {

                    answer = i -1;
                    break;
                }
            }

            return answer;
        }
    }
}
