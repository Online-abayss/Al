package Programmers.level_2;


import java.util.HashSet;

public class 소수찾기 {

    public static void main(String[] args) {

        String number = "011";

        Solution solution = new Solution();

        System.out.println(solution.solution(number));

    }

    static boolean[] visited;
    static HashSet<Integer> set;
    static class Solution {


        public int solution(String numbers) {
            int answer = 0;


            String[] numbers_arr = numbers.split("");
            visited = new boolean[numbers_arr.length];
            set = new HashSet<>();

            for (int i = 0 ;i < numbers_arr.length; i++) {

                visited[i] = true;
                dfs(numbers_arr, 1, numbers_arr[i]);
                visited[i] = false;
            }

            answer =set.size();


            return answer;
        }


        public void dfs(String[] numbers_arr, int depth, String number) {

            if (depth <= numbers_arr.length) {

                int check_number = Integer.parseInt(number);

                if (!prime_check(check_number)) {

                    set.add(check_number);

                }

            }


            for (int i = 0; i < numbers_arr.length; i++) {

                if (!visited[i]) {

                    visited[i] = true;
                    dfs(numbers_arr, depth + 1, number + numbers_arr[i]);
                    visited[i] = false;
                }
            }



        }

        private boolean prime_check(int check_number) {

            if (check_number == 0 || check_number == 1) {

                return true;
            }

            for (int i = 2; i <= (int) Math.sqrt(check_number); i++) {

                if (check_number % i == 0) {

                    return true;
                }
            }

            return false;
        }


    }
}
