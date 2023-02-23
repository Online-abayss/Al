package Programmers.codetest_basic_100;

import java.util.ArrayList;
import java.util.Arrays;

class 연속된_수의_합 {

        public static void main(String[] args) {

            int num = 4;
            int total = 14;

            Solution solution = new Solution();

            System.out.println(Arrays.toString(solution.solution(num, total)));
        }

// 수학적 풀이는 엄청 간단하던걸로 파악함.

    static class Solution {
        public int[] solution(int num, int total) {
            int[] answer = new int[num];

            int first_num;
            int mid_num = total/num;

            if (num % 2 == 1) {

                first_num = mid_num - (num / 2 );

                for (int i = 0; i < num; i++) {

                    answer[i] = first_num;
                    first_num ++;
                }
            } else {

                first_num = mid_num - (num / 2 ) + 1;

                for (int i = 0; i < num; i++) {

                    answer[i] = first_num;
                    first_num ++;
                }
            }
            return answer;
        }
    }
}
