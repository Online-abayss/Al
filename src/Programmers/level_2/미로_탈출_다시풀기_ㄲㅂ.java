package Programmers.level_2;

import java.util.LinkedList;
import java.util.Queue;

public class 미로_탈출_다시풀기_ㄲㅂ {


    public static void main(String[] args) {

        String[] maps = {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"};

        Solution solution = new Solution();

        System.out.println(solution.solution(maps));

    }

    static char[][] miro_ch;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static class Solution {
        public int solution(String[] maps) {
            int answer = 0;

            miro_ch = new char[maps.length][maps[0].length()];

            int[] start = new int[2];
            int[] labor = new int[2];

            for (int i = 0; i < maps.length; i++) {

                char[] temp = maps[i].toCharArray();

                for (int j = 0; j < temp.length; j++) {

                    if (temp[j] == 'S') {

                        start[0] = i;
                        start[1] = j;
                        // start = new int[];
                    }

                    if (temp[j] == 'L') {

                        labor = new int[]{i, j};
                    }
                }
            }

            int labor_cnt = bfs(start, 'L');
            int end_cnt = bfs(labor, 'E');

            if (labor_cnt == -1 || end_cnt == -1) {

                return -1;
            }

            return answer = labor_cnt + end_cnt;
        }

        private int bfs(int[] start, char goal) {

            Queue<int[]> queue = new LinkedList<>();

            queue.add(start);
            int cnt = 0;

            boolean[][] visited = new boolean[miro_ch.length][miro_ch[0].length];

            while (!queue.isEmpty()) {

                int[] now = queue.poll();

                int x = now[0];
                int y = now[1];

                visited[x][y] = true;

                if (miro_ch[x][y] == goal) {

                    return cnt;
                }

                for (int i = 0; i < 4; i++) {

                    int nx = dx[i] + x;
                    int ny = dy[i] + y;

                    if (nx < 0 || nx >= miro_ch.length || ny < 0 || ny >= miro_ch[0].length) {

                        continue;
                    }

                    if (!visited[nx][ny] && miro_ch[nx][ny] != 'X') {

                        visited[nx][ny] = true;
                        queue.add(new int[]{nx,ny});
                        cnt ++;
                    }
                }

            }

            return -1;
        }


    }
}
