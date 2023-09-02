package Programmers.level_2;


import java.util.Arrays;
import java.util.HashSet;

public class 뉴스_클러스터링 {

    public static void main(String[] args) {

//        String str1 = "handshake";
//        String str2 = "shake hands";
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";

        Solution solution = new Solution();

        System.out.println(solution.solution(str1, str2));

    }

    static class Solution {
        public int solution(String str1, String str2) {
            int answer = 0;

            str1 = str1.toUpperCase();
            str2 = str2.toUpperCase();

            String[] test = str1.split("");
            Arrays.sort(test); // 이걸로 확인한 바로는 그냥 역정렬해서 조합 맞춰서 떙치면 될듯?
            System.out.println(Arrays.toString(test));

            String[] str1_arr = str1.split("[^a-zA-Z]");
            String[] str2_arr = str2.split("[^a-zA-Z]");


            Arrays.sort(str1_arr);
            Arrays.sort(str2_arr);
            String text1 = "";
            String text2 = "";
            if (str1_arr.length > 1) {

                for (String s : str1_arr) {

                    text1 += s;
                }

                str1_arr = text1.split("");
            } else if (str2_arr.length > 1) {

                for (String s : str2_arr) {

                    text2 += s;
                }

                str2_arr = text2.split("");
            }

            System.out.println(Arrays.toString(str1_arr));
            System.out.println(Arrays.toString(str2_arr));


            HashSet<String> union = new HashSet<>();
            int intersection = 0;

            for (int i = 0; i < str1_arr.length - 1; i++) {

                String word = str1_arr[i] + str1_arr[i + 1];

                if (!union.contains(word)) {

                    union.add(word);
                } else {

                    intersection ++;
                }

            }
            for (int i = 0; i < str2_arr.length - 1; i++) {

                String word = str2_arr[i] + str2_arr[i + 1];
                if (!union.contains(word)) {

                    union.add(word);
                } else {

                    intersection ++;
                }

            }

            answer = union.size() == 0 ? 65536 : (intersection / union.size() * 65536);

            return answer;
        }
    }
}
