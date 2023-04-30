package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1929 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] prime_numbers = new int[1000001];

        for (int i = 2; i < prime_numbers.length; i++) {

            for (int j = 1; j * i < prime_numbers.length; j++) {

                prime_numbers[i * j] += 1;
            }
        }

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = a; i <= b; i++) {

            if (prime_numbers[i] == 1) {

                System.out.println(i);
            }
        }
    }
}
