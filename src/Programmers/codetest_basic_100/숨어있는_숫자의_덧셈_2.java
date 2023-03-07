package Programmers.codetest_basic_100;

// 떠오르는게 2중 for문이라 좀 서글펐음.
public class 숨어있는_숫자의_덧셈_2 {

    public static void main(String[] args) {

        String my_string = "aAb1B2cC34oOp";

        Solution solution = new Solution();

        System.out.println(solution.solution(my_string));

    }

    static class Solution {
        public int solution(String my_string) {
            int answer = 0;

            // 순차적으로 char 뽑기
            for (int i = 0; i < my_string.length(); i++) {

                // 초기화
                String test = "";

                // 아스키코드 기준으로 0 ~ 9일 경우
                if (my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57) {

                    // 일단 String으로 합치기 (다음 인덱스에 true가 생길 수도 있기에)
                    test += String.valueOf(my_string.charAt(i));

                    // 재검토
                    for (int j = i + 1; j < my_string.length(); j++) {

                        if (my_string.charAt(j) >= 48 && my_string.charAt(j) <= 57) {

                            // 다음 인덱스 true일 경우 다음 i가 반복분 돌지 못하게 ++ 설정.
                            test += String.valueOf(my_string.charAt(j));
                            i++;

                        } else {

                            break;
                        }
                    }

                    answer += Integer.parseInt(test);
                }
            }

            return answer;
        }
    }
}

// 다른사람 풀이

//class Solution {
//    public int solution(String my_string) {
//        int answer = 0;
//
//        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
//
//        for(String s : str){
//            if(!s.equals("")) answer += Integer.valueOf(s);
//        }
//
//        return answer;
//    }
//}

// import java.util.*;
//
//class Solution {
//    public int solution(String myString) {
//        return Arrays.stream(myString.split("[A-Z|a-z]")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
//    }
//}
