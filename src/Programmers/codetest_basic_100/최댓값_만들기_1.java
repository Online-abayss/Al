package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 최댓값_만들기_1 {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        Solution solution = new Solution();

        System.out.println(solution.solution(numbers));
    }


    static class Solution {
        public int solution(int[] numbers) {
            int answer = 0;

            int[] nums = Arrays.stream(numbers).sorted().toArray();

            answer = nums[nums.length -1] * nums[nums.length -2];

            return answer;
        }
    }
}

// 다른사람 풀이

//import java.util.*;
//
//class Solution {
//    public int solution(int[] numbers) {
//        int answer = 0;
//
//        Arrays.sort(numbers);
//
//        return numbers[numbers.length-1]*numbers[numbers.length-2];
//    }
//}
