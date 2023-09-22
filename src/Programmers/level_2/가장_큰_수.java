package Programmers.level_2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장_큰_수 {

    public static void main(String[] args) {

        int[] number = {0,0};

        Solution solution = new Solution();

        System.out.println(solution.solution(number));

    }

    static class Solution {
        public String solution(int[] numbers) {
            String answer = "";

            String[] str_arr = new String[numbers.length];

            for (int i = 0; i < numbers.length;i ++) {

                str_arr[i] = String.valueOf(numbers[i]);
            }

            Arrays.sort(str_arr, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {

                    String word = o2 + o1;
                    int result = word.compareTo(o1 + o2);

                    return result;
                }
            });

            if (str_arr[0].equals("0")) {

                return "0";
            }

            for (String s : str_arr) {

                answer += s;
            }

            return answer;
        }
    }
}
