package Programmers.level_2;

public class 큰_수_만들기 {

    public static void main(String[] args) {


        String number = "10001";

        int k = 3;

        Solution solution = new Solution();

        System.out.println(solution.solution(number, k));

    }

    // 내풀이는 뭐가 하나가 빠졋나보다.. 정답지랑 방식은 유사한데...
//    static class Solution {
//        public String solution(String number, int k) {
//            String answer = "";
//
//            String[] str_arr = number.split("");
//
//            int max = 0;
//
//            for (int i = 0; i < str_arr.length - k; i++) {
//
//                int n = Integer.parseInt(str_arr[i]);
//
//                max = Math.max(max, n);
//
//                if (max == 9) {
//
//                    break;
//                }
//
//            }
//
//            int start_idx = number.indexOf(String.valueOf(max));
//            int remove_cnt = k - start_idx;
//            char[] num_ch = number.toCharArray();
//
//            answer += String.valueOf(max);
//
//            for (int i = start_idx + 1; i < str_arr.length; i++) {
//
//                if (num_ch[i - 1] > num_ch[i] && remove_cnt != 0) {
//
//                    remove_cnt -= 1;
//                    continue;
//                } else {
//
//                    answer += str_arr[i];
//                }
//
//            }
//
//            if (answer.length() > str_arr.length - k) {
//
//                answer = answer.substring(0, number.length() - k);
//            }
//
//            return answer;
//        }
//    }

    static class Solution {
        public String solution(String number, int k) {
            StringBuilder sb = new StringBuilder();
            int index = 0;
            int max = 0;
            for(int i=0; i<number.length() - k; i++) {
                max = 0;
                for(int j = index; j<= k+i; j++) {
                    if(max < number.charAt(j)-'0') {
                        max = number.charAt(j)-'0';
                        index = j+1;
                    }
                }
                sb.append(max);
            }
            return sb.toString();
        }
    }
}
