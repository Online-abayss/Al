package Programmers.level_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 행렬_테두리_회전하기 {

    public static void main(String[] args) {


        int rows = 6;
        int columns = 6;
        int[][] queries = {{2,2,5,4}, {3,3,6,6,}, {5,1,6,3}};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(rows, columns, queries)));

    }

    // 빈칸 = (x2 - x1 ) * ( y2 - y1 );

    static int[][] matrix;
    static class Solution {
        public int[] solution(int rows, int columns, int[][] queries) {

            matrix = new int[rows][columns];
            int[] answer = new int[queries.length];

            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < columns; j++) {

                    matrix[i][j] = i*columns + j + 1;
                }
            }

            for (int i = 0; i < queries.length; i++) {

                answer[i] = rotate(queries[i]);
            }

            return answer;
        }




        private int rotate(int[] query) {

            int r1 = query[0] - 1;
            int c1 = query[1] - 1;
            int r2 = query[2] - 1;
            int c2 = query[3] - 1;

            int temp = matrix[r1][c1];
            int min = temp;

            for (int i = r1; i < r2; i++) {

                matrix[i][c1] = matrix[i + 1][c1];

                min = Math.min(min, matrix[i][c1]);


            }

            for (int i = c1; i < c2; i++) {

                matrix[r2][i] = matrix[r2][i + 1];

                min = Math.min(min, matrix[r2][i]);
            }

            for (int i = r2; i > r1; i--) {

                matrix[i][c2] = matrix[i - 1][c2];

                min = Math.min(min , matrix[i][c2]);
            }

            for (int i = c2; i > c1; i--) {

                matrix[r1][i] = matrix[r1][i -1];

                min = Math.min(min , matrix[i][c2]);
            }

            matrix[r1][c1 + 1] = temp;

            return min;
        }
    }
}
