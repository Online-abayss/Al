package Programmers.level_1;

public class 둘만의_암호_check {

    public static void main(String[] args) {

        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        Solution solution = new Solution();

        System.out.println(solution.solution(s, skip, index));


    }

    // 나도 이렇게 생각했지만  (내껀 )너무 복잡하다.
    static class Solution {
        public String solution(String s, String skip, int index) {
            String answer = "";

            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                int count = 1;
                while(count <= index){
                    c +=1;
                    if(c > 'z')
                        c -= 26;
                    if(skip.contains(c+"")) // c+ "" -> String.valueOf(c) c 뒤에 ""를 붙여서 autocast를 노림.
                        continue;
                    else
                        count++;
                }
                answer += c;
            }

            return answer;
        }
    }

    // 에라이 ... 고생했는데 틀림..
//    static class Solution {
//        public String solution(String s, String skip, int index) {
//            String answer = "";
//
//            char[] s_char = s.toCharArray();
//
//            for (int i = 0 ; i < s.length(); i++) { // s에 관한
//
//                int a = 0;
//
//                for (int j = 1 ; j <index + 1; j++) {
//
//                    if (s_char[i] + j > 122) {
//
//                        if (skip.contains(String.valueOf((char)(s_char[i] + j + a -26)))) { //skip에 s + 1~5를 더한게 포함되여 있는지. 있다면 다음 단어로 재실행
//
//                            a++;
//                        }
//
//                    } else {
//
//                        if (skip.contains(String.valueOf((char)(s_char[i] + j + a)))) { //skip에 s + 1~5를 더한게 포함되여 있는지. 있다면 다음 단어로 재실행
//
//                            a++;
//                        }
//                    }
//                }
//                if (s_char[i] + index + a > 122) {
//
//                    answer += String.valueOf((char)(s_char[i] + index + a - 26));
//
//
//                } else {
//
//                    answer += String.valueOf((char)(s_char[i] + index + a));
//
//                }
//            }
//            return answer;
//        }
//    }
}
