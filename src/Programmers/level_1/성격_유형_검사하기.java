package Programmers.level_1;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.List;

// 무식하게 품.
public class 성격_유형_검사하기 {


    public static void main(String[] args) {

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5,3,2,7,5};

        Solution solution = new Solution();

        System.out.println(solution.solution(survey, choices));

    }

    static class Solution {
        public String solution(String[] survey, int[] choices) {
            String answer = "";

            LinkedHashMap<String, Integer> map_test = new LinkedHashMap<>();

            map_test.put("R", 0);
            map_test.put("T", 0);
            map_test.put("C", 0);
            map_test.put("F", 0);
            map_test.put("J", 0);
            map_test.put("M", 0);
            map_test.put("A", 0);
            map_test.put("N", 0);


            for (int i = 0; i < survey.length; i ++) {

                String a = survey[i].split("")[0];
                String b = survey[i].split("")[1];

                if (choices[i] == 4) {

                    continue;
                } else if (choices[i] > 4) {

                    map_test.put(b, map_test.get(b) + choices[i] - 4);
                } else {

                    map_test.put(a, map_test.get(a) + 4 - choices[i]);
                }
            }

            List<String> type_lst = new ArrayList<>(map_test.keySet());
            List<Integer> rank_lst = new ArrayList<>(map_test.values());


            for (int i = 0; i < 4; i++) {

                answer += rank_lst.get(i*2) >= rank_lst.get(i*2+1) ? type_lst.get(i*2) : type_lst.get(i*2+1);
            }

            return answer;
        }
    }
}
