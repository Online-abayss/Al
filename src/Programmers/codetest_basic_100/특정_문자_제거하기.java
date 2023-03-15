package Programmers.codetest_basic_100;

public class 특정_문자_제거하기 {

    public static void main(String[] args) {

        String my_string = "abcdef";
        String letter = "f";

        Solution solution = new Solution();

        System.out.println(solution.solution(my_string, letter));

    }

    static class Solution {
        public String solution(String my_string, String letter) {
            String answer = "";

            String[] arr_str = my_string.split("");

            for (String s : arr_str) {

                if (!s.equals(letter)) {

                    answer += s;
                }
            }

            return answer;
        }
    }
}


// 다른사람 풀이

//이게 더 빠르고 완벽하다..

//class Solution {
//    public String solution(String my_string, String letter) {
//        String answer = "";
//
//        answer = my_string.replace(letter, "");
//
//        return answer;
//    }
//}
