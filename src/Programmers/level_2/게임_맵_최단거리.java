package Programmers.level_2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임_맵_최단거리 {

    public static void main(String[] args) {

        int[][] maps = {{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}};

        Solution solution = new Solution();

        System.out.println(solution.solution(maps));

    }

    static boolean[][] visited;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    static int count;
    static class Solution {
        public int solution(int[][] maps) {
            int answer = 0;

            visited = new boolean[maps[0].length][maps.length];

            bfs(maps);

            answer = count;
            return answer;
        }

        private void bfs(int[][] maps) {

            int x = 0;
            int y = 0;
            visited[x][y] = true;

            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{x,y});

            while (!queue.isEmpty()) {

                int[] temp = queue.remove();
                int a = temp[0];
                int b = temp[1];

                for (int i = 0; i < 4; i++) {

                    int q = a + dx[i];
                    int w = b + dy[i];

                    if (q < 0 || w < 0 || q > maps[0].length - 1 || q > maps.length - 1) {

                        continue;
                    }

                    if (!visited[q][w] && maps[q][w] == 1) {

                        count += 1;
                        queue.add(new int[]{q, w});
                    }
                }
            }
        }


    }
}
