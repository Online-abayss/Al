package Programmers.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 전력망을_둘로_나누기 {

    public static void main(String[] args) {

        int n = 9;
        int[][] wires = {{1,3}, {2,3}, {3,4}, {4,5}, {4,6}, {4,7}, {7,8}, {7,9}};

        Solution solution = new Solution();

        System.out.println(solution.solution(n, wires));


    }

//    static ArrayList<Integer>[] graph;
//    static int min;
//    static class Solution {
//        public int solution(int n, int[][] wires) {
//
//            graph = new ArrayList[n + 1];
//            min = Integer.MAX_VALUE;
//
//            for (int i = 1; i <= n; i++) {
//
//                graph[i] = new ArrayList<>();
//            }
//
//            for (int i = 0; i < wires.length; i++) {
//
//                int v1 = wires[i][0];
//                int v2 = wires[i][1];
//                graph[v1].add(v2);
//                graph[v2].add(v1);
//
//                boolean[] visited = new boolean[n + 1];
//
//                graph[v1].remove(v2);
//                graph[v2].remove(v1);
//
//                int cnt = dfs(1, visited);
//
//                int diff = Math.abs(cnt - (n - cnt));
//                min = Math.min(min, diff);
//
//                graph[v1].add(v2);
//                graph[v2].add(v1);
//            }
//
//            return min;
//        }
//
//        private int dfs(int v, boolean[] visited) {
//
//            visited[v] = true;
//            int cnt = 1;
//
//            for (int next : graph[v]) {
//
//                if (!visited[next]) {
//
//                    cnt += dfs(next, visited);
//                }
//            }
//
//            return cnt;
//
//        }
//    }


    static int[][] graph;
    static class Solution {
        public int solution(int n, int[][] wires) {
            int answer = n + 1;

            graph = new int[n + 1][n + 1];

            // 입력하고
            for (int i = 0; i < wires.length; i++) {

                graph[wires[i][0]][wires[i][1]] = 1;
                graph[wires[i][1]][wires[i][0]] = 1;
            }

            int a = 0;
            int b = 0;

            for (int i = 0; i < wires.length; i++) {

                a = graph[i][0];
                b = graph[i][1];

                graph[a][b] = 0;
                graph[b][a] = 0;

                answer = Math.min(answer, bfs(n, a));
            }

            return answer;
        }

        private int bfs(int n, int a) {

            boolean[] visited = new boolean[n + 1];

            Queue<Integer> queue = new LinkedList<>();
            int cnt = 1;

            queue.add(a);

            while (!queue.isEmpty()) {

                visited[a] = true;
                int point = queue.poll();

                for (int i = 1; i <= n; i++) {

                    if (!visited[i] && graph[point][i] == 1) {

                        cnt ++;
                        queue.add(i);
                    }
                }

            }

            return Math.abs(n - 2 * cnt);

        }
    }
}
