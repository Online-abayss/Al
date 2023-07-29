//package Programmers.codetest_basic_100;
//
//import java.util.Arrays;
//
//public class 삼각형의_완성조건_1_check_o {
//
//    public static void main(String[] args) {
//
//        int[] sides = {1,2,3};
//
//        Solution solution = new Solution();
//
//        System.out.println(solution.solution(sides));
//
//    }
//
//
//    static class Solution {
//        public int solution(int[] sides) {
//            int answer = 0;
//
//            int max_num = Arrays.stream(sides).max().getAsInt();
//            int sum_num = Arrays.stream(sides).sum();
//
//            if (sum_num - (max_num * 2) > 0 ) {
//
//                answer = 1;
//            } else {
//
//                answer = 2;
//            }
//
//            return answer;
//        }
//    }
//
//}
//// 다른사람 풀이
//// 엄청 간단하다! 심지어 내꺼보다 1ms 빠르다.
//
////import java.util.Arrays;
////class Solution {
////    public int solution(int[] sides) {
////        int answer = 0;
////        Arrays.sort(sides);
////        return sides[2] >= sides[0]+sides[1] ? 2 : 1;
////    }
////}


package Programmers.codetest_basic_100;

public class 삼각형의_완성조건_1_check_o {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] sides = {3, 6 , 2};

        System.out.println(solution.solution(sides));

    }

    static class Solution {
        public int solution(int[] sides) {
            int answer = 0;

            int max = Integer.MIN_VALUE;
            int sum = 0;

            for (int i = 0; i < sides.length; i ++) {

                max = Math.max(max, sides[i]);
                sum += sides[i];

            }

            answer = sum <= 2 * max ? 2 : 1;

            return answer;
        }
    }

}
