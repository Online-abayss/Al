package Programmers.level_2;

public class H_index {

    public static void main(String[] args) {

        int[] citations = {3 , 0, 6, 1, 5};

        Solution solution = new Solution();

        System.out.println(solution.solution(citations));

    }

    static class Solution {
        public int solution(int[] citations) {
            int answer = 0;

            answer = citations.length % 2 == 0 ? citations.length / 2 : citations.length / 2 + 1;
            return answer;
        }
    }
}
