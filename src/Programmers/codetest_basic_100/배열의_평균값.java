package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 배열의_평균값 {

    public static void main(String[] args) {

        int[] number = {1,2,3,4,5,6,7,8,9,10};

        Solution solution = new Solution();

        System.out.println(solution.solution(number));

    }

    static class Solution {
        public double solution(int[] numbers) {
            double answer = 0;
            answer = Arrays.stream(numbers).sum() / (double) numbers.length ;
            return answer;
        }
    }
}

// 다른사람 풀이

//import java.util.Arrays;
//
//class Solution {
//    public double solution(int[] numbers) {
//        return Arrays.stream(numbers).average().orElse(0);
//    }
//}

//.orElse(0) -> 주어진 값이 null이 아닌 경우 주어진 값을 되돌려주고 null인 경우 인수(0)을 돌려줌
