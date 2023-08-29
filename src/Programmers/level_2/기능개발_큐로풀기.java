package Programmers.level_2;

import java.util.ArrayList;

public class 기능개발_큐로풀기 {

    public static void main(String[] args) {


        int[] progresses = {93, 30 , 55};
        int[] speeds = {1, 30 , 5};
//        int[] progresses = {95,90,99,99,80,99};
//        int[] speeds = {1,1,1,1,1,1};


        Solution solution = new Solution();

        System.out.println(solution.solution(progresses, speeds));

    }

    // 내 방식은 반복문이 많이 돌아간다... 그러므로 100 이상이 되는 날짜를 구해야한다. Math.ceil
    static int j ;
    static class Solution {
        public ArrayList<Integer> solution(int[] progresses, int[] speeds) {

            int day = 1;

            ArrayList<Integer> answer = new ArrayList<>();

            int i = 0;

                while (true) {

                    if (i >= progresses.length) {

                        break;
                    }

                    int sum = 0;

                    if (progresses[i] + speeds[i] * day >= 100) {

                        i = i + 1;

                        for (j = i; j < progresses.length; j++) {

                            if (progresses[j] + speeds[j] * day >= 100) {

                                sum ++;
                            } else {

                                break;
                            }
                        }
                        i = j; // 이걸 원래  바로위에 있는 else문에 i = j; 를 넣었는데 j가 만약 5로 시작하게 되면 else문이 작동하지 않는 변수가 발생
                        // 그래서 이걸 해결하고자 하는 생각을 20분간함.... 수식은 간단하지만. 틀에 박힌 생각이 힘들게 했다.
                        sum ++;

                        answer.add(sum);

                    }

                    day ++;
                }

            return answer;
        }
    }
}
