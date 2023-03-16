package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 중앙값_구하기 {

    public static void main(String[] args) {

        int[] array = {1,2,7,10,11};

        Solution solution = new Solution();

        System.out.println(solution.solution(array));

    }

    static class Solution {
        public int solution(int[] array) {
            int answer = 0;

            Arrays.sort(array);

            answer = array[(array.length / 2)];

            return answer;
        }
    }
}
