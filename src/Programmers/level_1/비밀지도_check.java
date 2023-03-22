package Programmers.level_1;

import java.util.Arrays;

// 뭔가 이렇게 어거지로 풀고 싶었음.
public class 비밀지도_check {

    public static void main(String[] args) {

        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(n, arr1, arr2)));

    }

    static class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];

            for (int i = 0; i < n; i++) {

                String s = "";

                String[] arr_str = Long.toString(Long.parseLong(Long.toString(arr1[i], 2)) // arr1 에 대한 2진법
                        + Long.parseLong(Long.toString(arr2[i], 2))  // arr2에 대한 2진법
                        + Long.parseLong(Long.toString((int)Math.pow(2, n), 2))).split(""); // 1에 대한 2진법이 1를 100001로 변경하기위한 pow

                for (int j = 1; j < arr_str.length; j++) {

                    if (arr_str[j].equals("0")) {

                        s += " ";
                    } else {

                        s += "#";
                    }
                }

                answer[i] = s;
            }
            return answer;
        }
    }
}

// 다른사람 풀이

// 풀이과정 https://velog.io/@wldus9503/JAVA%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-1%EB%8B%A8%EA%B3%84-%EB%AC%B8%EC%A0%9C1%EB%B2%88-c67ickex

//class Solution {
//  public String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] result = new String[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
//        }
//
//        for (int i = 0; i < n; i++) {
//            result[i] = String.format("%" + n + "s", result[i]);
//            result[i] = result[i].replaceAll("1", "#");
//            result[i] = result[i].replaceAll("0", " ");
//        }
//
//        return result;
//    }
//}
