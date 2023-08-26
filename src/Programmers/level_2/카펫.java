package Programmers.level_2;

import java.util.Arrays;

public class 카펫 {

    public static void main(String[] args) {

        int brown = 18;
        int yellow = 6;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(brown, yellow)));


    }

//    static class Solution {
//        public int[] solution(int brown, int yellow) {
//
//            int[] answer = new int[2];
//
//            int map = brown + yellow;
//
//            for (int i = 3;  i<= map; i++) {
//
//                int col = i;
//                int row = map / i;
//
//                if (row < 3) {
//
//                    continue;
//                }
//
//                if (row >= col) {
//
//                    if ((row - 2) * (col - 2) == yellow) {
//
//                        answer[0] = row;
//                        answer[1] = col;
//
//                        return answer;
//                    }
//                }
//            }
//
//            return answer;
//        }
//    }

    static class Solution {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];

            int map = brown + yellow;

            for (int i = 3; i <= map; i++) {

                int x = i;
                int y = map / i;

                if (y < 3) {

                    continue;
                } else if (x >= y) {

                    if ((x - 2) * (y - 2) == yellow) {

                        answer[0] = x;
                        answer[1] = y;

                    }
                }
            }
            return answer;
        }
    }
}
