package Programmers.codetest_basic_100;

public class 머쓱이보다_키_큰_사람 {

    public static void main(String[] args) {

        int[] array = {149, 180, 192, 170};
        int height = 167;

        Solution solution = new Solution();

        System.out.println(solution.solution(array, height));

    }

    static class Solution {
        public int solution(int[] array, int height) {
            int answer = 0;

            for (int i : array) {

                if (i > height) {

                    answer++;
                }
            }

            return answer;
        }
    }

}

// 다른사람 풀이

// import java.util.Arrays;
//
//class Solution {
//    public int solution(int[] array, int height) {
//        return (int) Arrays.stream(array).filter(value -> value > height).count();
//    }
//}
