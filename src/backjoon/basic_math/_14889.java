package backjoon.basic_math;

import com.sun.jdi.Value;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _14889 {

    static int N;
    static int min = Integer.MAX_VALUE;
    static int[][] arr;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visit = new boolean[N];

        for(int i = 0 ; i < N ; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            for(int j = 0 ; str.hasMoreTokens();j++) {
                arr[i][j]= Integer.parseInt(str.nextToken());
            }
        }

        dfs(0,0);

        System.out.println(min);


    }
    public static void dfs(int depth, int a) {

        if(depth == N/2) {
            diff();
            return;
        }

        for(int i = a ; i < N ; i++) {
            visit[i]=true;
            dfs(depth+1, i+1);
            visit[i]=false;
        }
    }

    public static void diff() {
        int start = 0;
        int link = 0;
        for(int i = 0 ; i < N-1 ; i++) {
            for(int j = i+1 ; j < N ; j++) {
                if(visit[i]==true && visit[j]==true) {
                    start += arr[i][j];
                    start += arr[j][i];
                }
                else if(visit[i]==false && visit[j]==false) {
                    link += arr[i][j];
                    link += arr[j][i];
                }

            }
        }

        int val = Math.abs(start - link);

        if(val == 0) {
            System.out.println(val);
            System.exit(0);
        }

        min=Math.min(min,val);
    }

}

// https://infodon.tistory.com/63
// 울거같다... 뭔가 희망이 보일려다가 꺾임... 설계 잘못해서 그런듯.
//    static int t;
//
//    static int[][] arr;
//
//    static boolean[][] visited;
//
//    static int sum;
//    static int min = Integer.MAX_VALUE;
//
//    static ArrayList<Integer> team_lst = new ArrayList<>();
//
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        t = Integer.parseInt(br.readLine());
//
//        arr = new int[t][t];
//
//        for (int i = 0; i < t; i++) {
//
//            StringTokenizer st = new StringTokenizer(br.readLine());
//
//            for (int j = 0; j < t; j++) {
//
//                arr[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//
//        visited = new boolean[t][t];
//
//        dfs(1,0);
//
//        choice(0);
//    }
//
//    private static void choice(int depth) {
//
//
//        if (depth != t /2) {
//
//            for (int i = depth; i < team_lst.size(); i++) {
//
//                sum += team_lst.get(i);
//
//                choice(depth + 1);
//            }
//        } else {
//
//            min = Math.min()
//        }
//    }
//
//
//    private static void dfs(int weight, int height) {
//
//        visited[weight][height] = true;
//
//        if (arr[weight][height] != 0) {
//
//            team_lst.add(arr[weight][height] + arr[height][weight]);
//
//        }
//
//        int[] dx = {0,0,-1,1};
//        int[] dy = {-1,1,0,0};
//
//        for (int i = 0; i < 4; i++) {
//
//            int x = dx[i] + weight;
//            int y = dy[i] + height;
//
//            if (x < 0 || y < 0 || x >= t || y >= t) {
//
//                continue;
//            }
//
//            if (!visited[x][y] && arr[x][y] != 0) {
//
//                dfs(x,y);
//            }
//
//        }
//
//
//
//    }
