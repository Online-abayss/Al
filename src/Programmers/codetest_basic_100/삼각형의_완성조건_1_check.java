package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 삼각형의_완성조건_1_check {

    public static void main(String[] args) {

        int[] sides = {1,2,3};

        Solution solution = new Solution();

        System.out.println(solution.solution(sides));

    }


    static class Solution {
        public int solution(int[] sides) {
            int answer = 0;

            int max_num = Arrays.stream(sides).max().getAsInt();
            int sum_num = Arrays.stream(sides).sum();

            if (sum_num - (max_num * 2) > 0 ) {

                answer = 1;
            } else {

                answer = 2;
            }

            return answer;
        }
    }

}
// 다른사람 풀이
// 엄청 간단하다! 심지어 내꺼보다 1ms 빠르다.

//import java.util.Arrays;
//class Solution {
//    public int solution(int[] sides) {
//        int answer = 0;
//        Arrays.sort(sides);
//        return sides[2] >= sides[0]+sides[1] ? 2 : 1;
//    }
//}
