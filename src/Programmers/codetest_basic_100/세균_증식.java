package Programmers.codetest_basic_100;

class 세균_증식 {

    public static void main(String[] args) {

        int n = 2;
        int t = 10;

        Solution solution = new Solution();

        System.out.println(solution.solution(n, t));

    }

    static class Solution {
        public int solution(int n, int t) {
            double answer = 0;

            for (int i = 1; i < t+1; i++) {

                answer = n * (Math.pow(2,t));
            }

            return (int) answer;
        }
    }
}

//다른사람 풀이
// n *= 2; 를 생각하지 못해서 Math.pow로 해결함...

//class Solution {
//    public int solution(int n, int t) {
//
//        for(int i = 0; i < t; i++) {
//            n *= 2;
//        }
//        return n;
//    }
//}
