package Programmers.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 숫자_카드_나누기 {

    public static void main(String[] args) {


        int[] arrayA = {10, 17};
        int[] arrayb = {5, 20};

        Solution solution = new Solution();

        System.out.println(solution.solution(arrayA, arrayb));

    }

    static class Solution {
        public int solution(int[] arrayA, int[] arrayB) {
            int answer = 0;

            Arrays.sort(arrayA);

            ArrayList<Integer> test = new ArrayList<>();

            for (int i = 1; i <= (int) Math.sqrt(arrayA[0]); i++ ) {

                 if (arrayA[0] % i == 0) {

                     test.add(i);
                     test.add(arrayA[0] / i);
                 }
            }

            int cnt_a = 0;

            ArrayList<Integer> divided_number = new ArrayList<>();

            // 35 , 119
            for (int i = 1; i < arrayA.length; i++) {

                // 2, 7, 14
                for (int j = 1; j < test.size(); j++) {

                    // 35 % 7 == 0
                    if (arrayA[i] % test.get(j) == 0) {


                    }
                }
            }


            System.out.println(test);


            return answer;
        }
    }
}
