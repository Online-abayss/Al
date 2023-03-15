package Programmers.codetest_basic_100;

public class 외계행성의_나이 {

    public static void main(String[] args) {

        int age = 23;

        Solution solution = new Solution();

        System.out.println(solution.solution(age));

    }

    static class Solution {
        public String solution(int age) {
            String answer = "";

            String[] arr_str = String.valueOf(age).split("");

            for (int i = 0; i < arr_str.length; i++) {

                answer += (char)(Integer.parseInt(arr_str[i]) + 97);
            }

            return answer;
        }
    }
}

// 다른사람 풀이

// import java.util.stream.Collectors;
//
//class Solution {
//    public String solution(int age) {
//        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
//    }
//}
