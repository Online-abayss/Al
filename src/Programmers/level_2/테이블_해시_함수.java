package Programmers.level_2;

public class 테이블_해시_함수 {


    public static void main(String[] args) {

        int[][] data = {{2,2,6},{1,5,10},{4,2,9},{3,8,3}};

        int col = 2;
        int row_begin = 2;
        int row_end = 3;

        Solution solution = new Solution();

        System.out.println(solution.solution(data, col, row_begin , row_end));

    }

    static class Solution {
        public int solution(int[][] data, int col, int row_begin, int row_end) {
            int answer = 0;



            return answer;
        }
    }

}
