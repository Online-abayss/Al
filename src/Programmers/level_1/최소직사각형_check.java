package Programmers.level_1;

public class 최소직사각형_check {

    public static void main(String[] args) {

//        int[][] sizes = {{60,50}, {30,70} , {60,30} , {80,40}};
        int[][] sizes = {{10,7}, {12,3} , {8,15} , {14,7} , {5,15}};


        Solution solution = new Solution();

        System.out.println(solution.solution(sizes));

    }

    static class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;

            int Max_num = 0;
            int Min_num = 0;

            for (int i = 0; i < sizes.length; i++) {

                if (sizes[i][0] > sizes[i][1]) {

                    Max_num = Math.max(Max_num, sizes[i][0]);
                    Min_num = Math.max(Min_num, sizes[i][1]);
                } else {

                    Max_num = Math.max(Max_num, sizes[i][1]);
                    Min_num = Math.max(Min_num, sizes[i][0]);
                }
            }

            answer = Max_num * Min_num;

            return answer;
        }
    }

}
