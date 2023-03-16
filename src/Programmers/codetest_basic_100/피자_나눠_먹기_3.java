package Programmers.codetest_basic_100;

public class 피자_나눠_먹기_3 {

    public static void main(String[] args) {

        int slice = 7;
        int n = 10;

        Solution solution = new Solution();

        System.out.println(solution.solution(slice, n));

    }

    static class Solution {
        public int solution(int slice, int n) {
            int answer = 0;

            if (n % slice == 0) {

                answer = n / slice;
            } else {

                answer = (n / slice) +1;
            }

            return answer;
        }
    }
}
