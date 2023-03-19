package Programmers.level_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 문자열_내림차순으로_배치하기 {

    public static void main(String[] args) {

        String s = "Zbcdefg";

        Solution Solution = new Solution();

        System.out.println(Solution.solution(s));


    }

    static class Solution {
        public String solution(String s) {
            String answer = "";



            String[] test = s.split("");

            Arrays.sort(test, Comparator.reverseOrder());

            for (String v : test) {

                answer += v;

            }

            return answer;
        }
    }

}

// 다른사람 풀이

//// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
//// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
//import java.util.Arrays;
//
//public class ReverseStr {
//    public String reverseStr(String str){
//        char[] sol = str.toCharArray();
//    Arrays.sort(sol);
//    return new StringBuilder(new String(sol)).reverse().toString();
//    }
//
//    // 아래는 테스트로 출력해 보기 위한 코드입니다.
//    public static void main(String[] args) {
//        ReverseStr rs = new ReverseStr();
//        System.out.println( rs.reverseStr("Zbcdefg") );
//    }
//}
