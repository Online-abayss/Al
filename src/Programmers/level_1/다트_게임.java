package Programmers.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 다트_게임 {

    public static void main(String[] args) {

        String dartResult = "1D2S#10S";

        Solution solution = new Solution();

        System.out.println(solution.solution(dartResult));
    }

    // s = 1 , d = 2; t = 3 // * = 해당 점수 및 전 점수 X2 (단, 처음에 * 나오면 해당 점수만) (또한 중첩됨) , # = 해당 점수 -
    static class Solution {
        public int solution(String dartResult) {
            int answer = 0;

            List<Integer> int_lst = new ArrayList<>();
            char[] arr_char = dartResult.toCharArray();

            int num = 0;

            for (int i = 0; i < dartResult.length(); i++) {

                if (arr_char[i] >=48 && arr_char[i] <=57) {

                    num = Integer.parseInt(String.valueOf(arr_char[i]));

                    if (arr_char[i] == 49 && arr_char[i+1] ==48) {

                        num = 10;
                        i++;
                    }

                } else if (arr_char[i] == 83) { // s

                    int_lst.add((int)Math.pow(num, 1));
                } else if (arr_char[i] == 68) { // d

                    int_lst.add((int)Math.pow(num, 2));
                } else if (arr_char[i] == 84) { // t

                    int_lst.add((int)Math.pow(num, 3));
                } else if (arr_char[i] == 42) {

                    if (int_lst.size() == 1) {

                        int_lst.set(0, int_lst.get(0) * 2);
                    } else {

                        int_lst.set(int_lst.size() - 2, int_lst.get(int_lst.size() - 2) * 2);
                        int_lst.set(int_lst.size() - 1, int_lst.get(int_lst.size() - 1) * 2);
                    }

                } else if (arr_char[i] == 35) {

                        int_lst.set(int_lst.size() - 1, int_lst.get(int_lst.size() -1) * -1);
                }

            }

            for (int a : int_lst) {

                answer += a;
            }

            return answer;
        }
    }
}
