package Programmers.level_1;

import java.util.Arrays;
public class 예산 {

    public static void main(String[] args) {

        int[] d = {1,3,2,5,4};
        int budget = 9;

        Solution solution = new Solution();

        System.out.println(solution.solution(d, budget));

    }

    static class Solution {
        public int solution(int[] d, int budget) {
            int answer = 0;

            int sum = 0;
            Arrays.sort(d);

            for (int i = 0 ; i < d.length; i++) {

                sum += d[i];

                if (sum <= budget) {
                    answer ++;
                }
            }

            return answer;
        }
    }

}
