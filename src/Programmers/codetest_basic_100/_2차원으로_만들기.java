package Programmers.codetest_basic_100;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _2차원으로_만들기 {

    public static void main(String[] args) {

        int[] num_list = {1,2,3,4,5,6,7,8};
        int n = 2;

        Solution solution = new Solution();

        System.out.println(Arrays.deepToString(solution.solution(num_list, n)));

    }

    static class Solution {
        public int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length / n][n];

            for (int i = 0; i < num_list.length; i++) {

                answer[i / n][i % n] = num_list[i];
            }

            return answer;
        }
    }
}
