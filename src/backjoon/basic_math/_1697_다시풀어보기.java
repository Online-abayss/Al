package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1697_다시풀어보기 {

    static int n;
    static int m;

    static int[] visited = new int[100001];


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int result = bfs(n);

        System.out.println(result);

    }

    private static int bfs(int n) {

        Queue<Integer> q = new LinkedList<>();

        q.add(n);
        int idx = n;
        int now_number = 0;
        visited[idx] = 1;
        while (!q.isEmpty()) {

            now_number = q.remove();

            if (now_number == m) {

                return visited[now_number] - 1;
            }
            if (now_number -1 >= 0 && visited[now_number -1] == 0) {

                visited[now_number - 1] = visited[now_number] + 1;
                q.add(now_number -1);
            }
            if (now_number + 1 <= 100000 && visited[now_number + 1] == 0) {

                visited[now_number + 1] = visited[now_number] + 1;
                q.add(now_number + 1);
            }
            if (now_number * 2 <= 100000 && visited[2 * now_number] == 0) {

                visited[now_number * 2] = visited[now_number] + 1;
                q.add(now_number * 2);
            }
        }
        return -1;
    }

}
