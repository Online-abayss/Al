package Programmers.level_1;

import java.util.Arrays;

// 생각의 전환? ... 후...
public class 덧칠하기 {

    public static void main(String[] args) {

        int n = 8;
        int m = 2;
        int[] section = {2,6};

        Solution solution = new Solution();
        System.out.println(solution.solution(n,m , section));

    }

    static class Solution {
        public int solution(int n, int m, int[] section) {
            int answer = 0;

            int paint = section[0]-1;

            for (int a : section) {

                if (paint < a) {

                    paint = a + m -1;
                    answer ++;
                }
            }
            return answer;
        }
    }
}
