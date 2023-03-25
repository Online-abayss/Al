package Programmers.level_1;

import java.util.HashSet;

public class 기사단원의_무기 {

    public static void main(String[] args) {

        int number = 10;
        int limit = 3;
        int power = 2;

        Solution solution = new Solution();

        System.out.println(solution.solution(number, limit, power));

    }

    static class Solution {
        public int solution(int number, int limit, int power) {
            int answer = 0;

            for (int i = 1; i <= number; i++) {

                HashSet<Integer> num_set = new HashSet<>();

                for (int j = 1; j <= Math.sqrt(i); j++) {

                    if (i % j == 0) {

                        num_set.add(i/ j);
                        num_set.add(j);

                    }
                }

                if (num_set.size() > limit) {

                    answer += power;
                } else {

                    answer += num_set.size();
                }
            }

            return answer;
        }
    }
}

// 다른사람 풀이

// 이게 엄청 빠르다.

//class Solution {
//
//    public int solution(int number, int limit, int power) {
//        int[] count = new int[number + 1];
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= number / i; j++) {
//                count[i * j]++;
//            }
//        }
//        int answer = 0;
//        for (int i = 1; i <= number; i++) {
//            if (count[i] > limit) {
//                answer += power;
//            } else {
//                answer += count[i];
//            }
//        }
//        return answer;
//    }
//}
