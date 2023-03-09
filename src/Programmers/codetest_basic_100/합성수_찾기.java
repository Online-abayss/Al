package Programmers.codetest_basic_100;

public class 합성수_찾기 {

    public static void main(String[] args) {

        int n = 10;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }

    // 자바 논리연산자는 사칙연산의 * / 처럼이 아닌 하나씩 하나씩 따로 보나봄.
    static class Solution {
        public int solution(int n) {
            int answer = 0;

            while (n > 3) {

                if (Math.pow((int)Math.sqrt(n), 2) == n  || n % 2 == 0 || n % 3 == 0) {

                    answer ++;

                } else if ( n > 7 && (n % 5 == 0 || n % 7 == 0)) {

                    answer ++;
                }

                n = n - 1;
           }


            return answer;
        }
    }
}
