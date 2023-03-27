package Programmers.level_1;

public class 카드_뭉치 {

    public static void main(String[] args) {

//        String[] card1 = {"i", "drink", "water"};
//        String[] card2 = {"want", "to"};
//        String[] goal = {"i", "want", "to", "drink", "water"};

        String[] card1 = {"i", "water", "drink"};
        String[] card2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        Solution solution = new Solution();

        System.out.println(solution.solution(card1,card2,goal));


    }

    static class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            String answer = "Yes";

            int a = 0;
            int b = 0;

            for (int i = 0; i < goal.length; i++) {

                int cnt = 0;

                if (a == cards1.length) {

                    cnt ++;


                } else {

                    if (goal[i].equals(cards1[a])) {

                        a++;
                    } else {

                        cnt ++;
                    }
                }

                if (b == cards2.length) {

                    cnt ++;


                } else {
                    if (goal[i].equals(cards2[b])) {

                        b++;
                    } else {

                        cnt ++;
                    }
                }

                if (cnt == 2) {

                    answer = "No";
                    break;
                }
            }

            return answer;
        }
    }
}

// 다른사람 풀이


// 비교 연산자에 논리 연산자를 넣어서 비교 할 수 있다는 생각을 못함.
//import java.io.*;
//
//class Solution {
//    public String solution(String[] cards1, String[] cards2, String[] goal) {
//        int cardIdx1 = 0;
//        int cardIdx2 = 0;
//
//        for(int i=0; i<goal.length; i++){
//            String target = goal[i];
//
//            if(cardIdx1 < cards1.length && target.equals(cards1[cardIdx1]))
//                cardIdx1 ++;
//            else if (cardIdx2 < cards2.length && target.equals(cards2[cardIdx2]))
//                cardIdx2++;
//            else
//                return "No";
//        }
//
//
//        return "Yes";
//    }
//}
