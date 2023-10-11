package Programmers.level_2;

import java.util.*;

public class 메뉴_리뉴얼_다시풀기_거의다풀었엇다 {

    public static void main(String[] args) {

        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {3};

        Solution solution = new Solution();

        System.out.println(solution.solution(orders, course));

    }

    static Map<String, Integer> map;
    static class Solution {
        public ArrayList<String> solution(String[] orders, int[] course) {

            ArrayList<String> answer = new ArrayList<>();

            for (int i = 0; i < orders.length; i++) {

                char[] ch_arr = orders[i].toCharArray();
                Arrays.sort(ch_arr);
                orders[i] = String.valueOf(ch_arr);
            }

            for (int i = 0; i < course.length; i++) {

                map = new HashMap<>();

                int max = Integer.MIN_VALUE;

                for (int j = 0; j < orders.length; j++) {

                    StringBuilder sb = new StringBuilder();

                    if (course[i] <= orders[i].length()) {

                        combination_menu(orders[j], sb, 0, 0, course[i]);
                    }
                }

                for (Map.Entry<String, Integer> entry : map.entrySet()) {

                    max = Math.max(max, entry.getValue());
                }

                for (Map.Entry<String, Integer> entry : map.entrySet()) {

                    if (max >= 2 && entry.getValue() == max) {

                        answer.add(entry.getKey());
                    }
                }
            }

            Collections.sort(answer);

            return answer;

    }

        private void combination_menu(String str, StringBuilder sb, int idx, int cnt, int n) {

            if (cnt == n) {

                map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
                return;

            }

            for (int i = idx; i < str.length(); i++) {

                sb.append(str.charAt(i));

                combination_menu(str, sb , i + 1, cnt + 1, n);

                sb.delete(cnt, cnt + 1);
            }
        }

        }
    }
