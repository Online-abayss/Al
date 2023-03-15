package Programmers.codetest_basic_100;

public class 각도기 {

    public static void main(String[] args) {

        int angle = 70;

        Solution solution = new Solution();

        System.out.println(solution.solution(angle));

    }

    static class Solution {
        public int solution(int angle) {
            int answer = 0;

            if (angle < 90) {

                answer = 1;

            } else if (angle == 90) {

                answer = 2;

            } else if (angle < 180) {

                answer = 3;

            } else if (angle == 180) {

                answer = 4;
            }

            return answer;
        }
    }
}

// 다른사람 풀이


//이건 그냥 이렇게 풀 수 있다 정도로
//class Solution {
//    public int solution(int angle) {
//        return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
//    }
//}
