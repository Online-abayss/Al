package Programmers.codetest_basic_100;


import java.util.Arrays;
import java.util.HashSet;


public class 소인수분해 {

    public static void main(String[] args) {

        int n = 420;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(n)));

    }

    static class Solution {
        public int[] solution(int n) {

            HashSet<Integer> num_set = new HashSet<>();

            for (int i = 2; i <= Math.sqrt(n); i++) {

                while (n % i == 0) {

                    num_set.add(i);
                    n /= i;
                }
            }
            if (n != 1) {

                num_set.add(n);
            }

            int[] answer = num_set.stream().mapToInt(s -> s).sorted().toArray();
            return answer;
        }
    }
}
