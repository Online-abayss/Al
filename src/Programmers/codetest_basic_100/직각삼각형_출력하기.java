package Programmers.codetest_basic_100;

import java.util.Scanner;

public class 직각삼각형_출력하기 {

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.toString());

    }

    static public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for (int i = 1 ; i < n+1; i++) {

                for (int j = 0; j < i; j++ ) {

                    System.out.printf("*");
                }
                System.out.println("");
            }
        }
    }
}

// 다른사람 풀이

//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=1; i<=n; i++){
//            System.out.println("*".repeat(i));
//        }
//    }
//}
