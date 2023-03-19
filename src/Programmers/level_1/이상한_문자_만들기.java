package Programmers.level_1;

public class 이상한_문자_만들기 {

    public static void main(String[] args) {

        String s = "try hello world";

        Solution solution = new Solution();

        System.out.println(solution.solution(s));

    }

    static class Solution {
        public String solution(String s) {
            String answer = "";
            int cnt = 1;

            String[] arr_str = s.split("");

            for (int i = 0; i < s.length(); i++) {

                if (arr_str[i].isBlank()) {

                    answer += " ";

                    cnt = 1;
                } else {

                    if (cnt % 2 == 1) {

                        answer += arr_str[i].toUpperCase();

                    } else {

                        answer += arr_str[i].toLowerCase();
                    }

                    cnt ++;
                }
            }
            return answer;
        }
    }
}
