package Programmers.level_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 호텔_대실_다시풀기_1 {

    public static void main(String[] args) {

        String[][] book_time = {{"09:10", "10:10"}, {"10:20", "12:20"}};

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
            int answer = 0;

            int[][] book_int = new int[book_time.length][book_time[0].length];
            for (int i = 0; i < book_time.length; i++) {

                int start_time = Integer.parseInt(book_time[i][0].split(":")[0]) * 60 + Integer.parseInt(book_time[i][0].split(":")[1]);
                int end_time = Integer.parseInt(book_time[i][1].split(":")[0]) * 60 + Integer.parseInt(book_time[i][1].split(":")[1]) + 10;

                book_int[i] = new int[]{start_time, end_time};

            }

            Arrays.sort(book_int, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {

                    if (o1[0] < o2[0]) {

                        return -1;
                    } else if (o1[0] == o2[0]) {

                        return o2[1] - o1[1];
                    }

                    return  1;

                }
            });

            PriorityQueue<Integer> room_check_lst = new PriorityQueue<>();


            for (int i = 0; i < book_int.length; i++) {

                if (room_check_lst.isEmpty()) {

                    room_check_lst.add(book_int[i][1]);
                } else {

                    if (room_check_lst.peek() <= book_int[i][0]) {

                        room_check_lst.poll();
                        room_check_lst.add(book_int[i][1]);
                    } else {

                        room_check_lst.add(book_int[i][1]);
                    }
                }
            }


            answer = room_check_lst.size();

            return answer;
        }
    }
}
