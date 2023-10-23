package Programmers.level_2;

import java.util.Arrays;
import java.util.LinkedList;

public class 줄_서는_방법_다시풀기 {

    public static void main(String[] args) {

        int n = 3;
        int k = 5;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(n, k)));

    }


    static class Solution {
        public int[] solution(int n, long k) {
            int[] answer = new int[n];

            LinkedList<Integer> lst = new LinkedList<>();

            long factorial = 1;

            for (int i = 1; i <= n; i++) {

                lst.add(i);
                factorial *= i;
            }

            int i = 0;
            long remain = k - 1;

            while (i < n) {

                // fa = 6
                // lst (1,2,3)

                // 6 / 2 = 3
                factorial = factorial / (n - 1);

                // 6 / 3 = 2
                long value = remain / factorial;

                // answer[0] = lst[2]
                answer[i++] = lst.get((int)value);

                // 4 / 3  = 1
                remain %= factorial;
            }
            return answer;
        }
        }
}
// 역시 수학적 문제... dfs로 일일이 구했지만 보다보니 20!는 답도 없는 갯수라 오래 걸릴게 보엿음
