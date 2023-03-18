package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 분수의_덧셈 {

    public static void main(String[] args) {

        int numer1 = 9;
        int denom1 = 2;
        int numer2 = 1;
        int denom2 = 3;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(numer1,denom1,numer2,denom2)));

    }
    static class Solution {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int[] answer = new int[2];

            int test1 = numer1 * denom2;
            int test2 = numer2 * denom1;

            int common_test = denom1 * denom2; // 분모
            int sum_test = test1 + test2; // 분자


            int n = Math.max(sum_test, common_test);

            while (n > 0) {

                if (sum_test % n == 0 && common_test % n == 0) {

                    sum_test /= n;
                    common_test /= n;
                    break; //여기에 break 걸어도 값은 같을 수도? (최대치의 나누기?를 했기에.)  확인해 본 결과 같음.
                }

                n--;
            }

            answer[0] = sum_test;
            answer[1] = common_test;

            return answer;
        }
    }
}
