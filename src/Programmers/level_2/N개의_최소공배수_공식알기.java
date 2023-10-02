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

//https://hstory0208.tistory.com/entry/Java%EC%9E%90%EB%B0%94-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-Lv2-N%EA%B0%9C%EC%9D%98-%EC%B5%9C%EC%86%8C%EA%B3%B5%EB%B0%B0%EC%88%98-%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C-%ED%98%B8%EC%9E%AC%EB%B2%95
