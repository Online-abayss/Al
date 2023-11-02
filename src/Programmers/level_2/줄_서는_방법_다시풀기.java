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
// https://blog.naver.com/PostView.naver?blogId=tlstjd436&logNo=222047159567&parentCategoryNo=&categoryNo=43&viewDate=&isShowPopularPosts=false&from=postView

    static class Solution {
        public int[] solution(int n, long k) {
            int[] answer = new int[n];
            LinkedList<Integer> list = new LinkedList<>();
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                list.add(i);
                factorial *= i;
            }

            int i = 0;
            long remain = k - 1;

            while (i < n) {

                // 6 / 3 = 2;
                factorial = factorial / (n - i);

                // 4 / 2 = 2
                long value = remain / factorial;

                answer[i++] = list.get((int)value);

                list.remove((int)value);
                remain = remain % factorial;
            }

            return answer;
        }
    }
}
// 역시 수학적 문제... dfs로 일일이 구했지만 보다보니 20!는 답도 없는 갯수라 오래 걸릴게 보엿음
