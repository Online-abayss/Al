package Programmers.codetest_basic_100;


class 다음에_올_숫자 {

    public static void main(String[] args) {

        int[] common = {1,2,3,4};

        Solution solution = new Solution();

        System.out.println(solution.solution(common));
    }

    static class Solution {
        public int solution(int[] common) {

            int answer = 0;
            int length = common.length-1;

            if (common[length] + common[length-2] == common[length-1] * 2  ) {

                answer = common[length] * 2 - common[length-1];

            } else {

                answer = common[length] * common[length] / common[length-1];
            }

            return answer;
        }
    }
}
