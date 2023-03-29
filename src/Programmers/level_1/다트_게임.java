package Programmers.level_1;

import java.util.Arrays;

public class 다트_게임 {

    public static void main(String[] args) {

        String dartResult = "1S2D*3T";

        Solution solution = new Solution();

        System.out.println(solution.solution(dartResult));
    }

    // s = 1 , d = 2; t = 3 // * = 해당 점수 및 전 점수 X2 (단, 처음에 * 나오면 해당 점수만) (또한 중첩됨) , # = 해당 점수 -
    static class Solution {
        public int solution(String dartResult) {
            int answer = 0;

            String[] arr_str = dartResult.split("S|D|T|#");

            System.out.println(Arrays.toString(arr_str));

            return answer;
        }
    }
}
