package Programmers.codetest_basic_100;

import java.util.ArrayList;
import java.util.Arrays;

class 잘라서_배열로_저장하기 {

    public static void main(String[] args) {

        String my_str = "abc1Addfggg4556b";
        int n = 6;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(my_str, n)));
    }


    static class Solution {
        public String[] solution(String my_str, int n) {

            String[] answer = my_str.length() % n > 0 ? new String[my_str.length() / n + 1] : new String[my_str.length() / n];

            for (int i = 0 ; i < my_str.length()/n; i++) {

                answer[i] = my_str.substring(n * i , n * (i+1) );

            }

            if (my_str.length() % n > 0) {

                answer[my_str.length() / n ] = my_str.substring(my_str.length()-(my_str.length() % n));
            }

            return answer;
        }
    }
}
