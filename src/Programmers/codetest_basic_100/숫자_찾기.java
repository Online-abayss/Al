package Programmers.codetest_basic_100;

public class 숫자_찾기 {

    public static void main(String[] args) {

        int num = 29183;
        int k = 1;

        Solution solution = new Solution();

        System.out.println(solution.solution(num, k));

    }


    static class Solution {
        public int solution(int num, int k) {
            int answer = -1;

            String str_num = String.valueOf(num);

            for (int i = 0; i< str_num.length(); i++) {

                if (str_num.charAt(i) == Integer.toString(k).charAt(0)) {

                    answer = i+1;
                    break;
                }
            }

            return answer;
        }
    }
}

// 다른사람 풀이
// 전에 다른사람 풀이에서 보던거 까먹어서... char로 비교했으며, str_num.charAt == k가 안되고, equals도 없어서 고민한 결과.

//class Solution {
//    public int solution(int num, int k) {
//        return ("-" + num).indexOf(String.valueOf(k));
//    }
//}
