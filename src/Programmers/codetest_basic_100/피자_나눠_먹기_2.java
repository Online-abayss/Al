package Programmers.codetest_basic_100;

public class 피자_나눠_먹기_2 {

    public static void main(String[] args) {

        int n = 10;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }


    static class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= 100; i++) {

                if ((6 * i) % n == 0 ) {

                    answer = i;
                    break;
                }
            }
            return answer;
        }
    }
}
