package Programmers.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 호텔_대실 {

    public static void main(String[] args) {

        String[][] book_time = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};

        Solution solution = new Solution();

        System.out.println(solution.solution(book_time));

    }

//    static class Solution {
//        public int solution(String[][] book_time) {
//            int answer = 0;
//
//            // 시작시간 . diff_time을 하나에 넣어서 비교군으로 파악하기?
//
//            // 기록표가 있어야 비교 할 수 있을듯.
//            int cnt = 0;
//
//            int[][] bookTime_int = new int[book_time.length][2];
//
//            for (int i = 0; i < book_time.length; i++) {
//
//                int start_time = Integer.parseInt(book_time[i][0].split(":")[0]) * 60 + Integer.parseInt(book_time[i][0].split(":")[1]);
//                int end_time =  Integer.parseInt(book_time[i][1].split(":")[0]) * 60 + Integer.parseInt(book_time[i][1].split(":")[1]);
//
//                end_time += 10;
//
//                bookTime_int[i][0] = start_time;
//                bookTime_int[i][1] = end_time;
//
//            }
//
//            Arrays.sort(bookTime_int, new Comparator<int[]>() {
//                @Override
//                public int compare(int[] o1, int[] o2) {
//
//                    if (o1[0] > o2[0]) {
//
//                        return 1;
//                    } else if (o1[0] < o2[0]) {
//
//                        return -1;
//                    } else {
//
//                        if (o1[1] > o2[1]) {
//
//                            return 1;
//                        }
//
//                        else
//                            return -1;
//                    }
//
//                }
//            });
//
//            PriorityQueue<Integer> rooms = new PriorityQueue<>();
//
//            for (int[] used_room : bookTime_int) {
//
//                if (rooms.size() == 0) {
//
//                    rooms.add(used_room[1]);
//                    continue;
//                }
//
//                int IsEmpty_room = rooms.peek();
//
//                if (used_room[0] >= IsEmpty_room) {
//
//                    rooms.poll();
//                    rooms.add(used_room[1]);
//                } else {
//
//                    rooms.add(used_room[1]);
//                }
//            }
//
//            return rooms.size();
//        }
//    }

    static class Solution {
        public int solution(String[][] book_time) {
            int answer = 1;

            int[][] book_time_int = new int[book_time.length][book_time[0].length];

            for (int i = 0; i < book_time_int.length; i++) {

                String[] times = book_time[i];

                for (int j = 0; j < 2; j++) {

                    book_time_int[i][j] = Integer.parseInt(times[j].split(":")[0]) * 60 + Integer.parseInt(times[j].split(":")[1]);

                    if (j == 1) {

                        book_time_int[i][j] += 10;
                    }
                }
            }

            Arrays.sort(book_time_int, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {

                    if (o1[0] < o2[0]) {

                        return -1;
                    } else if (o1[0] > o2[0]) {

                        return 1;

                    } else {

                        if (o1[1] < o2[1]) {

                            return -1;
                        } else {

                            return 1;
                        }
                    }


                }
            });

            System.out.println(Arrays.deepToString(book_time_int));

            for (int i = 1; i < book_time_int.length; i++) {

                int pre_end_time = book_time_int[i - 1][1];
                int now_start_time = book_time_int[i][0];

                if (pre_end_time > now_start_time) {


                } else {


                }
            }



            return answer;
        }
    }
}
