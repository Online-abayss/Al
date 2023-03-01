package Programmers.codetest_basic_100;

public class 암호_해독 {

    public static void main(String[] args) {

        String cipher = "dfjardstddetckdaccccdegk";

        int code = 4;

        Solution solution = new Solution();

        System.out.println(solution.solution(cipher, code));

    }

    static class Solution {
        public String solution(String cipher, int code) {
            String answer = "";

            String[] arr_str = cipher.split("");

            for (int i = 1; i < cipher.length() / code + 1; i++) {

                answer += arr_str[code*i - 1];
            }

            return answer;
        }
    }
}


// 다른사람 풀이

//내 코드보다 1ms빠름. 하긴 내껀 배열 변환도 해야하는데.
//class Solution {
//    public String solution(String cipher, int code) {
//        String answer = "";
//
//        for (int i = code; i <= cipher.length(); i = i + code) {
//            answer += cipher.substring(i - 1, i);
//        }
//
//        return answer;
//    }
//}

// 스트림으로 푸는 방법.
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//class Solution {
//    public String solution(String cipher, int code) {
//        return IntStream.range(0, cipher.length())
//                .filter(value -> value % code == code - 1)
//                .mapToObj(c -> String.valueOf(cipher.charAt(c)))
//                .collect(Collectors.joining());
//    }
//}
