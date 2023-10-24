package Programmers.level_2;

import java.util.Arrays;

public class 배달_계속다시풀기 {

    public static void main(String[] args) {


        int n = 5;
        int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2}, {5,3,1}, {5,4,2}};

        int k = 3;

        Solution solution = new Solution();

        System.out.println(solution.solution(n, road, k));

    }

    static class Solution {
        public int solution(int n, int[][] road, int K) {
            int answer = 0;

            int[][] map = new int[n][n];

            for (int i = 0; i< map.length; i++) {

                for (int j = 0; j < map[0].length; j++) {

                    if (i == j) {

                        continue;
                    }
                    map[i][j] = 500001;
                }
            }

            System.out.println(Arrays.deepToString(map));

            for (int[] data : road) {

                // map[0][1] < 1

                if (map[data[0] - 1][data[1] - 1] < data[2]) {

                    continue;

                }

                map[data[0]-1][data[1]-1]=data[2];
                map[data[1]-1][data[0]-1]=data[2];
            }

            System.out.println(Arrays.deepToString(map));

            for (int i = 0; i < map.length; i++) {

                for (int j = 0; j < map.length; j++) {

                    for (int k = 0; k < map.length; k++) {

                        // 2 , 3 > 2 , 1 + 1 , 3
                        if (map[j][k] > map[j][i] + map[i][k]) {

                            map[j][k] = map[j][i] + map[i][k];
                        }
                    }
                }
            }

            System.out.println(Arrays.deepToString(map));

            for (int i = 0; i < map[0].length; i++) {

                if (map[0][i] <= K) {

                    answer++;
                }
            }

            return answer;
        }
    }
}


// https://taehoung0102.tistory.com/127
