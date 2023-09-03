package Programmers.level_2;

public class 피로도 {

    public static void main(String[] args) {

        int k = 80;

        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        Solution solution = new Solution();

        System.out.println(solution.solution(k, dungeons));

    }

    static class Solution {
        static boolean[] visited;
        static int count = 0;

        public int solution(int k, int[][] dungeons) {
            visited = new boolean[dungeons.length];
            dfs(0, k, dungeons);
            return count;
        }

        private void dfs(int depth, int k, int[][] dungeons) {
            for (int i = 0; i < dungeons.length; i++) {
                if (visited[i] || dungeons[i][0] > k) {
                    continue;
                }
                visited[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
            count = Math.max(count, depth);
        }
    }
}
