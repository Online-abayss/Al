package Programmers.codetest_basic_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열_자르기 {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        int num1 = 1;
        int num2 = 3;

        Solution solution = new Solution();

        System.out.println(solution.solution(numbers, num1, num2));

    }

    static class Solution {
        public List solution(int[] numbers, int num1, int num2) {

            List<Integer> answer = new ArrayList<>();

            for (int i = 0; i < numbers.length; i++) {

                if ( i >= num1 && i <= num2) {

                    answer.add(numbers[i]);
                }
            }
            return answer;
        }
    }
}

// 다른사람 풀이

//import java.util.*;
//
//class Solution {
//    public int[] solution(int[] numbers, int num1, int num2) {
//        return Arrays.copyOfRange(numbers, num1, num2 + 1);
//    }
//}


//class Solution {
//    public int[] solution(int[] numbers, int num1, int num2) {
//        int[] answer = new int[num2 - num1 + 1];
//
//        for (int i = num1; i <= num2; i++) {
//            answer[i -num1] = numbers[i];
//        }
//
//        return answer;
//    }
//}
