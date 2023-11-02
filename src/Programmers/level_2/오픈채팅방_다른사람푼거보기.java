package Programmers.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 오픈채팅방_다른사람푼거보기 {

    public static void main(String[] args) {

        String[] record= {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(record)));

    }

//    static class Solution {
//        public String[] solution(String[] record) {
//
//            HashMap<String , String> id_nick_name = new HashMap<>();
//
//            ArrayList<String> recoding = new ArrayList<>();
//
//            for (int i = 0; i < record.length; i++) {
//
//                String[] info = record[i].split(" ");
//                String check = info[0];
//                String id = info[1];
//
//                if (check.equals("Enter")) {
//
//                    id_nick_name.put(id, info[2]);
//                    recoding.add(id + ",1" );
//
//                } else if (check.equals("Leave")) {
//
//                    recoding.add(id + ",-1");
//
//                } else if (check.equals("Change")) {
//
//                    id_nick_name.put(id, info[2]);
//                }
//
//            }
//
//            String[] answer = new String[recoding.size()];
//
//            for (int i = 0; i < recoding.size(); i++) {
//
//                String[] split = recoding.get(i).split(",");
//
//                String nick_name = id_nick_name.get(split[0]);
//                String check_out = split[1];
//
//                answer[i] = check_out.equals("1") ? nick_name + "님이 들어왔습니다." : nick_name + "님이 나갔습니다.";
//            }
//
//
//            return answer;
//        }
//    }

    static class Solution {
        public String[] solution(String[] record) {

            HashMap<String, String> user_nickname = new HashMap<>();
            ArrayList<String> check_InOut = new ArrayList<>();


            for (String s : record) {

                String[] info = s.split(" ");
                if (info[0].equals("Enter")) {

                    user_nickname.put(info[1], info[2]);
                    check_InOut.add(info[0] + " " + info[1]);

                } else if (info[0].equals("Leave")) {

                    check_InOut.add(info[0] + " " + info[1]);
                } else if (info[0].equals("Change")) {

                    user_nickname.put(info[1], info[2]);
                }

            }

            String[] answer = new String[check_InOut.size()];

            for (int i = 0; i < check_InOut.size(); i++) {

                String user = check_InOut.get(i).split(" ")[1];
                String InOut = check_InOut.get(i).split(" ")[0];

                answer[i] = InOut.equals("Enter") ? user_nickname.get(user) + "님이 들어왔습니다." : user_nickname.get(user) + "님이 나갔습니다.";
            }

            return answer;
        }
    }

}
