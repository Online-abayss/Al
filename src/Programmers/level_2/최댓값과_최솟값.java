package Programmers.level_2;

public class 최댓값과_최솟값 {

    public static void main(String[] args) {

        String s = "1 2 3 4";

        Solution solution = new Solution();

        System.out.println(solution.solution(s));


    }

    static class Solution {
        public String solution(String s) {
            String answer = "";

            String[] split_number = s.split(" ");

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (String a : split_number) {

                int number = Integer.parseInt(a);

                max = Math.max(number, max);
                min = Math.min(number, min);
            }

            answer = min + " " + max;

            return answer;
        }
    }
}
