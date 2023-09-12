package Programmers.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class 주차_요금_계산 {

    public static void main(String[] args) {

        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
//        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN"};
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(fees, records)));
    }
// 기본 시간  , 기본 요금 , 단위 시간(분) , 단위 요금(원)
    static class Solution {
        public int[] solution(int[] fees, String[] records) {

            // 번호판, 현재시간
            HashMap<String, Integer> taxis = new HashMap<>();

            // 번호판, 주차 여부
            HashMap<String, Boolean> check_taxis = new HashMap<>();

            // 번호판, 총 주차 시간
            HashMap<String, Integer> fee = new HashMap<>();

            // 주차 인하고 아웃한 경우
            for (int i = 0; i < records.length; i++) {

                String[] info = records[i].split("\\s");

                String[] times = info[0].split(":");
                int time = Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
                if (info[2].equals("IN")) {

                    check_taxis.put(info[1], true);
                    taxis.put(info[1], time);
                } else {

                    check_taxis.put(info[1], false);
                    fee.put(info[1], time - taxis.get(info[1]) + fee.getOrDefault(info[1], 0));
                }


            }

            // 주차 인하고 나간게 없는경우
            // 멍청하게 2359라고 함 처음부터 분으로 계산했는데 , 그럼 2359도 분으로 처리해야했다.
            for (String s : check_taxis.keySet()) {

                if (check_taxis.get(s)) {

                    fee.put(s, 1439 - taxis.get(s) + fee.getOrDefault(s, 0));
                }
            }

            ArrayList<String> sorted_nubmers = new ArrayList<>(fee.keySet());

            Collections.sort(sorted_nubmers);

            int[] answer = new int[sorted_nubmers.size()];

            int basic_time = fees[0];
            int basic_fee = fees[1];
            int over_time = fees[2];
            int over_fee = fees[3];

            for (int i = 0; i < sorted_nubmers.size(); i++) {

                String s = sorted_nubmers.get(i);

                if (fee.get(s) <= basic_time) {

                    answer[i] = basic_fee;
                } else {

                    double sum = fee.get(s) - basic_time;

                    answer[i] = (int) (Math.ceil(sum / over_time)) * over_fee + basic_fee;
                }
            }

            return answer;
        }
    }
}
