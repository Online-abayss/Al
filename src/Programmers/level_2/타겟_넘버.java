package Programmers.level_2;

public class 타겟_넘버 {

    public static void main(String[] args) {

        int[] numbers = {1,1,1,1,1};

        int target = 3;

        Solution solution = new Solution();
        System.out.println(solution.solution(numbers, target));

    }

    static int cnt;
    static class Solution {
        public int solution(int[] numbers, int target) {
            int answer = 0;

            dfs(0,0 ,numbers, target);

            answer = cnt;
            return answer;
        }

        private void dfs(int sum, int idx, int[] numbers, int target) {

            if (idx == numbers.length && target == sum) {

                cnt ++;
                return;
            }


            if (idx >= numbers.length) {

                return;
            }

            dfs (sum + numbers[idx], idx + 1, numbers, target);
            dfs (sum - numbers[idx], idx + 1, numbers, target);
        }


    }
}
