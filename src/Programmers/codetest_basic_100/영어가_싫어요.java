package Programmers.codetest_basic_100;

import java.util.Arrays;

// 다른사람 풀이 ( 무식하게 replaceAll 0부터 9까지 하는거 외에 몰라서 인터넷에 찾아봄)
public class 영어가_싫어요 {

    public static void main(String[] args) {

        String numbers = "onetwothreefourfivesixseveneightnine";

        Solution solution = new Solution();

        System.out.println(solution.solution(numbers));

    }

    static class Solution {
        public long solution(String numbers) {

            String[] matchNumbers = {
                    "zero", "one", "two"
                    , "three", "four", "five"
                    , "six", "seven", "eight", "nine"};

            for (int i = 0; i < matchNumbers.length; i++) {
                numbers = numbers.replaceAll(matchNumbers[i], String.valueOf(i));
            }
            Long answer =  Long.parseLong(numbers);

            return answer;
        }
    }

}
