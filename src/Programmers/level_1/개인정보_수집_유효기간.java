package Programmers.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class 개인정보_수집_유효기간 {

    public static void main(String[] args) {

        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(today, terms, privacies)));

    }

    static class Solution {
        public int[] solution(String today, String[] terms, String[] privacies) {

            int y = Integer.parseInt(today.split("\\.")[0]) * 12 * 28 ;
            int m = Integer.parseInt(today.split("\\.")[1]) * 28;
            int d = Integer.parseInt(today.split("\\.")[2]);

            HashMap<String, Integer> map_terms = new HashMap<>();
            List<Integer> result_lst = new ArrayList<>();

            for (String s : terms) {

                map_terms.put(s.split(" ")[0], Integer.parseInt(s.split(" ")[1]));
            }

            for (int i = 0 ; i < privacies.length; i++) {

                String x = privacies[i];

                String[] divided = x.split(" ");
                String alpha = divided[1];
                String day = divided[0];

                int a = Integer.parseInt(day.split("\\.")[0]) * 12 * 28;
                int b = Integer.parseInt(day.split("\\.")[1]) * 28 ;
                int c = Integer.parseInt(day.split("\\.")[2]);

                if (y + m + d >= a + b + c + (map_terms.get(alpha) * 28)) {

                    result_lst.add(i + 1);
                }
            }

            int[] answer = new int[result_lst.size()];

            for (int i = 0 ; i < result_lst.size(); i++) {

                answer[i] = result_lst.get(i);
            }

            return answer;
        }
    }
}
