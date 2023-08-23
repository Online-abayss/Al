package Programmers.level_2;

import java.util.Arrays;

public class 행렬의_곱셈 {


    public static void main(String[] args) {


        int[][] arr1  = {{1,4}, {3,2}, {4,1}};
        int[][] arr2 = {{3,3},{3,3}};

        Solution solution = new Solution();

        System.out.println(Arrays.deepToString(solution.solution(arr1, arr2)));

    }

    // arr1[0][0] * arr2[0][0] + arr1[0][1] * arr2[1][0] + arr1[0][2] * arr2[2][0] = return[0][0];
    // arr1[0][1] * arr2[0][0] + arr1[0][1] * arr2[1][0] + arr1[0][1] * arr2[2][0] = return[0][1];
    static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {

            int x = arr1.length;
            int x_x = arr1[0].length;
            int y = arr2[0].length;

            int[][] answer = new int[x][y];



            for (int i = 0; i < x; i++) {

                for (int j = 0; j < y; j++) {

                    int sum = 0;
                    for (int k = 0; k < x_x; k++) {

                        sum += arr1[i][k] * arr2[k][j];
                    }
                    answer[i][j] = sum;
                }
            }
            return answer;
        }
    }
}
