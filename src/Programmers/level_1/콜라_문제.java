package Programmers.level_1;

public class 콜라_문제 {

    public static void main(String[] args) {

        int a = 2;
        int b = 1;
        int n = 20;

        Solution solution = new Solution();

        System.out.println(solution.solution(a,b,n));


    }

    static class Solution {
        public int solution(int a, int b, int n) {
            int answer = 0;

            int empty_coke = 0;

            while( n > 0) {

                empty_coke = n % a;
                n = n / a;

                answer += n*b;
                n = n*b + empty_coke;

                if (n < a) {

                    break;
                }
            }

            return answer;
        }
    }
}
