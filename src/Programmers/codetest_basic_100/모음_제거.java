package Programmers.codetest_basic_100;

public class 모음_제거 {

    public static void main(String[] args) {

        String my_string = "nice to meet you";

        Solution solution = new Solution();

        System.out.println(solution.solution(my_string));
    }

    static class Solution {
        public String solution(String my_string) {

            String[] num_str = {"a","e","i","o","u"};

            for (String s : num_str) {

                my_string = my_string.replaceAll(s, "");

            }

            return my_string;
        }
    }
}

// 다른사람 풀이
// 아 replaceAll 저렇게 해버리면 되는구나를 배움.

//class Solution {
//    public String solution(String my_string) {
//        String answer = "";
//
//        answer = my_string.replaceAll("[aeiou]", "");
//
//        return answer;
//    }
//}
