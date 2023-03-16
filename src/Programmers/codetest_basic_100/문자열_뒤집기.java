package Programmers.codetest_basic_100;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 문자열_뒤집기 {

    public static void main(String[] args) {

        String my_string = "jaron";

        Solution solution = new Solution();

        System.out.println(solution.solution(my_string));

    }

    static class Solution {
        public String solution(String my_string) {

            String answer = "";

            String[] arr_str = my_string.split("");

            for (int i = my_string.length()-1; i >= 0; i--) {

                answer += arr_str[i];
            }

            return answer;
        }
    }
}

// 다른사람 풀이

//이게 더 빠르다.

//import java.util.*;
//
//class Solution {
//    public String solution(String my_string) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(my_string);
//        sb.reverse();
//
//        return sb.toString();
//    }
//}
