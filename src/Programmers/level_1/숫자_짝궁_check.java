package Programmers.level_1;


// 곰곰히 다시 생각해서 꼭 보기
public class 숫자_짝궁_check {

    public static void main(String[] args) {

        String X = "100";
        String Y = "203045";

//        String X = "12321";
//        String Y = "42531";

        Solution solution = new Solution();

        System.out.println(solution.solution(X, Y));

    }

    static class Solution {
        public String solution(String X, String Y) {

            int[] cntX = new int[10];
            int[] cntY = new int[10];

            for (String tmpX : X.split("")) cntX[Integer.parseInt(tmpX)]++;
            for (String tmpY : Y.split("")) cntY[Integer.parseInt(tmpY)]++;

            StringBuilder sb = new StringBuilder();

            for (int i = 9; i >= 0; i--) {
                while (cntX[i] > 0 && cntY[i] > 0) {
                    sb.append(i);
                    cntX[i]--;
                    cntY[i]--;
                }
            }

            String answer = "";

            if ("".equals(sb.toString())) {
                answer = "-1";
            } else if ("0".equals(sb.toString().substring(0, 1))) {
                answer = "0";
            } else {
                answer = sb.toString();
            }

            return answer;
        }
    }
}

    // 흔한 문제점 많은 로직인가봄. 후....
//    static class Solution {
//        public String solution(String X, String Y) {
//            String answer = "";
//
//            String[] x_arr = X.split("");
//            String[] y_arr = Y.split("");
//            Arrays.sort(x_arr, Comparator.reverseOrder());
//
//
//            for (String s : x_arr) {
//
//                for (int i = 0; i < y_arr.length; i++) {
//
//                    if (s.equals(y_arr[i])) {
//
//                        answer += s;
//                        y_arr[i] = "a";
//                    }
//                }
//            }
//
//            if (answer.isEmpty()) {
//
//                answer = "-1";
//            } else {
//
//                answer = String.valueOf(Integer.parseInt(answer));
//            }
//            return answer;
//        }
//    }
//
//}
