package Programmers.codetest_basic_100;

import java.util.HashMap;

public class 로그인_성공 {

    public static void main(String[] args) {

        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        Solution solution = new Solution();

        System.out.println(solution.solution(id_pw, db));
    }


    static class Solution {
        public String solution(String[] id_pw, String[][] db) {
            String answer = "";

            HashMap<String, String> stringHashMap = new HashMap<>();

            for (String[] arr_db : db) {

                stringHashMap.put(arr_db[0], arr_db[1]);
            }

            if (stringHashMap.containsKey(id_pw[0])) {

                return stringHashMap.get(id_pw[0]).equals(id_pw[1]) ? "login" : "wrong pw";

            } else return "fail";
        }
    }

}

// 다른사람 풀이
//class Solution {
//    public String solution(String[] id_pw, String[][] db) {
//        String answer = "";
//
//        for(int i = 0; i < db.length; i++){
//            if(db[i][0].equals(id_pw[0])){
//                if(db[i][1].equals(id_pw[1])){
//                    return "login";
//                }
//                return "wrong pw";
//            }
//        }
//        return "fail";
//    }
//}
