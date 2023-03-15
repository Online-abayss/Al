package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 짝수_홀수_개수 {

    public static void main(String[] args) {

        int[] num_list = {1,2,3,4,5};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(num_list)));

    }

    static class Solution {
        public int[] solution(int[] num_list) {

            int a = 0;
            int b = 0;

            for (int num : num_list) {

                if (num % 2 == 0) {

                    a++;
                } else{

                    b++;
                }
            }

            int[] answer = {a,b};

            return answer;
        }
    }
}

// 다른사람 풀이

// class Solution {
//    public int[] solution(int[] num_list) {
//        int[] answer = new int[2];
//
//        for(int i = 0; i < num_list.length; i++)
//            answer[num_list[i] % 2]++;
//
//        return answer;
//    }
//}
