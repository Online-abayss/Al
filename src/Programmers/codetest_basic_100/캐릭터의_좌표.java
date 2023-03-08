package Programmers.codetest_basic_100;

import java.util.Arrays;

// 이동 시 항상 조건을 생각해야 한다는걸 몰랐음. 미리 다 합해서 결과로 처리 해버림.

public class 캐릭터의_좌표 {

    public static void main(String[] args) {

//        String[] keyinput = {"left", "right", "up", "right", "right"};
//        int[] board = {11,11};

        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] board = {7, 9};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(keyinput, board)));

    }

    static class Solution {
        public int[] solution(String[] keyinput, int[] board) {

            int nx = 0;
            int ny = 0;

            for (String s : keyinput) {

                if (s.equals("left")) {

                    if (nx > -board[0] / 2) {

                        nx -= 1;
                    }
                } else if (s.equals("right")) {

                    if (nx < board[0] / 2) {

                        nx += 1;
                    }
                } else if (s.equals("up")) {
                    if (ny < board[1] / 2) {

                        ny += 1;
                    }

                } else if (s.equals("down")) {
                    if (ny > -board[1] / 2) {

                        ny -= 1;
                    }
                }

            }

            int[] answer = {nx, ny};

            return answer;
        }
    }
}
