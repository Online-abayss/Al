package Programmers.level_1;

import java.util.*;

public class 실패율 {

    public static void main(String[] args) {

        int n = 3;
        int[] stages = {1,1,1};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(n, stages)));

    }

    static class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];

            HashMap<Integer, Double> fail_map = new HashMap<>();

            int user_cnt = stages.length;

            for (int i = 1; i < N +1; i ++) {

                int cnt = 0;
                for (int j = 0; j < stages.length; j++) {

                    if (stages[j] == i) {

                        cnt++;
                    }
                }

                if (user_cnt == 0) { // 아무도 도달하지 못한 경우의 조건

                    fail_map.put(i, (double)0);
                } else {

                    fail_map.put(i, cnt / (double)user_cnt);

                    user_cnt -= cnt;
                }
            }

            List<Integer> key_lst = new ArrayList<>(fail_map.keySet());

            Collections.sort(key_lst, (o1, o2) -> (fail_map.get(o2).compareTo(fail_map.get(o1))));

            int i = 0;

            for (int a : key_lst) {

                answer[i] = a;
                i++;
            }

            return answer;
        }
    }

}
