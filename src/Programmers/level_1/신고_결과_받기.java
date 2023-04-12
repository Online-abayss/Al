package Programmers.level_1;

import java.util.Arrays;
import java.util.HashMap;

public class 신고_결과_받기 {

    public static void main(String[] args) {

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(id_list, report, k)));

    }

    // 한명이 여러번 여러명 신고 가능하지만, 중복 신고는 한번으로 처리.
    // k 번 이상 신고된 유저는 정지.
    static class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = {};

            HashMap<String, Integer> report_cnt_map = new HashMap<>();

            for (int i = 0; i < report.length; i++) {

                String to_person = report[i].split(" ")[1];

                if (!report_cnt_map.containsKey(to_person)) { // 신고 목록에 존재 여부. (존재 안하면 등록)

                    report_cnt_map.put(to_person, 1);
                } else {

                    if (report_cnt_map.get(to_person) == k) { // k 번째 신고 당한경우

                        continue;
                    } else {

                        int cnt_report = report_cnt_map.get(to_person); // 신고 목록애 존재 시

                        report_cnt_map.put(to_person, cnt_report +1);
                    }
                }

            }

            System.out.println(report_cnt_map);

            return answer;
        }
    }
}
