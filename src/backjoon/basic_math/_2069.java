package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2069 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = br.readLine().split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        int d  = gcd(a, b);

        System.out.println(d);
        System.out.println(a * b / d);


    }

    private static int gcd(int a, int b) {

        while (b != 0) {

            int r = a % b;

            a = b;
            b = r;
        }
        return a;
    }
}
