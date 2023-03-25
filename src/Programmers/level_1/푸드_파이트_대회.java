package Programmers.level_1;

public class 푸드_파이트_대회 {

    public static void main(String[] args) {

        int[] food = {1,3,4,6};

        Solution solution = new Solution();

        System.out.println(solution.solution(food));

    }

    static class Solution {
        public String solution(int[] food) {

            String answer = "";

            StringBuilder s = new StringBuilder();

            for(int i = 1; i < food.length; i++) {

                for (int j = 0; j < food[i] / 2; j++) {

                    s.append(String.valueOf(i));
                }
            }

            answer = s.toString();
            answer += 0;
            answer += s.reverse().toString();

            return answer;
        }
    }
}

// 다른사람 풀이

// 아 repeat가 있다는걸 잊음.

//class Solution {
//    public String solution(int[] food) {
//        StringBuilder builder = new StringBuilder();
//        for (int i=1; i<food.length; i++) {
//            int result = food[i] / 2;
//            builder.append(String.valueOf(i).repeat(result));
//        }
//        String answer = builder + "0";
//        return answer + builder.reverse();
//    }
//}

// 신박한 풀이법.
// class Solution {
//    public String solution(int[] food) {
//        String answer = "0";
//
//        for (int i = food.length - 1; i > 0; i--) {
//            for (int j = 0; j < food[i] / 2; j++) {
//                answer = i + answer + i;
//            }
//        }
//
//        return answer;
//    }
//}
