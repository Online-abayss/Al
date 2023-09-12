package Programmers.level_2;

public class n진수_게임 {


    public static void main(String[] args) {

        int n = 2;
        int t = 4;
        int m = 2;
        int p = 1;

        Solution solution = new Solution();

        System.out.println(solution.solution(n, t, m, p));

    }
    // 1 , 10 , 101, 111
// n 진법 , t 구할 갯수 , m 인원 , p 순서
    static class Solution {
        public String solution(int n, int t, int m, int p) {
            String answer = "";

            StringBuilder sb = new StringBuilder();
            StringBuilder goal = new StringBuilder();

            int num = 0;
            while (sb.length() < m * t) {

                sb.append(Integer.toString(num ++, n));
            }

            for (int i = p - 1; i < m * t; i = i + m) {

                goal.append(sb.charAt(i));
            }

            answer = goal.toString().toUpperCase();
            return answer;
        }
    }

}
