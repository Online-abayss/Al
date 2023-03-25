package Programmers.level_1;

import java.util.*;


public class 명예의_전당_1 {

    public static void main(String[] args) {

//        int k = 3;
//        int[] score = {10,100,20,150,1,100,200};

        int k = 9;
        int[] score = {10,30,40,3,0,20,4};
        // 기댓값 : [10, 10, 10, 3, 0, 0, 0]

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(k, score)));

    }

    static class Solution {
        public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];

            List<Integer> num_lst = new ArrayList<>();


            for (int i = 0; i < score.length; i++) {

                num_lst.add(score[i]);

                if (num_lst.size() <= k) {

                    Collections.sort(num_lst);
                    answer[i] = num_lst.get(0);

                } else {

                    if (num_lst.get(0) > num_lst.get(k)) {

                        num_lst.remove(k); // 굴러온 놈이 가장 작으니 삭제
                        answer[i] = num_lst.get(0);

                    } else {

                        num_lst.remove(0); // 박힌놈이 가장 작으니 삭제
                        Collections.sort(num_lst);
                        answer[i] = num_lst.get(0);

                    }
                }

            }

            return answer;
        }
    }
}
// 다른사람 풀이

//import java.util.*;
//
//class Solution {
//    public int[] solution(int k, int[] score) {
//        int[] answer = new int[score.length];
//
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//
//        int temp = 0;
//
//        for(int i = 0; i < score.length; i++) {
//
//            priorityQueue.add(score[i]);
//            if (priorityQueue.size() > k) {
//                priorityQueue.poll();
//            }
//
//            answer[i] = priorityQueue.peek();
//        }
//
//
//
//        return answer;
//    }
//}
