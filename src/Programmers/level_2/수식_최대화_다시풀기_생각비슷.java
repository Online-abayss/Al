package Programmers.level_2;

import java.util.ArrayList;

public class 수식_최대화_다시풀기_생각비슷 {

    public static void main(String[] args) {

        String expression = "100-200*300-500+20";

        Solution solution = new Solution();

        System.out.println(solution.solution(expression));


    }


    static String[] three_simbol = {"*+-"};
    static class Solution {
        public long solution(String expression) {

            ArrayList<String> simbol = new ArrayList<>();

            ArrayList<Long> numbers = new ArrayList<>();

            String word = "";
            for (char ch : expression.toCharArray()) {

                if (ch - '0' >= 0 ) {

                    word += ch;
                } else {

                    simbol.add(String.valueOf(ch));
                    numbers.add(Long.parseLong(word));
                    word = "";
                }
            }
            int last_simbol_idx = expression.lastIndexOf(simbol.get(simbol.size() - 1));
            numbers.add(Long.parseLong(expression.substring(last_simbol_idx + 1)));

            System.out.println(numbers);
            System.out.println(simbol);

            long max = Integer.MIN_VALUE;

            for (int i = 0; i < three_simbol.length; i++) {

                String[] rank_simbol = three_simbol[i].split("");

                ArrayList<String> temp_simbol = new ArrayList<>(simbol);
                ArrayList<Long> temp_numbers = new ArrayList<>(numbers);

                // + - *
                for (int j = 0; j < rank_simbol.length; j++) {


                    // 문제에 주어진 수식

                    for (int k = 0; k < temp_simbol.size();) {

                        if (!rank_simbol[j].equals(temp_simbol.get(k))) {

                            System.out.println(k);
                            k++;
                            continue;
                        }

                        if (temp_simbol.get(k).equals("+")) {

                            temp_numbers.set(k, temp_numbers.get(k) + temp_numbers.get(k + 1));
                        } else if (temp_simbol.get(k).equals("*")) {

                            temp_numbers.set(k, temp_numbers.get(k) * temp_numbers.get(k + 1));
                        } else if (temp_simbol.get(k).equals("-")) {

                            temp_numbers.set(k, temp_numbers.get(k) - temp_numbers.get(k + 1));
                        }

                        temp_numbers.remove(k + 1);
                        temp_simbol.remove(k);

                    }
                }

                max = Math.max(max, Math.abs(temp_numbers.get(0)));
            }

            return max;
        }
    }
}


//https://school.programmers.co.kr/questions/37079
