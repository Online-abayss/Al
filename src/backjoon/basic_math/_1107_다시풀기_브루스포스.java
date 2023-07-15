//package backjoon.basic_math;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.StringTokenizer;
//
//public class _1107_다시풀기_브루스포스 {
//
//    public static void main(String[] args) throws IOException {
//
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int goal_chanel = Integer.parseInt(br.readLine());
//
//        int t = Integer.parseInt(br.readLine());
//
//        List<Integer> ban_buttons = new ArrayList<>();
//
//        if (t != 0) { // 내가 런타임 에러 뜬 이유 : 고장난 버튼이 없는 경우도 생각해줘야 하기에.
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//            for (int i = 0; i < t; i++) {
//
//                ban_buttons.add(Integer.parseInt(st.nextToken()));
//            }
//        }
//
//        int answer = Math.abs(100-goal_chanel);
//
//        int max_number = 999999;
//
//        for (int i = 0; i <= max_number; i++) {
//
//            boolean check_channel = true;
//            String s = i+"";
//
//            for (int j = 0; j < s.length(); j++) {
//
//                if (ban_buttons.contains(s.charAt(j) - '0')) {
//
//                    check_channel = false;
//                    break;
//                }
//            }
//
//            if (check_channel) {
//
//                answer = Math.min(answer, s.length() + Math.abs(i - goal_chanel));
//            }
//        }
//
//        System.out.println(answer);
//    }
//}


package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1107_다시풀기_브루스포스 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int basic_channel = 100;

        String goal_channel = br.readLine();

        int t = Integer.parseInt(br.readLine());

        ArrayList<Integer> ban_channel = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < t; i ++) {

            ban_channel.add(Integer.parseInt(st.nextToken()));
        }

        int result = Math.abs(Integer.parseInt(goal_channel) - basic_channel);

        for (int i = 0; i < 1000000; i++) {

            String str = String.valueOf(i);
            int len = str.length();

            boolean check = false;

            for (int j = 0; j < len; j++) {

                if (ban_channel.contains(Integer.parseInt(str.split("")[j]))) {

                    check = true;
                    break;
                }


            }

            if (!check) {

                int min = Math.abs(Integer.parseInt(goal_channel) - i) + len;
                result = Math.min(min, result);
            }

        }

        System.out.println(result);
    }
}
