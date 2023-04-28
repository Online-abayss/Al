package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int[] test = new int[1001];

        Arrays.fill(test, 0);
        test[0] = 2;
        test[1] = 2;

        for (int i = 2; i < test.length; i++) {

            for (int j = 1; j * i < test.length; j++) {

                test[i * j ] += 1;
            }
        }

        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < t; i++) {

            if (test[Integer.parseInt(st.nextToken())] == 1) {

                cnt ++;
            }
        }
        System.out.println(cnt);

    }
}

// 다른사람이 푼거

//https://st-lab.tistory.com/80

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.StringTokenizer;
//
//public class Main {
//
//	public static void main(String[] args) throws IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		br.readLine();	// N 은 쓰지 않음.
//		int count = 0;
//
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//
//		while(st.hasMoreTokens()) {
//
//			// 소수인경우 true, 아닌경우 false
//			boolean isPrime = true;
//
//			int num = Integer.parseInt(st.nextToken());
//
//			if(num == 1) {
//				continue;
//			}
//			for(int i = 2; i <= Math.sqrt(num); i++) {
//				if(num % i == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			if(isPrime) {
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
//
//}
