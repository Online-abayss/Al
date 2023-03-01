package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 대문자와_소문자 {

    public static void main(String[] args) {

        String my_string = "cccCCC";

        Solution solution = new Solution();

        System.out.println(solution.solution(my_string));

    }


    static class Solution {
        public String solution(String my_string) {


            char[] arr_str = my_string.toCharArray();

            for (int i = 0; i < arr_str.length; i++) {

                if (arr_str[i] >= 97 && arr_str[i] <= 122) {

                    arr_str[i] -= 32;
                }
                else {

                    arr_str[i] += 32;
                }
            }

            String answer = String.valueOf(arr_str);

            System.out.println(answer);

            return answer;
        }
    }
}
