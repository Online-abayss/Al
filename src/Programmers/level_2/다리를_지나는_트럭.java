package Programmers.level_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 다리를_지나는_트럭 {


    public static void main(String[] args) {

        int bridge_length = 2;
        int weight = 10;
        int[] ruck_weights = {7,4,5,6};

        Solution solution = new Solution();

        System.out.println(solution.solution(bridge_length, weight, ruck_weights));

    }

    static class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 0;

            int sum = 0;
            Queue<Integer> queue = new LinkedList<>();

            for (int t : truck_weights) {

                while (true) {

                    if (queue.isEmpty()) {

                        queue.offer(t);
                        sum += t;
                        answer++;
                        break;
                    } else if (queue.size() == bridge_length) {

                        sum -= queue.poll();
                    } else {

                        if (sum + t > weight) {

                            queue.offer(0);
                            answer++;
                        } else {

                            queue.offer(t);
                            sum += t;
                            answer++;
                            break;
                        }
                    }

                }
            }



            return answer + bridge_length;
        }
    }
}
