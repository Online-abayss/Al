package Programmers.level_2;

import java.util.Arrays;

public class _2개_이하로_다른_비트_규칙찾아다시풀기 {

    public static void main(String[] args) {

        long[] numbers = {2, 11};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(numbers)));

    }
//    static class Solution {
//        public long[] solution(long[] numbers) {
//            long[] answer = new long[numbers.length];
//
//            for (int i = 0; i < numbers.length; i++) {
//
//
//                if (numbers[i] % 2 == 0) {
//
//                    answer[i] = numbers[i] + 1;
//                    continue;
//                }
//
//                String number = Long.toString(numbers[i], 2);
//
//                if (!number.contains("0")) {
//
//                    String temp = number.substring(0, 1) + "0" + number.substring(1);
//                    answer[i] = Long.parseLong(temp, 2);
//                } else {
//
//                    int idx = number.lastIndexOf("0");
//
//                    System.out.println(idx);
//
//                    number = number.substring(0, idx) + "10" + number.substring(idx + 2);
//                    answer[i] = Long.parseLong(number, 2);
//                }
//            }
//
//
//            return answer;
//        }
//    }

    static class Solution {
        public long[] solution(long[] numbers) {
            long[] answer = new long[numbers.length];

            for (int a = 0; a < numbers.length; a++) {

                if (numbers[a] % 2 == 0) {

                    answer[a] = numbers[a] + 1;
                    continue;
                }

                String two_bit = Long.toBinaryString(numbers[a]);

                String word = "";

                if (!two_bit.contains("0")) {

                    word = two_bit.substring(0, 1) + "0" + two_bit.substring(1);
                    answer[a] = Long.parseLong(word, 2);
                } else {

                    int last_idx = two_bit.lastIndexOf("0");
                    word = two_bit.substring(0,last_idx) + "10" + two_bit.substring(last_idx + 2);
                    answer[a] = Long.parseLong(word, 2);
                }

            }


            return answer;
        }
    }
}
