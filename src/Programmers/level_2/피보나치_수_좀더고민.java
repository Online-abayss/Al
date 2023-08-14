package Programmers.level_2;

public class 피보나치_수_좀더고민 {

    public static void main(String[] args) {


        int n = 3;
        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }

    static int[] fibo;
    static class Solution {
        public int solution(int n) {
            int answer = 0;

            fibo = new int[100001];

            fibo[0] = 0;
            fibo[1] = 1;
            fibo[2] = 1;

            for (int i = 3; i <= n; i++) {

                fibo[i] = fibo[i-2] + fibo[i -1];

            }

            return answer;
        }

    }
}

// 다른사람 풀이

//class Solution {
//        public float solution(int n) {
//
//                int[] D = new int[n + 1];
//                D[0] = 0;
//                D[1] = 1;
//                for (int i = 2; i <= n; i++) {
//                    D[i] = (D[i - 1] + D[i - 2]) % 1234567;
//                }
//
//                return D[n];
//        }
//
//    }
