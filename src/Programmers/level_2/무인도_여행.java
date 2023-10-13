package Programmers.level_2;

import java.util.*;

public class 무인도_여행 {

    public static void main(String[] args) {

        String[] maps =   {"X591X","X1X5X","X231X", "1XXX1"};

        Solution solution = new Solution();

        System.out.println(solution.solution(maps));


    }

// 내가 잘못 푼 구간이 있는듯. 푸는 방식은 동일한데.
//    static boolean[][] visited;
//    static int[][] map;
//
//    static int[] dx = {0,0,-1,1};
//    static int[] dy = {-1,1,0,0};
//
//    static int limit_x;
//    static int limit_y;
//    static ArrayList<Integer> sum_lst = new ArrayList<>();
//    static class Solution {
//        public ArrayList<Integer> solution(String[] maps) {
//
//
//            limit_x = maps.length;
//            limit_y = maps[0].length();
//
//            map = new int[limit_x][limit_y];
//            visited = new boolean[limit_x][limit_y];
//
//            for (int i = 0; i < maps.length; i++) {
//
//                String[] arr_maps = maps[i].split("");
//
//                for (int j = 0; j < arr_maps.length; j++) {
//
//                    map[i][j] = arr_maps[j].equals("X") ? 0 : Integer.parseInt(arr_maps[j]);
//                }
//
//            }
//
//            for (int i = 0; i < maps.length; i++) {
//
//                for (int j = 0; j < maps[0].length(); j++) {
//
//                    if (!visited[i][j]) {
//
//                        bfs(map, i , j);
//                    }
//                }
//
//            }
//            Collections.sort(sum_lst);
//
//            if (sum_lst.isEmpty()) {
//
//                sum_lst.add(-1);
//            }
//            return sum_lst;
//        }
//
//        private void bfs(int[][] map, int a, int b) {
//
//            int start_x = a;
//            int start_y = b;
//
//            visited[start_x][start_y] = true;
//
//            Queue<int[]> qu = new LinkedList<>();
//
//            qu.offer(new int[] {start_x,start_y});
//
//            int sum = 0;
//
//            while (!qu.isEmpty()) {
//
//                int[] now = qu.poll();
//                int x = now[0];
//                int y = now[1];
//
//                for (int i = 0; i < 4; i++) {
//
//                    int next_x = dx[i] + x;
//                    int next_y = dy[i] + y;
//
//                    if (next_x < 0 || next_y < 0 || next_x >= limit_x || next_y >= limit_y) {
//
//                        continue;
//                    }
//
//                    if (!visited[next_x][next_y] && map[next_x][next_y] != 0) {
//
//                        visited[next_x][next_y] = true;
//                        qu.offer(new int[]{next_x, next_y});
//                        sum += map[next_x][next_y];
//                    }
//                }
//            }
//
//            if (sum != 0) {
//
//                sum_lst.add(sum);
//            }
//
//        }
//    }

    static boolean[][] visited;
    static int[][] maps_int;

    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static class Solution {
        public int[] solution(String[] maps) {
            int[] answer = {};

            maps_int = new int[maps.length][maps[0].length()];
            visited = new boolean[maps.length][maps[0].length()];

            for (int i = 0; i < maps.length; i++) {

                char[] ch_arr = maps[i].toCharArray();

                for (int j = 0; j < ch_arr.length; j++) {

                    if (ch_arr[j] == 'X') {

                        maps_int[i][j] = 0;

                    } else {

                        maps_int[i][j] = ch_arr[j] - '0';
                    }
                }

            }

            for (int i = 0; i < maps.length; i++) {

                for (int j = 0; j < maps[0].length(); j++) {

                    if (!visited[i][j]) {

                        bfs(i,j);
                    }
                }
            }

            return answer;
        }

        private void bfs(int a, int b) {

            Queue<int[]> queue = new LinkedList<>();

            queue.add(new int[] {a,b});




        }
    }
}
