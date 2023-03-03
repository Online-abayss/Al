package Programmers.codetest_basic_100;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 중복된_문자_제거_check {

    public static void main(String[] args) {

        String my_string = "people";

        Solution solution = new Solution();

        System.out.println(solution.solution(my_string));

    }

    static class Solution {
        public String solution(String my_string) {

            String[] arr_str = my_string.split("");

            String answer = Stream.of(arr_str).distinct().collect(Collectors.joining());

            return answer;
        }
    }
}

// 다른사람 풀이

//class Solution {
//    public String solution(String my_string) {
//        return my_string.chars()
//                .mapToObj(Character::toString)
//                .distinct()
//                .collect(Collectors.joining());
//    }
//}

// 맨처음 생각했던 방법 리턴문이 떠오르지 않아서 실행 못함.
//import java.util.*;
//class Solution {
//    public String solution(String my_string) {
//        String[] answer = my_string.split("");
//        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));
//
//        return String.join("", set);
//    }
//}

// 스트림 이게 이쁜듯

//import java.util.*;
//        import java.util.stream.Collectors;
//
//class Solution {
//    public String solution(String myString) {
//        return Arrays.stream(myString.split("")).distinct().collect(Collectors.joining());
//    }
//}
