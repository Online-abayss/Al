package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 숨어있는_숫자의_덧셈_1 {

    public static void main(String[] args) {

        String my_string = "aAb1B2cC34oOp";

        Solution solution = new Solution();

        System.out.println(solution.solution(my_string));

    }

    static class Solution {
        public int solution(String my_string) {
            int answer = 0;

            String[] str = my_string.replaceAll("[a-zA-Z]", " ").split("");

            for(String s : str){
                if(!s.equals(" ")) answer += Integer.valueOf(s);
            }

            return answer;
        }
    }
}
