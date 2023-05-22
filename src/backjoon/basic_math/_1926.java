package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1926 {

    static int[][] arr;
    static boolean[][] visited;
    
    static int count = 0;
    
    static int weight;
    static int height;


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr_s = br.readLine().split(" ");
        weight = Integer.parseInt(arr_s[0]);
        height = Integer.parseInt(arr_s[1]);

        arr = new int[weight][height];
        for (int i = 0; i < weight; i++) {

            String[] arr_cases = br.readLine().split(" ");

            for (int j = 0 ; j < height; j++ ){

                arr[i][j] = Integer.parseInt(arr_cases[j]);
            }
        }

        visited = new boolean[weight][height];
        int max = 0;
        int sum_nums = 0;
        
        for (int i = 0; i < weight; i++) {
            int cnt = 0;

            for (int j = 0; j < height; j++) {
                
                if (!visited[i][j] && arr[i][j] == 1) {
                    
                    dfs(i, j, 1);

                    max = Math.max(max, count);

                    cnt++;
                }

            }
            
            sum_nums += cnt;
        }



        System.out.println(sum_nums);
        System.out.println(max);
    }
    
    

    private static void dfs(int start_x, int start_y, int cnt) {
        
        visited[start_x][start_y] = true;

        count = cnt;
        
        int[] x = {0,0,-1,+1};
        int[] y = {-1,1,0,0};
        
        for (int i = 0; i <4; i++) {
            
            int dx = x[i] + start_x;
            int dy = y[i] + start_y;
            
            if (dx < 0 || dy < 0 || dx > weight -1 || dy > height -1) {
                
                continue;
            }
            
            if (!visited[dx][dy] && arr[dx][dy] == 1) {
                
                dfs(dx, dy, count + 1);
            }
        }
    }
}
