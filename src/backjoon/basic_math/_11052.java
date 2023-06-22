package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _11052 {

    static ArrayList<Integer> cards_lst = new ArrayList<>();
    static int n;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n + 1];
        int[] answer = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                answer[i] = Math.max(answer[i], answer[i- j] + arr[j]);
            }
        }

        System.out.println(answer[n]);
    }


}
