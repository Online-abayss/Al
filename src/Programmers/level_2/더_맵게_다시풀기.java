package Programmers.level_2;

import java.util.PriorityQueue;

public class 더_맵게_다시풀기 {

    public static void main(String[] args) {

        int[] scoville = {1,2,3,9,10,12};
        int k = 7;

        Solution solution = new Solution();

        System.out.println(solution.solution(scoville, k));


    }

//    static class Solution {
//        public int solution(int[] scoville, int K) {
//            int answer = 0;
//
//            PriorityQueue<Integer> que = new PriorityQueue<>();
//
//            for (int i = 0; i < scoville.length;i ++) {
//
//                que.add(scoville[i]);
//
//            }
//
//            while (que.peek() < K) {
//
//                if (que.size() == 1) {
//
//                    return -1;
//                }
//                que.add(que.poll() + que.poll() * 2);
//                answer++;
//            }
//
//            return answer;
//        }
//    }


    static class Solution {
        public int solution(int[] scoville, int K) {
            int answer = 0;

            PriorityQueue<Integer> pre_q = new PriorityQueue<>();

            for (int a : scoville) {

                pre_q.add(a);
            }

            while (pre_q.peek() < K) {

                if (pre_q.size() == 1) {

                    return -1;
                }

                pre_q.add(pre_q.poll() + pre_q.poll() * 2);
                answer ++;

            }

            return answer;
        }
    }

}
