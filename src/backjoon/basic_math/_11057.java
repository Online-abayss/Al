package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _11057 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int[] arr = new int[10];

        Arrays.fill(arr,1);

        for (int i = 0; i < t - 1; i ++) {

            for (int j = 1; j < 10; j++) {

                arr[j] += arr[j -1];
            }
        }

        int sum  = 0;

        for (int i : arr) {

            sum += i;
        }

        System.out.println(sum % 10007);
    }

}

// 위에꺼가 안되고 밑에꺼가 되는지 모르겠음. 값 알맞게 나오는데... ㅂㄷ.
// import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int N = scanner.nextInt();
//		int [][] Dp = new int[N+1][10];
//		int mod = 10007;
//		for(int i=0;i<=9;i++) {
//			Dp[1][i]=1;
//		}
//
//		for (int i = 2; i <= N; i++) {
//			for (int j = 0; j <= 9; j++) {
//				for(int k=j;k<=9;k++) {
//					Dp[i][j]+=Dp[i-1][k]%mod; // 오르막 수 경우의 수 구하는 식
//				}
//			}
//		}
//
//		int sum=0;
//		for(int i=0;i<=9;i++) {
//			sum+=Dp[N][i];
//			sum%=mod;
//		}
//		System.out.println(sum);
//	}
//}
