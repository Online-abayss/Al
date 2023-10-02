package Programmers.level_2;

import java.util.HashMap;

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

    static class Solution {
        public int solution(String dirs) {
            int answer = 0;


            return answer;
        }
    }


}
