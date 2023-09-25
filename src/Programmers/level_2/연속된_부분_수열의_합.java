package Programmers.level_2;

import java.util.Arrays;

public class 연속된_부분_수열의_합 {

    public static void main(String[] args) {

        int[] sequence = {1,2,3,4,5};

        int k = 7;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(sequence, k)));

    }

    static class Solution {
        public int[] solution(int[] sequence, int k) {
            int[] answer = new int[2];

            int len = 10000001;
            int left = 0;
            int right = 0;
            int sum = 0;
            int flag = 0;

            while (true) {

                if (sum >= k) {

                    sum -= sequence[left++];
                    flag =0;

                } else if (right >= sequence.length) {

                    break;
                } else if (sum < k) {

                    sum += sequence[right++];
                    flag = 1;

                }

                if (sum == k) {


                }
            }



            return answer;
        }
    }
}
