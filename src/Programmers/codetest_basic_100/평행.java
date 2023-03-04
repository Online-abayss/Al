package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 평행 {

    public static void main(String[] args) {


//        int[][] dots = {{1,4}, {9,2}, {3,8}, {11,6}};
        int[][] dots = {{3,5}, {4,1}, {2,4}, {5,10}};


        Solution solution = new Solution();

        System.out.println(solution.solution(dots));

    }

    static class Solution {
        public int solution(int[][] dots) {
            int answer = 0;

            Arrays.sort(dots, (s1, s2) -> {return Integer.compare(s1[0] ,s2[0]);});

            double lean1 = Math.abs(dots[2][1] - dots[3][1]) / Math.abs(dots[2][0] - dots[3][0])
                    ;
            double lean2 = Math.abs(dots[0][1] - dots[1][1]) / Math.abs(dots[0][0] - dots[1][0])
                    ;
            double divided1 =  Math.abs(dots[2][1] - dots[3][1]) % Math.abs(dots[2][0] - dots[3][0]);
            double divided2 =  Math.abs(dots[0][1] - dots[1][1]) % Math.abs(dots[0][0] - dots[1][0]);


            if (lean1 == lean2 )
                if (divided1 == divided2)
                 answer = 1;

            return answer;
        }
    }
}
