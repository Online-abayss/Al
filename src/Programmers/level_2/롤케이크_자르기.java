package Programmers.level_2;

import java.util.HashMap;
import java.util.HashSet;

public class 롤케이크_자르기 {

    public static void main(String[] args) {

        int[] topping = {1,2,1,3,1,4,1,2};

        Solution solution = new Solution();

        System.out.println(solution.solution(topping));

    }

    static class Solution {
        public int solution(int[] topping) {
            int answer = 0;

            HashSet<Integer> old_brother = new HashSet<>();
            HashMap<Integer, Integer> young_brother = new HashMap<>();

            for (int a : topping) {

                if (young_brother.containsKey(a)) {

                    young_brother.put(a, young_brother.get(a) + 1);
                } else {

                    young_brother.put(a, 1);
                }
            }

            for (int i = 0 ; i < topping.length; i++) {

                old_brother.add(topping[i]);
                young_brother.put(topping[i], young_brother.get(topping[i]) - 1);

                if (young_brother.get(topping[i]) <= 0) {

                    young_brother.remove(topping[i]);
                }
                if (old_brother.size() == young_brother.size()) {

                    answer ++;
                }

            }

            return answer;
        }
    }
}
