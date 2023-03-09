package Programmers.codetest_basic_100;

public class 컨트롤_제트 {

    public static void main(String[] args) {

        String s = "1 2 Z 3";

        Solution solution = new Solution();

        System.out.println(solution.solution(s));

    }

    static class Solution {
        public int solution(String s) {
            int answer = 0;

            String[] arr_s = s.split(" ");

            for (int i =0; i < arr_s.length; i++) {

                if (arr_s[i].equals("Z")) {

                    answer -= Integer.parseInt(arr_s[i-1]);
                } else {

                    answer += Integer.parseInt(arr_s[i]);
                }
            }
            return answer;
        }
    }
}

// 다른사람 풀이

// 이문제는 쉬웠는데 stack으로 푸는 방식들이 있길레 찾아봄

//import java.util.*;
//
//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//        Stack<Integer> stack = new Stack<>();
//
//        for (String w : s.split(" ")) {
//            if (w.equals("Z")) {
//                stack.pop();
//            } else {
//                stack.push(Integer.parseInt(w));
//            }
//        }
//        for (int i : stack) {
//            answer += i;
//        }
//        return answer;
//    }
//}
