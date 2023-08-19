package Programmers.level_2;

public class N개의_최소공배수_공식알기 {

    public static void main(String[] args) {

        int[] arr = {12,32,45,67,72};

        Solution solution = new Solution();

        System.out.println(solution.solution(arr));

    }

    static class Solution {
        public int solution(int[] arr) {
            int answer = 1;

            int[] map = new int[99999999];

            for (int a : arr) {

                for (int j = a; j < map.length; j = j + a) {

                    map[j] += 1;

                    if (map[j] == arr.length) {

                        return j;
                    }
                }
            }

            return answer;
        }
    }
}
