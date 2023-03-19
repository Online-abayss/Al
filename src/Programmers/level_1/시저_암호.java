package Programmers.level_1;

import java.util.Arrays;

public class 시저_암호 {

    public static void main(String[] args) {

//        String s = "AB";
        String s = "a B z";

        int n = 4;

        Solution solution = new Solution();

        System.out.println(solution.solution(s, n));


    }

    static class Solution {
        public String solution(String s, int n) {
            String answer = "";

            String[] arr_str = s.split("");

            for (String v : arr_str) {

                if (v.isBlank()) {

                    answer += " ";
                } else {

                    if (v.charAt(0) >= 97) {

                        answer = v.charAt(0) + n > 122 ? answer + (char)(v.charAt(0) + n - 26) : answer + (char)(v.charAt(0) + n);
                    } else {

                        answer = v.charAt(0) + n > 90 ? answer + (char)(v.charAt(0) + n - 26) : answer + (char)(v.charAt(0) + n);
                    }
                }
            }

            return answer;
        }
    }

}

// 다른사람 풀이

//class Caesar {
//    String caesar(String s, int n) {
//        String result = "";
//    n = n % 26;
//    for (int i = 0; i < s.length(); i++) {
//      char ch = s.charAt(i);
//      if (Character.isLowerCase(ch)) {
//        ch = (char) ((ch - 'a' + n) % 26 + 'a');
//      } else if (Character.isUpperCase(ch)) {
//        ch = (char) ((ch - 'A' + n) % 26 + 'A');
//      }
//      result += ch;
//    }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Caesar c = new Caesar();
//        System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
//    }
//}
