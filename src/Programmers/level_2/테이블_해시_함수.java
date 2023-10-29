package Programmers.level_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class 테이블_해시_함수 {


    public static void main(String[] args) {

        int[][] data = {{2,2,6},{1,5,10},{4,2,9},{3,8,3}};

        int col = 2;
        int row_begin = 2;
        int row_end = 3;

        Solution solution = new Solution();

        System.out.println(solution.solution(data, col, row_begin , row_end));

    }

    static class Solution {
        public int solution(int[][] data, int col, int row_begin, int row_end) {
            int answer = 0;

            Arrays.sort(data, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {

                    if (o1[col - 1] == o2[col - 1]) {

                        return  o2[0] - o1[0];
                    }

                    return o1[col - 1] - o2[col - 1];
                }
            });

            for (int i = row_begin - 1; i < row_end; i++) {

                int sum = 0;

                for (int j = 0; j < data[0].length; j++) {

                    sum += data[i][j] % (i + 1);
                }

                answer = answer ^ sum;

            }

            return answer;
        }
    }

}
