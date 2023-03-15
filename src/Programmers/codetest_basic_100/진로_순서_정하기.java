package Programmers.codetest_basic_100;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 진로_순서_정하기 {

    public static void main(String[] args) {

        int[] emergency = {3,76,24};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(emergency)));

    }

    static class Solution {
        public int[] solution(int[] emergency) {
            int[] answer = new int[emergency.length];

            for (int i = 0; i < emergency.length; i++) {

                for (int j = 0; j < emergency.length; j++) {

                    if (emergency[i] < emergency[j]) {

                        answer[i]++;
                    }
                }

                answer[i]++;
            }

            return answer;
        }
    }
}
