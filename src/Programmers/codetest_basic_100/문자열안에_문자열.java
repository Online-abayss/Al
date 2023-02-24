package Programmers.codetest_basic_100;

public class 문자열안에_문자열 {

    public static void main(String[] args) {

        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";

        Solution solution = new Solution();

        System.out.println(solution.solution(str1, str2));
    }

    static class Solution {
        public int solution(String str1, String str2) {
            int answer = 0;

            int test = str1.indexOf(str2);

            answer = test != -1 ? 1 : 2;
            return answer;
        }
    }


}

// 다른사람 풀이
// 이게 좀더 메소드를 잘 쓴 느낌?
//class Solution {
//    public int solution(String str1, String str2) {
//        return (str1.contains(str2)? 1: 2);
//    }
//}
