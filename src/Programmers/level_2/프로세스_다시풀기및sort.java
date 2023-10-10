package Programmers.level_2;

import java.util.*;

public class 프로세스_다시풀기및sort {

    public static void main(String[] args) {

        int[] priorities = {2,1,3,2};
        int location = 2;

        Solution solution = new Solution();

        System.out.println(solution.solution(priorities, location));
    }

    static class Solution {
        public int solution(int[] priorities, int location) {
            int answer = 0;

            Queue<Integer> qu = new LinkedList<>();

            int [] temp = new int[priorities.length];

            for (int i = 0; i < temp.length; i++) {

                temp[i] = priorities[i];
            }

            Arrays.sort(temp);

            for (int i = temp.length -1; i >= 0; i--) {

                qu.offer(temp[i]);
            }

            System.out.println(qu);


            while (!qu.isEmpty()) {

                for (int i = 0; i < priorities.length; i++) {

                    if (qu.peek() == priorities[i]) {

                        qu.poll();
                        answer ++;

                        if (location == i) {

                            return answer;
                        }
                    }
                }
            }

            return answer;
        }
    }
}
// temp에 원 배열 넣고 temp로 정렬하면 같이 정렬된다... 난 이걸 원하지 않았는데
//https://bada744.tistory.com/102
