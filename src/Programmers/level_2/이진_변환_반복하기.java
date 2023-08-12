package Programmers.level_2;

import java.util.Arrays;

public class 이진_변환_반복하기 {

    public static void main(String[] args) {

        String s = "110010101001";

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(s)));


    }

    static int cnt_zero;
    static int dep_cnt;
    static class Solution {
        public int[] solution(String s) {

            dfs(s, 0);

            int[] answer = {dep_cnt, cnt_zero};
            return answer;
        }

        private void dfs(String s, int depth) {

            if (s.equals("1")) {

                dep_cnt = depth;
                return;
            }

            String[] words = s.split("");
            String number = "";


            for (String a : words) {

                if (!a.equals("0")) {

                    number += a;
                } else {

                    cnt_zero += 1;
                }
            }

            String check_word = Integer.toBinaryString(number.length());

            dfs(check_word, depth + 1);

        }
    }
}
