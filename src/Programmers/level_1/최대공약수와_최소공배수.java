package Programmers.level_1;

import java.util.Arrays;


//최소공배수 = a * b / 최대공약수
public class 최대공약수와_최소공배수 {

    public static void main(String[] args) {

        int n = 10;
        int m = 12;

        //2 60

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(n, m)));

    }

    static class Solution {
        public int[] solution(int n, int m) {

            int num = 0;

            // 거꾸로 하는게 더 빠를듯
            for (int i = 1; i <= n; i++ ) {

                if (n % i == 0 && m % i == 0) {

                    num = i;
                }
            }

            int[] answer = {num, n * m / num };


            return answer;
        }
    }
}
