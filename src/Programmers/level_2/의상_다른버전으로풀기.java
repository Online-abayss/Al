package Programmers.level_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class 의상_다른버전으로풀기 {

    public static void main(String[] args) {

//        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        String[][] clothes = {{"a","a"} , {"b","b"}, {"c","c"}};

        Solution solution = new Solution();

        System.out.println(solution.solution(clothes));

    }

//    static class Solution {
//
//        public int solution(String[][] clothes) {
//            int answer = 1;
//
//            Map<String, Integer> map = new HashMap<>();
//
//            for (int i = 0; i < clothes.length; i++) {
//
//                map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
//            }
//
//            for (String key : map.keySet()) {
//
//                answer *= map.get(key);
//            }
//
//            return answer - 1;
//        }
//
//
//    }

    static class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;

            HashMap<String, Integer> record = new HashMap<>();

            for (String[] arr : clothes) {

                record.put(arr[1] , record.getOrDefault(arr[1], 0) + 1);
            }

            for (String s : record.keySet()) {

                answer *= (record.get(s) + 1);
            }

            return answer - 1;
        }
    }
}
