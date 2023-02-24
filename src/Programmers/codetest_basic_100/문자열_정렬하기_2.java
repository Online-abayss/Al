package Programmers.codetest_basic_100;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class 문자열_정렬하기_2 {

    public static void main(String[] args) {

        String my_string = "Bcad";

        Solution solution = new Solution();

        System.out.println(solution.solution(my_string));
    }

    static class Solution {
        public String solution(String my_string) {

            String answer = my_string.toLowerCase();

            answer = Stream.of(answer.split("")).sorted().collect(Collectors.joining());

            // of(배열).중간연산.최종연산 Collectoers.joining 모든 배열을 하나로 조합.
            return answer;
        }
    }
}

// 다른 사람 풀이

//내가 char[]로도 할수 있다는걸 생각하지 못함..
//class Solution {
//    public String solution(String my_string) {
//        char[] c = my_string.toLowerCase().toCharArray();
//        Arrays.sort(c);
//        return new String(c);
//    }
//}
