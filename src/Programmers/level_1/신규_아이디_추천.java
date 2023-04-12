package Programmers.level_1;

import java.util.ArrayList;
import java.util.List;

public class 신규_아이디_추천 {

    public static void main(String[] args) {

//        String new_id = "...!@BaT#*..y.abcdefghijklm";
//        String new_id = "";
//        String new_id = "z-+.^.";
        String new_id = "=.=";
//        String new_id = "123_.def";
//        String new_id = "abcdefghijklmn.p";



        Solution solution = new Solution();

        System.out.println(solution.solution(new_id));

    }
    // id 3~ 15
    // id abcd , 1234 , - , _ , . 등 사용 가능 단 . 는 처음과 끝에 사용 불가능, 연속으로도 불가능.

    // new_id 라면
    // 1. 대문자를 소문자로 치환
    // 2. 소문자 , 숫자 , - , _ , . 제외 문자 제거
    // 3. .가 연속으로 표현되면 하나로 치환.
    // 4. .가 처음과 끝에 표시된 경우면 제거.
    // 5. 빈 문자열 일 경우 a 대입.
    // 6. 16 이상이면 , 첫 15를 제외한 문자 제거, 만약 제거 후 4가 포함이면 4 적용
    // 7. 만약 2글자 이하면, 마지막 문자를 길이 3 될때 까지 이어붙이기.
    static class Solution {
        public String solution(String new_id) {

            String answer = new_id.toLowerCase();

            answer = answer.replaceAll("[^a-z0-9-_.]", "");


            List<String> str_lst = new ArrayList<>();
            String[] arr_str = answer.split("");
            str_lst.add(arr_str[0]);
            int j = 1;

            for (int i = 1 ; i < answer.length(); i++) {

                str_lst.add(arr_str[i]);

                if (str_lst.get(j-1).equals(".") && str_lst.get(j).equals(".")) {

                    str_lst.remove(j);
                } else {

                    j++;
                }
            }

            if (str_lst.get(0).equals(".")) {

                str_lst.remove(0);
            }

            if (str_lst.size() > 15) {

                str_lst = str_lst.subList(0,15);
            }


            if (str_lst.size() == 0) {

                str_lst.add("a");
            } else {
                if (str_lst.get(str_lst.size()-1).equals(".")) {

                    str_lst.remove(str_lst.size()-1);
                }
            }

            if (str_lst.size() < 3) {

                while (str_lst.size() != 3) {

                    str_lst.add(str_lst.get(str_lst.size()-1));
                }
            }

            answer = "";

            for (int i = 0; i < str_lst.size(); i++) {

                answer += str_lst.get(i);
            }

            return answer;
        }
    }
}

// 다른사람 풀이

//class Solution {
//    public String solution(String new_id) {
//        String answer = "";
//        String temp = new_id.toLowerCase();
//
//        temp = temp.replaceAll("[^-_.a-z0-9]","");
//        System.out.println(temp);
//        temp = temp.replaceAll("[.]{2,}",".");
//        temp = temp.replaceAll("^[.]|[.]$","");
//        System.out.println(temp.length());
//        if(temp.equals(""))
//            temp+="a";
//        if(temp.length() >=16){
//            temp = temp.substring(0,15);
//            temp=temp.replaceAll("^[.]|[.]$","");
//        }
//        if(temp.length()<=2)
//            while(temp.length()<3)
//                temp+=temp.charAt(temp.length()-1);
//
//        answer=temp;
//        return answer;
//    }
//}
