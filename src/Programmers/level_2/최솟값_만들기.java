package Programmers.level_2;


import java.util.Arrays;

public class 최솟값_만들기 {

    public static void main(String[] args) {

        int[] A = {1, 4, 2 };
        int[] B = {5, 4, 4};

        Solution solution = new Solution();

        System.out.println(solution.solution(A,B));

    }

    static class Solution
    {
        public int solution(int []A, int []B)
        {
            int answer = 0;

            Integer[] reverse = new Integer[B.length];

            Arrays.sort(A);
            Arrays.sort(B);

            for (int i = 0; i < B.length; i++) {

                reverse[i] = B[B.length-i - 1];
            }

            for (int i = 0; i < A.length; i++) {

                answer += A[i] * reverse[i];
            }
            return answer;
        }
    }
}
