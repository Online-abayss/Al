package Programmers.codetest_basic_100;

import java.util.Arrays;

// new int[] 안에 삼항연산자로 크기 조절 되는게 신기. 혹시 될까 하고 해본건데 되서 신기.
public class 짝수는_싫어요 {

    public static void main(String[] args) {

        int n = 10;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(n)));


    }

    static class Solution {
        public int[] solution(int n) {
            int[] answer = new int[n % 2 == 0 ? n / 2 : (n / 2) + 1];

            for (int i = 0; i < answer.length; i++) {

                answer[i] = (i * 2) + 1;
            }
            return answer;
        }
    }
}

// 다른사람 풀이

// 신기.
//import java.util.stream.IntStream;
//
//class Solution {
//    public int[] solution(int n) {
//        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
//    }
//}
