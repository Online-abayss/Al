package Programmers.codetest_basic_100;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 진로_순서_정하기 {

    public static void main(String[] args) {

        int[] emergency = {3,76,24};

        Solution solution = new Solution();

        System.out.println(solution.solution(emergency));

    }

    static class Solution {
        public int[] solution(int[] emergency) {
            int[] answer = new int[emergency.length];

            Integer[] b = Arrays.stream(emergency).boxed().toArray(Integer[]::new);

            Arrays.sort(emergency, Collections.reverseOrder());

            for (int a : arr_int) {

11
            }

            return answer;
        }
    }
}
