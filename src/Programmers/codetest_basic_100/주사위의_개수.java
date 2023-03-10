package Programmers.codetest_basic_100;

public class 주사위의_개수 {


    public static void main(String[] args) {

        int[] box = {1,1,1};
        int n = 1;

        Solution solution = new Solution();

        System.out.println(solution.solution(box, n));
    }

    static class Solution {
        public int solution(int[] box, int n) {
            int answer = 0;




            return answer;
        }
    }
}
//가로(box[0])에 모서리(n)가 몇개가 들어갈 수 있는지
//세로(box[1])에 모서리(n)가 몇개가 들어갈 수 있는지
//높이(box[2])에 모서리(n)가 몇개가 들어갈 수 있는지
