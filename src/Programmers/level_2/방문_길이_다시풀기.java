package Programmers.level_2;

import java.util.HashMap;
import java.util.HashSet;

public class 방문_길이_다시풀기 {

    public static void main(String[] args) {


        String dirs = "ULURRDLLU";

        Solution solution = new Solution();

        System.out.println(solution.solution(dirs));

    }

    //{-5,1=0, -4,1=0, -5,2=0, -1,1=0, -1,0=0, -3,1=0, -2,1=0}
    //점 방식이라서 안됨. 그러므로 이동경로 인 선으로 해줘야 했다... 으어어어어
//    static class Solution {
//        public int solution(String dirs) {
//            int answer = 0;
//
//            HashMap<String, Integer> record = new HashMap<>();
//            int start_x = 0;
//            int start_y = 0;
//
//            String[] s_split = dirs.split("");
//            for (String s : s_split) {
//
//                switch (s) {
//
//                    case "U" :
//
//                        start_y += 1;
//
//                        if (start_y > 5 ) {
//
//                            start_y -= 1;
//                        }
//                        record.put(start_x +"," +start_y, 0);
//                        break;
//
//                    case "D" :
//
//                        start_y -= 1;
//
//                        if (start_y < -5 ) {
//
//                            start_y += 1;
//                        }
//
//                        record.put(start_x +"," +start_y, 0);
//                        break;
//                    case "R" :
//
//                        start_x += 1;
//
//                        if (start_x > 5 ) {
//
//                            start_x -= 1;
//                        }
//
//                        record.put(start_x +"," +start_y, 0);
//                        break;
//                    case "L" :
//
//                        start_x -= 1;
//
//                        if (start_x < -5 ) {
//
//                            start_x += 1;
//                        }
//                        record.put(start_x +"," +start_y, 0);
//                        break;
//                }
//
//                }
//
//                answer = record.size();
//
//            System.out.println(record);
//
//
//            return answer;
//        }
//    }

    // switch 방식 같은데 뭘 잘못 알고있나봄 ... 틀림
    static class Solution {
        public int solution(String dirs) {
            int answer = 0;

            String[] str_arr = dirs.split("");

            int now_x = 0;
            int now_y = 0;
            int next_x = 0;
            int next_y = 0;

            HashSet<String> record = new HashSet<>();

            for (String s : str_arr) {

                next_x = now_x;
                next_y = now_y;

                if (s.equals("U")) {

                    next_y ++;
                    if (next_y > 5) {

                        continue;
                    } else {

                        record.add(next_x + "" + next_y + "" + now_x + "" + now_y);
                    }
                } else if (s.equals("D")) {

                    next_y --;

                    if (next_y < -5) {

                        continue;
                    } else {

                        record.add(now_x + "" + now_y + "" + next_x + "" + next_y);
                    }
                } else if (s.equals("R")) {

                    next_x ++;

                    if (next_x > 5) {

                        continue;
                    } else {

                        record.add(next_x + "" + next_y + "" + now_x + "" + now_y);
                    }
                } else if (s.equals("L")) {

                    next_x --;

                    if (next_x < -5) {

                        continue;
                    } else {

                        record.add(now_x + "" + now_y + "" + next_x + "" + next_y);
                    }
                }

                now_x = next_x;
                now_y = next_y;
            }

            answer = record.size();

            return answer;
        }
    }


}
