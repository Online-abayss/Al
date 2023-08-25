package Programmers.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 의상 {

    public static void main(String[] args) {

//        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        String[][] clothes = {{"a","a"} , {"b","b"}, {"c","c"}};

        Solution solution = new Solution();

        System.out.println(solution.solution(clothes));

    }

    static class Solution {

        public int solution(String[][] clothes) {
            int answer = 0;

            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < clothes.length; i++) {

                if (map.get(clothes[i][1]) == null) {

                    map.put(clothes[i][1], 1);
                }
                else {

                    map.put(clothes[i][1], map.get(clothes[i][1]) +1);
                }
            }

            for (String s : map.keySet()) {

                answer += (map.get(s) + 1);
            }

            answer --;

            return answer;
        }


    }
}
