package Programmers.level_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class 신고_결과_받기 {

    public static void main(String[] args) {

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi" };
        int k = 2;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(id_list, report, k)));

    }

    // 한명이 여러번 여러명 신고 가능하지만, 중복 신고는 한번으로 처리.
    // k 번 이상 신고된 유저는 정지.
// 추후 똑똑해지면 다시 풀기... 아 머리아퍼.
//    static class Solution {
//        public int[] solution(String[] id_list, String[] report, int k) {
//            int[] answer = new int[k];
//
//            HashMap<String, Integer> report_cnt_map = new HashMap<>();
//
//            HashSet<String> set_report = new HashSet<>(List.of(report)); // 중복 제거
//
//            report = set_report.toArray(new String[0]);
//
//            HashMap<String, Integer> test = new HashMap<>();
//
//            for (int i = 0; i < report.length; i++) {
//
//                String to_person = report[i].split(" ")[1];
//
//                if (!report_cnt_map.containsKey(to_person)) { // 신고 목록에 존재 여부. (존재 안하면 등록)
//
//                    report_cnt_map.put(to_person, 1);
//                } else {
//
//                    if (report_cnt_map.get(to_person) == k) { // k 번째 신고 당한경우
//
//                        continue;
//                    } else {
//
//                        int cnt_report = report_cnt_map.get(to_person); // 신고 목록애 존재 시
//
//                        report_cnt_map.put(to_person, cnt_report +1);
//                    }
//                }
//
//            }
//            // for문으로 한번 k인거 찾아내기
//
//            System.out.println(report_cnt_map);
//
//            for (int i = 0; i < id_list.length; i++) {
//
//                try {
//
//                    if (report_cnt_map.get(id_list[i]) == k) {
//
//                        test.put(id_list[i], k);
//                    }
//
//                } catch (Exception e) {
//
//                    continue;
//                }
//
//            }
//
//            // 발송자 명단 및 cnt 세기


//
//            HashMap<String, Integer> answer_map = new HashMap<>();
//
//            for (int i = 0; i < report.length; i++) {
//
//                String from_person = report[i].split(" ")[0];
//
//                try {
//
//                    if (test.get(from_person) == k) {
//
//                        if (answer_map.get(from_person) > 0) {
//
//                            answer_map.put(from_person, answer_map.get(from_person) + 1);
//                        } else {
//
//                            answer_map.put(from_person, 1);
//                        }
//                    }
//                } catch (Exception e) {
//
//                    answer_map.put(from_person, 0);
//                }
//            }
//
//            System.out.println(answer_map);
//
//            return answer;
//        }
//    }
//}
