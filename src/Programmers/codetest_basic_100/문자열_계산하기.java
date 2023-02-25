package Programmers.codetest_basic_100;

import java.util.Arrays;

class 문자열_계산하기 {

    public static void main(String[] args) {

        String my_string = "3 + 4";

        Solution solution = new Solution();

        System.out.println(solution.solution(my_string));

    }

    static class Solution {
        public int solution(String my_string) {


            String[] str_arr = my_string.split(" ");

            int answer = Integer.parseInt(str_arr[0]);

            for (int i = 1; i < str_arr.length; i++) {

                if (str_arr[i].equals("+")) {

                    answer += Integer.parseInt(str_arr[i+1]);

                } else if (str_arr[i].equals("-")) {

                    answer -= Integer.parseInt(str_arr[i+1]);

                }
            }

            return answer;
        }
    }
}

// 다른사람 풀이
// 이문제 3 + 4 로 하나씩만 나오는게 아니라 4 + 5 + 7 - 1 처럼 여러개 나올 수 있다는걸 몰랐다.


//        import java.util.Arrays;
//
//class Solution {
//    public int solution(String myString) {
//        return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
//    }
//}

// [+] 는 + 자체를 문자로 인식시키기 위해
