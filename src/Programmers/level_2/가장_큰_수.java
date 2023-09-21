package Programmers.level_2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장_큰_수 {

    public static void main(String[] args) {

        int[] number = {3, 30, 34};

        Solution solution = new Solution();

        System.out.println(solution.solution(number));

    }

    static class Solution {
        public String solution(int[] numbers) {
            String answer = "";

            String[] s = new String[numbers.length];

            for (int i = 0; i < numbers.length; i++) {

                s[i] = String.valueOf(numbers[i]);
            }


            Arrays.sort(s, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {

                    int idx = 0;

                        String[] number1_arr = o1.split("");
                        String[] number2_arr = o2.split("");

                        String number1 = number1_arr[idx];
                        String number2 = number2_arr[idx];

                        int max_number = number2.compareTo(number1);

                        if (max_number == 0) {

                            while (max_number == 0 && idx < 6) {

                                idx ++;
                                number1 = number1_arr[idx];
                                number2 = number2_arr[idx];

                                max_number = number2.compareTo(number1);

                            }
                        }


                    return max_number;
                }
            });

            System.out.println(Arrays.toString(s));

            for (String number : s) {

                answer += number;
            }

            return answer;
        }
    }
}
