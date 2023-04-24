package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1037 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] br_arr = br.readLine().split(" ");

        int[] num_arr = new int[br_arr.length];

        for (int i = 0 ; i < br_arr.length; i++) {

            num_arr[i] = Integer.parseInt(br_arr[i]);
        }

        Arrays.sort(num_arr);

        int first_num = num_arr[0];
        int last_num = num_arr[num_arr.length - 1];

        System.out.println(first_num * last_num);

    }
}

// 다른사람 풀이

//https://st-lab.tistory.com/150

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
//		int T = Integer.parseInt(br.readLine());
//
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//
//		while(T-- > 0) {
//			int N = Integer.parseInt(st.nextToken());
//			max = N > max ? N : max;
//			min = N < min ? N : min;
//		}
//		System.out.println(max * min);
//	}
//
//}
