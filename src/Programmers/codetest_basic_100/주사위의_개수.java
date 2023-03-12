package Programmers.codetest_basic_100;

public class 주사위의_개수 {


    public static void main(String[] args) {

        int[] box = {10,8,6};
        int n = 3;

        Solution solution = new Solution();

        System.out.println(solution.solution(box, n));
    }

    static class Solution {
        public int solution(int[] box, int n) {
            int answer = 1;

            for (int i : box) {

                answer *= (i / n);
            }

            return answer;
        }
    }
}
//가로(box[0])에 모서리(n)가 몇개가 들어갈 수 있는지
//세로(box[1])에 모서리(n)가 몇개가 들어갈 수 있는지
//높이(box[2])에 모서리(n)가 몇개가 들어갈 수 있는지

// 다른사람 풀이

//class Solution {
//    public int solution(int[] box, int n) {
//        int answer = 1;
//
//        answer *= box[0]/n;
//        answer *= box[1]/n;
//        answer *= box[2]/n;
//
//        return answer;
//    }
//}
