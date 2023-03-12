package Programmers.codetest_basic_100;

public class 점의_위치_구하기 {

    public static void main(String[] args) {

        int[] dot = {2,4};

        Solution solution = new Solution();

        System.out.println(solution.solution(dot));
    }

    static class Solution {
        public int solution(int[] dot) {
            int answer = 0;

            if (dot[0] > 0 && dot[1] > 0) {

                answer = 1;
            } else if (dot[0] < 0 && dot[1] > 0) {

                answer = 2;
            } else if (dot[0] < 0 && dot[1] < 0) {

                answer = 3;
            } else {

                answer = 4;
            }

            return answer;
        }
    }
}

// 다른사람 풀이

//
//class Solution {
//    public int solution(int[] dot) {
//        int answer = 0;
//        if(dot[0] > 0)
//            if(dot[1] > 0) answer = 1;
//            else answer = 4;
//        else
//        if(dot[1] > 0) answer = 2;
//        else answer = 3;
//
//
//        return answer;
//    }
//}
