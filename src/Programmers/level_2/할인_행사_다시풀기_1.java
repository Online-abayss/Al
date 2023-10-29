package Programmers.level_2;

import java.util.HashMap;

public class 할인_행사_다시풀기_1 {

    public static void main(String[] args) {

        String[] want = {"banana", "apple", "rice", "pork", "pot"};

        int[] number = {3,2,2,2,1};

        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        Solution solution = new Solution();

        System.out.println(solution.solution(want, number, discount));


    }

//    static class Solution {
//        public int solution(String[] want, int[] number, String[] discount) {
//            int answer = 0;
//
//            Map<String, Integer> map = new HashMap<>();
//            int length = want.length;
//
//            for (int i = 0; i < length; i++) {
//
//                map.put(want[i], number[i]);
//            }
//
//            int dis_length = discount.length;
//
//            for (int i = 0; i <= discount.length - 10; i++) {
//
//                Map<String, Integer> dis_map = new HashMap<>();
//
//                for (int j = 0; j < 10; j++) {
//
//                    String item = discount[i + j];
//                    int cnt = dis_map.getOrDefault(item, 0);
//                    cnt ++;
//                    dis_map.put(item, cnt);
//
//
//                }
//
//                boolean test = true;
//
//                for (String wantItem : map.keySet()) {
//
//                    int want_cnt = map.get(wantItem);
//                    int dis_cnt = dis_map.getOrDefault(wantItem, 0);
//
//                    if (want_cnt > dis_cnt) {
//
//                        test = false;
//                        break;
//                    }
//                }
//
//
//                if (test) {
//
//                    answer ++;
//                }
//            }
//
//
//            return answer;
//        }
//
//    }

    static class Solution {
        public int solution(String[] want, int[] number, String[] discount) {
            int answer = 0;

            for (int i = 0; i < discount.length - 9; i++) {

                HashMap<String, Integer> check_cnt = new HashMap<>();
                boolean check = true;

                for (int j = i; j < i + 10; j++) {

                    check_cnt.put(discount[j], check_cnt.getOrDefault(discount[j], 0) + 1);
                }

                for (int a = 0; a < want.length; a++) {

                    if (check_cnt.getOrDefault(want[a], 0) >= number[a]) {

                        continue;
                    } else {

                        check = false;
                        break;
                    }
                }


                if (check) {

                    answer++;
                }
            }


            return answer;
        }
    }
}
