package Programmers.codetest_basic_100;

import java.util.Arrays;

public class OX퀴즈 {

    public static void main(String[] args) {

     String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};

     Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(quiz)));

    }

    static class Solution {
        public String[] solution(String[] quiz) {
            String[] answer = new String[quiz.length];


            for (int i =0; i< quiz.length; i++) {

                String[] strArr = quiz[i].split(" ");

                int num1 = Integer.parseInt(strArr[0]);
                int num2 = Integer.parseInt(strArr[2]);
                int num3 = Integer.parseInt(strArr[4]);

                if (strArr[1].equals("+")) {

                    answer[i] = num1 + num2 == num3 ? "O" : "X";
                } else if (strArr[1].equals("-")) {

                    answer[i] = num1 - num2 == num3 ? "O" : "X";
                }


            }
            return answer;
        }
    }
}

// 다른 사람 풀이

//class Solution {
//    public String[] solution(String[] quiz) {
//        for(int i=0; i<quiz.length; i++){
//            String[] text = quiz[i].split(" ");
//            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
//            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
//        }
//        return quiz;
//    }
//}
