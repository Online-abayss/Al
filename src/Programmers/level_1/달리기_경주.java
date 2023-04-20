package Programmers.level_1;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class 달리기_경주 {

    public static void main(String[] args) {

        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(players, callings)));

    }

    static class Solution {
        public String[] solution(String[] players, String[] callings) {
            String[] answer = players;

            LinkedHashMap<String, Integer> rank_map = new LinkedHashMap<>(); // 집어넣은 순서를 보장받기 위해

            for (int i = 0; i < players.length; i++) {

                rank_map.put(players[i], i);

            }

            for (String s : callings) {

                int check_rank = rank_map.get(s); // kai의 위치
                String change_member = answer[check_rank - 1]; // kai 앞선 등수의 맴버

                answer[check_rank] = change_member; // kai의 위치에 앞선 등수의 맴버 넣기
                answer[check_rank - 1] = s;  // 앞선 등수의 맴버에 kai 넣기

                rank_map.put(change_member, check_rank); // 위치 찾는 기반을 map으로 했기에 여기도 update
                rank_map.put(s, check_rank - 1);

            }

            return answer;
        }
    }
}
