package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 직사각형_넓이_구하기 {

    public static void main(String[] args) {

        int[][] dots = {{1,1},{2,1}, {2,2}, {1,2}};

        Solution solution = new Solution();

        System.out.println(solution.solution(dots));

    }

    static class Solution {
        public int solution(int[][] dots) {
            int answer = 0;

            Arrays.sort(dots, (s1, s2) -> {return Integer.compare(s1[0], s2[0]);});

            int x = Math.abs(dots[0][0] - dots[2][0]);
            int y = Math.abs(dots[0][1] - dots[1][1]);

            answer = x * y;

            return answer;
        }
    }

}
