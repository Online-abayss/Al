package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 배열_두배_만들기 {

    public static void main(String[] args) {

        int[] number = {1,2,3,4,5};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(number)));

    }

    static class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];

            for (int i = 0 ; i < numbers.length; i++) {

                answer[i] = numbers[i] * 2;
            }

            return answer;
        }
    }
}


// 다른사람 풀이

//import java.util.Arrays;
//
//class Solution {
//    public int[] solution(int[] numbers) {
//        return Arrays.stream(numbers).map(i -> i * 2).toArray();
//    }
//}
