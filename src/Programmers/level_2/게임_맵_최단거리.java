package Programmers.level_2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임_맵_최단거리 {

    public static void main(String[] args) {

        int[][] maps = {{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}};

        Solution solution = new Solution();

        System.out.println(solution.solution(maps));

    }

    static int[][] visited;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    static class Solution {
        public int solution(int[][] maps) {
            int answer = 0;

            visited = new int[maps.length][maps[0].length];

            bfs(maps);

            return answer = visited[maps.length - 1][maps[0].length - 1] == 0 ? -1 : visited[maps.length - 1][maps[0].length - 1];
        }

        private void bfs(int[][] maps) {

            int start_x = 0;
            int start_y = 0;

            visited[0][0] = 1;

            Queue<int[]> queue = new LinkedList<>();

            queue.add(new int[]{start_x, start_y});

            while (!queue.isEmpty()) {

                int[] now = queue.poll();
                int x = now[0];
                int y = now[1];

                for (int i = 0; i < 4; i++) {

                    int next_x = x + dx[i];
                    int next_y = y + dy[i];

                    if (next_y < 0 || next_x <0 || next_x >= maps.length || next_y >= maps[0].length) {

                        continue;
                    }

                    if (visited[next_x][next_y] == 0 && maps[next_x][next_y] == 1) {

                        visited[next_x][next_y] = visited[x][y] + 1;
                        queue.add(new int[]{next_x, next_y});
                    }
                }
                }

            }


    }
}
