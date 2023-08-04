
package Programmers.codetest_basic_100;
//
//// 어렵다... 인터넷보고 확인해봤다... 대략 어떤느낌으로 풀어야하는지는 알겠다.
//public class 안전지대_check_o {
//
//    public static void main(String[] args) {
//
//        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
//
//        Solution solution = new Solution();
//
//        System.out.println(solution.solution(board));
//
//    }
//
//    static class Solution {
//        public int solution(int[][] board) {
//            int answer = 0;
//
//            int[] dx = {-1, 0, 1, 0, -1, 1, -1, 1};
//            int[] dy = {0, 1, 0, -1, -1, -1, 1, 1};
//
//            int[][] booms = new int [board.length][board.length];
//
//            for (int i = 0; i < board.length; i++) {
//
//                for (int j = 0; j < board.length; j++) {
//
//                        for (int k = 0; k < 8; k++) {
//
//                            int nx = i + dx[k];
//                            int ny = j + dy[k];
//
//                            if (board[i][j] == 1) {
//
//                                booms[i][j] = 1;
//                            }
//
//                            if (nx >= 0 && nx < board.length && ny >= 0 && ny < board.length && board[nx][ny] == 1) {
//
//                                booms[i][j] = 1;
//                            }
//                        }
//                    }
//                }
//
//            for ( int i = 0; i < booms.length; i++) {
//
//                for (int j = 0; j < booms.length; j++) {
//
//                    if (booms[i][j] == 0) {
//
//                        answer ++;
//                    }
//                }
//            }
//
//            return answer;
//        }
//    }
//}


public class 안전지대_check_o {

    public static void main(String[] args) {

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};

        Solution solution = new Solution();

        System.out.println(solution.solution(board));


    }

    static class Solution {
        public int solution(int[][] board) {
            int answer = 0;

            length = board.length;

            map = new int[length][length];

            for (int i = 0; i < length; i++) {

                for (int j = 0; j < length; j++) {

                    if (board[i][j] == 1) {

                        boom_board(i,j);
                    }
                }
            }



            for (int i = 0; i < length; i++) {

                for (int j = 0; j < length; j++) {

                    if (map[i][j] == 0) {

                        answer ++;
                    }
                }
            }


            return answer;
        }

        private void boom_board(int i, int j) {

            map[i][j] = 1;

            for (int a = 0; a < 8; a++) {

                int x = dx[a] + i;
                int y = dy[a] + j;

                if (x < 0 || y < 0 || x >= length || y >= length) {

                    continue;
                }
                map[x][y] = 1;
            }

        }
    }

    static int length;
    static int[][] map;

    static int[] dx = {0,0,1,-1,1,1,-1,-1};
    static int[] dy = {1,-1,0,0,1,-1,1,-1};
}
