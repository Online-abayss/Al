package Programmers.level_2;

public class JadenCase_문자열_만들기 {

    public static void main(String[] args) {

        String s = "3people unFollowed me";

        Solution solution = new Solution();

        System.out.println(solution.solution(s));
    }

    static class Solution {
        public String solution(String s) {
            String answer = "";

            String[] test = s.split("");

            boolean upper = true;
            for (String a : test) {

                if (a.equals(" ")) {

                    answer += " ";
                    upper = true;
                } else if (upper) {

                    answer += a.toUpperCase();
                    upper = false;
                } else {

                    answer += a.toLowerCase();
                }
            }

            return answer;
        }
    }
}

// 다른사람 풀이

// class Solution {
//  public String solution(String s) {
//        String answer = "";
//        String[] sp = s.toLowerCase().split("");
//        boolean flag = true;
//
//        for(String ss : sp) {
//            answer += flag ? ss.toUpperCase() : ss;
//            flag = ss.equals(" ") ? true : false;
//        }
//
//        return answer;
//  }
//}
