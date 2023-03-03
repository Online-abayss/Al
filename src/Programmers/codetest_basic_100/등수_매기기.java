package Programmers.codetest_basic_100;

import java.awt.*;
import java.util.ArrayList;
// array to list 가 String으로만 되는거 같아서 이리저리 생각하다가 생각이 안나서, 걍 arrayList로 반환처리함.

public class 등수_매기기 {

    public static void main(String[] args) {

        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};

        Solution solution = new Solution();

        System.out.println(solution.solution(score));

    }

    static class Solution {
        public ArrayList solution(int[][] score) {

            ArrayList rank_lst = new ArrayList<>();
            int rank = 1;

            for (int i = 0; i < score.length; i++) {

                for (int j = 0; j < score.length; j ++) {

                    if ((score[i][0] + score[i][1] < score[j][0] + score[j][1])) {

                        rank ++;

                    } else if ((score[i][0] + score[i][1] == score[j][0] + score[j][1])) {

                        continue;
                    }

                }

                rank_lst.add(rank);
                rank = 1;
            }

            return rank_lst;
        }
    }
}

// 다른사람 풀이

//import java.util.*;
//class Solution {
//    public int[] solution(int[][] score) {
//        List<Integer> scoreList = new ArrayList<>();
//        for(int[] t : score){
//            scoreList.add(t[0] + t[1]);
//        }
//        scoreList.sort(Comparator.reverseOrder());
//
//        int[] answer = new int[score.length];
//        for(int i=0; i<score.length; i++){
//            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
//        }
//        return answer;
//    }
//}
