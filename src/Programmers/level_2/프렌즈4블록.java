package Programmers.level_2;



public class 프렌즈4블록 {

    public static void main(String[] args) {

        String[] board = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
        int m = 6;
        int n = 6;

        Solution solution = new Solution();

        System.out.println(solution.solution(m, n, board));

    }

    static int sum;
    static class Solution {
        public int solution(int m, int n, String[] board) {
            int answer = 0;

            char[][] map = new char[m][n];

            for (int i = 0; i < m; i++) {

                map[i] = board[i].toCharArray();
            }

            while (true) {

                boolean[][] check_map = new boolean[m][n];

                for (int i = 0; i < m - 1; i++) {

                    for (int j = 0; j < n - 1; j++) {

                        char c = map[i][j];

                        if (c == ' ') {

                            continue;
                        } else if (c == map[i + 1][j] && c == map[i][j + 1] && c == map[i + 1][j + 1]) {

                            check_map[i][j] = true;
                            check_map[i][j +1] = true;
                            check_map[i + 1][j] = true;
                            check_map[i + 1][j + 1] = true;

                        }

                    }
                }

                int delete_cnt = 0;
                for (int i = 0; i < m; i++) {

                    for (int j = 0; j < n; j++) {

                        if (check_map[i][j]) {

                            map[i][j] = ' ';
                            delete_cnt ++;
                        }
                    }
                }

                sum += delete_cnt;


                for (int j = 0; j < n; j++) {

                    int black_cnt = 0;

                    for (int i = m - 1; i >= 0; i--) {

                        if (map[i][j] == ' ') {

                            black_cnt ++;
                        } else if (black_cnt > 0 && map[i][j] != ' ') {

                            map[i + black_cnt][j] = map[i][j];
                            map[i][j] = ' ';
                        }
                    }
                }

                if (delete_cnt == 0) {

                    break;
                }

            }


            answer = sum;

            return answer;
        }
    }
}
