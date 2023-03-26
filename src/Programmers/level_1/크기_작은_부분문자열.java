package Programmers.level_1;

public class 크기_작은_부분문자열 {

    public static void main(String[] args) {

        String t = "10203";
        String p = "15";

        Solution solution = new Solution();

        System.out.println(solution.solution(t,p));

    }

    static class Solution {
        public int solution(String t, String p) {
            int answer = 0;

            for (int i = 0; i <= t.length() - p.length(); i++) {

                if (Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) {

                    answer ++;

                }
            }

            return answer;
        }
    }
}
