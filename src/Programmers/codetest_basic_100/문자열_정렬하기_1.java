package Programmers.codetest_basic_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열_정렬하기_1 {

    public static void main(String[] args) {

        String my_string = "hi12392";

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(my_string)));

    }

    static class Solution {
        public int[] solution(String my_string) {

            List<Integer> num_lst = new ArrayList<>();

            String[] arr_str = my_string.replaceAll("[a-zA-Z]", " ").split("");

            for (String s : arr_str) {

                if (!s.equals(" ")) {

                    num_lst.add(Integer.parseInt(s));
                }
            }

            int[] answer = num_lst.stream().mapToInt(s -> s).sorted().toArray();

            return answer;
        }
    }
}

// 다른사람 풀이
// 내가 쓴 스트림을 한줄로 표현한거... 짱이다.
//import java.util.*;
//
//class Solution {
//    public int[] solution(String myString) {
//        return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
//    }
//}
