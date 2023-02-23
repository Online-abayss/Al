package Programmers.codetest_basic_100;

class 문자열_밀기 {

    public static void main(String[] args) {


        String A = "apple";
        String B = "elppa";

        Solution solution = new Solution();

        System.out.println(solution.solution(A,B));
    }

    static class Solution {
        public int solution(String A, String B) {
            int answer = 0;
            String temp = A;

            if (!A.equals(B)) {

                for (int i = 0; i<A.length(); i++) {


                    temp = temp.charAt(temp.length()-1) + temp.substring(0,temp.length()-1);

                    System.out.println(temp);

                    answer ++;

                    if (temp.equals(B)) {

                        break;
                    }

                }

                if (!temp.equals(B)) {

                    answer = -1;
                }

            }

            return answer;
        }
    }
}

// 다른 사람 풀이 ( 이해하고 감탄.)

//class Solution {
//    public int solution(String A, String B) {
//        String tempB = B.repeat(3);
//        return tempB.indexOf(A);
//    }
//}
