package Programmers.codetest_basic_100;

// 7번만 틀리길레 반례가 뭐지하고 찾다보니 길이가 2개 일 경우의 반례를 찾아서 해결

public class 최댓값_만들기_2 {

    public static void main(String[] args) {


        int[] numbers = {-500, 2};

        Solution solution = new Solution();

        System.out.println(solution.solution(numbers));
    }




    static class Solution {
        public int solution(int[] numbers) {
            int answer = 0;

            if (numbers.length == 2) {

                answer = numbers[0] * numbers [1];

            } else {

                for (int i = 0; i < numbers.length; i++) {

                    for (int j = i + 1; j < numbers.length; j++) {

                        answer = Math.max(answer, numbers[i] * numbers[j]);

                    }
                }
            }

            return answer;
        }
    }
}

// 다른사람 풀이


// 똑똑... 나열하여, 0 , 1 쪽은 최대 음수 두개가 나올거고 length쪽은 최대 양수 두개가 나옴.
//import java.util.*;
//
//class Solution {
//    public int solution(int[] numbers) {
//        int len = numbers.length;
//        Arrays.sort(numbers);
//        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
//    }
//}
