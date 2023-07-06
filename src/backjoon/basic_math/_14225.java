package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _14225 {

    static int n;
    static int[] arr;
    static boolean[] visited = new boolean[20*100000 + 10];
    static int answer = 1;

    public static void main(String[] args) throws IOException {

        // 이해함
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        dfs(0,0);
        while(visited[answer]){
            answer++;
        }
        System.out.println(answer);
    }

    static void dfs(int idx,int sum){
        if(idx == n){
            visited[sum] = true;
        }
        else{
            dfs(idx+1,sum+arr[idx]);
            dfs(idx+1,sum);
        }
    }

}

// 망겜.
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        t = Integer.parseInt(br.readLine());
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        map = new int[t];
//
//        for (int i = 0; i < t; i++) {
//
//            map[i] = Integer.parseInt(st.nextToken());
//
//        }
//
//        visited = new boolean[100001];
//
//        for (int i = 0; i < t; i++) {
//
//            if (!visited[map[i]]) {
//
//                sum_lst.add(map[i]);
//                dfs(map[i], 0);
//                visited[map[i]] = false;
//            }
//        }
//
//        System.out.println(sum_lst);
//    }
//
//    private static void dfs(int sum_number, int depth) {
//
//        visited[sum_number] = true;
//
//        if (depth == 3) {
//
//            return;
//        }
//
//        for (int i = 0; i < t; i ++) {
//
//             if (!visited[map[i]]) {
//
//                 sum_number = sum_number + map[i];
//                 sum_lst.add(sum_number);
//                 dfs(sum_number, depth + 1);
//                 visited[map[i]] = false;
//             }
//        }
//    }
