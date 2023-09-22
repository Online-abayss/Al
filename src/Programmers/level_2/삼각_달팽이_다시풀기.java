package Programmers.level_2;

import java.util.Arrays;

public class 삼각_달팽이_다시풀기 {

    public static void main(String[] args) {

        int n = 4;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(n)));

    }

    static class Solution {
        public int[] solution(int n) {
            int[] answer = {};

            int[][] matrix = new int[n][n];

            int x = -1, y = 0;
            int num = 1;

            // 꺽는 기준.
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (i % 3 == 0) {
                        x++;
                    } else if (i % 3 == 1) {
                        y++;
                    } else if (i % 3 == 2) {
                        x--;
                        y--;
                    }

                    matrix[x][y] = num++;
                }
            }

            System.out.println(Arrays.deepToString(matrix));

            return answer;
        }
    }
}
// https://minhamina.tistory.com/58
