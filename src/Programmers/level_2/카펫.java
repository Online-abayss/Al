package Programmers.level_2;

import java.util.Arrays;

public class 카펫 {

    public static void main(String[] args) {

        int brown = 24;
        int yellow = 24;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(brown, yellow)));


    }

    static class Solution {
        public int[] solution(int brown, int yellow) {

            int sum = brown + yellow;

            int number = (int) Math.floor(Math.sqrt(sum));

            int[] answer = {sum / number, number};

            return answer;
        }
    }
}
