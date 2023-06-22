package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _11726 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] answer = new int[1001];

        answer[1] = 1;
        answer[2] = 2;

        for (int i = 3; i <= n; i++) {

            answer[i] = answer[i-2] + answer[i -1] % 10007;
        }

        System.out.println(answer[n]);

    }
}
