package Programmers.level_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class 추억_점수 {


    public static void main(String[] args) {

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5,10,1,3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(name, yearning, photo)));

    }

    static class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];

            HashMap<String, Integer> remind_map = new HashMap<>();

            for (int i = 0; i < name.length; i++) {

                remind_map.put(name[i], yearning[i]);
            }

            for (int i = 0; i < photo.length; i++) {

                int cnt = 0;

                for (int j = 0; j < photo[i].length; j++) {

                    if (!remind_map.containsKey(photo[i][j])) {

                        continue;
                    } else {

                        cnt += remind_map.get(photo[i][j]);
                    }
                }

                answer[i] = cnt;
            }

            return answer;
        }
    }
}
