package Programmers.codetest_basic_100;

import java.util.Arrays;
import java.util.stream.Collectors;

class _7의_개수 {

    public static void main(String[] args) {

        int[] array = {7,77,17};

        Solution solution = new Solution();

        System.out.println(solution.solution(array));

    }

    static class Solution {
        public int solution(int[] array) {
            int answer = 0;

            String arr = Arrays.toString(array);

            for (int i = 0; i < arr.length(); i++) {

                if(arr.charAt(i) == '7') {

                    answer ++;
                }
            }
            return answer;
        }
    }
}


// 다른 사람 이용법 스트림 버전
//class Solution {
//    public int solution(int[] array) {
//        // 먼저 배열 하나로 합치기?
//        // 하나로 합치기 위해서 int배열을 string배열로 바꾼후 하나로 합치기
//        String[] strArray = Arrays.stream(array).mapToObj(String::valueOf).toArray(String[]::new);
//
//        String joinString = String.join("", strArray);
//
//        int answer = countNum(joinString, '7');
//
//        return answer;
//    }
//
//    public int countNum(String str, char ch) {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ch)
//                count++;
//        }
//        return count;
//    }
//}
