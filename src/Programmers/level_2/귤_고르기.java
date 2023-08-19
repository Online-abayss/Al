package Programmers.level_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class 귤_고르기 {

    public static void main(String[] args) {

        int k = 2;
        int[] tangerine = {1,1,1,1,2,2,2,3};

        Solution solution = new Solution();

        System.out.println(solution.solution(k, tangerine));

    }

    static class Solution {
        public int solution(int k, int[] tangerine) {
            int answer = 0;

            HashMap<Integer, Integer> lime_boxed = new HashMap<>();

            for (int a : tangerine) {

                lime_boxed.put(a, lime_boxed.getOrDefault(a, 0) + 1);
            }

            List<Integer> value_lst = new ArrayList<>(lime_boxed.keySet());
//            value_lst.sort(new Comparator<Integer>() {
//                @Override
//                public int compare(Integer o1, Integer o2) {
//                    return lime_boxed.get(o2) - lime_boxed.get(o1);
//                }
//            });
            value_lst.sort((o1, o2) -> lime_boxed.get(o2) - lime_boxed.get(o1));

            for (Integer e : value_lst) {

                if (k <= 0) {

                    break;
                }
                answer ++;
                k -= lime_boxed.get(e);
            }

            return answer;
        }
    }
}
