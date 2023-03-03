package Programmers.codetest_basic_100;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

// 그냥 뒤집기만 하는게 아니라 순서를 바꾼다는 것이니 인트로 합쳐서 확인함.
public class A로_B_만들기 {


    public static void main(String[] args) {

        String before = "olleh";
        String after = "hello";

        Solution solution = new Solution();

        System.out.println(solution.solution(before, after));
    }


    static class Solution {
        public int solution(String before, String after) {
            int answer = 0;

            int sum_before = 0;
            int sum_after = 0;

            for (int i = 0 ; i < before.length(); i++) {

                sum_before += before.charAt(i);
                sum_after += after.charAt(i);
            }

            answer = sum_before == sum_after ? 1 : 0;

            return answer;
        }
    }

}

// 다른사람 풀이
// 크으... 깔끔하네.
// import java.util.Arrays;
//class Solution {
//    public int solution(String before, String after) {
//        char[] a = before.toCharArray();
//        char[] b = after.toCharArray();
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//        return new String(a).equals(new String(b)) ? 1 :0;
//    }
//}
