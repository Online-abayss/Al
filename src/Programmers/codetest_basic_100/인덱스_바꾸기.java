package Programmers.codetest_basic_100;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 인덱스_바꾸기 {

    public static void main(String[] args) {

        String my_string = "hello hi";
        int num1 = 1;
        int num2 = 2;

        Solution solution = new Solution();

        System.out.println(solution.solution(my_string, num1, num2));

    }

    static class Solution {
        public String solution(String my_string, int num1, int num2) {
            String answer = "";

            String[] arr_str = my_string.split("");

            String temp_str = arr_str[num1];

            arr_str[num1] = arr_str[num2];
            arr_str[num2] = temp_str;

            answer = Arrays.stream(arr_str).collect(Collectors.joining());

            return answer;
        }
    }
}
// 다른사람 풀이

// 이사람 껀 이런 기능도 있구나를 많이 알게되는 버전. String.join도 그렇고 Collections.swap도 그렇고 신기함.
//import java.util.Arrays;
//        import java.util.Collections;
//        import java.util.List;
//        import java.util.stream.Collectors;
//
//class Solution {
//    public String solution(String myString, int num1, int num2) {
//        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());
//
//        Collections.swap(list, num1, num2);
//        return String.join("", list);
//    }
//}


// 이분 껀 충분히 내가 생각할 수 있으면서 간단한 버전이라 맘에듬.
//class Solution {
//    public String solution(String my_string, int num1, int num2) {
//        String answer = "";
//
//        char[] ch = my_string.toCharArray();
//
//        ch[num1] = my_string.charAt(num2);
//        ch[num2] = my_string.charAt(num1);
//
//        answer = String.valueOf(ch);
//        return answer;
//    }
//}
