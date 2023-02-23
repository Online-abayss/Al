package Programmers.codetest_basic_100;

class 종이_자르기 {

    public static void main(String[] args) {

        int M = 2;
        int N = 2;

        Solution solution = new Solution();

        System.out.println(solution.solution(M, N));

    }


    static class Solution {
        public int solution(int M, int N) {
            int answer = M * N - 1;

            return answer;
        }
    }
}
