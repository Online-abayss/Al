package Programmers.level_2;

public class 숫자_카드_나누기_다시풀기 {

    public static void main(String[] args) {


        int[] arrayA = {10, 17};
        int[] arrayb = {5, 20};

        Solution solution = new Solution();

        System.out.println(solution.solution(arrayA, arrayb));

    }

    static class Solution {
        public int solution(int[] arrayA, int[] arrayB) {
            int answer = 0;

            int gcd_a = arrayA[0];
            int gcd_b = arrayB[0];

            for (int i = 1; i < arrayA.length; i++) {

                gcd_a = gcd(gcd_a, arrayA[i]);
                gcd_b = gcd(gcd_b, arrayB[i]);
            }

            if (notdisivisble(arrayB, gcd_a)) {

                if (answer < gcd_a) {

                    answer = gcd_a;
                }
            }

            if (notdisivisble(arrayA, gcd_b)) {

                if (answer < gcd_b) {

                    answer = gcd_b;
                }
            }


            return answer;


        }

        private boolean notdisivisble(int[] arrayA, int gcd_b) {

            for (int n : arrayA) {

                if (n % gcd_b == 0) {

                    return false;
                }
            }

            return true;
        }

        private int gcd(int a, int b) {

            if (a % b == 0) {

                return b;
            }
            return gcd(b, a % b);
        }
    }
}
