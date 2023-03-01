package Programmers.codetest_basic_100;

import java.util.Arrays;

// 인덱스를 어찌 찾을 방법이 안떠올라서 정답지 봄 열심히 공부하자
public class 가까운_수 {

    public static void main(String[] args) {

        int[] array = {-1, 4, 9};

        int n = 2;

        Solution solution = new Solution();

        System.out.println(solution.solution(array, n));
    }

    static class Solution {
        public int solution(int[] array, int n) {
            Arrays.sort(array);
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= n) {
                    int leftValue = n - array[(i - 1)];
                    int rightValue = array[i] - n;
                    return leftValue <= rightValue ? array[(i - 1)] : array[i];
                }
            }
            return array[array.length - 1];
        }
    }
}
