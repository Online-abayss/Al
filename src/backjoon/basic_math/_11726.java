package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _11726 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] answer = new int[n + 1];

        answer[1] = 0;
        answer[2] = 2;

        for (int i = 3; i <= n; i++) {

            answer[i] = i % 2 == 0 ? answer[i - 1] * 2 - 1 : answer[i - 1] + 1;
        }

        System.out.println(Arrays.toString(answer));

    }
}
