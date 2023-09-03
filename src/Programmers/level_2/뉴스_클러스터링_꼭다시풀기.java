package Programmers.level_2;


import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 에이 걍 set을 하나 더 만들자
public class 뉴스_클러스터링_꼭다시풀기 {

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

//            String[] str1_arr = str1.split("[^a-zA-Z]");
//            String[] str2_arr = str2.split("[^a-zA-Z]");

            String[] str1_arr = str1.split("");
            String[] str2_arr = str2.split("");

//            Arrays.sort(str1_arr, Comparator.reverseOrder());
//            Arrays.sort(str2_arr, Comparator.reverseOrder());

            HashSet<String> word_set = new HashSet<>();

            Pattern pattern = Pattern.compile("^[A-Z]*$");
            int intersection = 0;

            int start1 = 0;
            int start2 = 0;

            System.out.println(Arrays.toString(str1_arr));
            System.out.println(Arrays.toString(str2_arr));

            for (int i = 0; i < str1_arr.length - 1; i++) {

                    int j = i + 1;
                    Matcher matcher1 = pattern.matcher(str1_arr[i]);
                    Matcher matcher2 = pattern.matcher(str1_arr[j]);
                    String combination_word = str1_arr[i] + str1_arr[j];

                    if (!matcher1.matches()) {
                        start1 = i;
                        continue;
                    } else if (!matcher2.matches()) {

                        start2 = j;
                        continue;
                    }

                if (!word_set.contains(combination_word)) {

                        word_set.add(combination_word);

                    }

                }

            for (int i = 0; i < str2_arr.length - 1; i++) {

                    int j = i + 1;
                    Matcher matcher1 = pattern.matcher(str2_arr[i]);
                    Matcher matcher2 = pattern.matcher(str2_arr[j]);
                    String combination_word = str2_arr[i] + str2_arr[j];

                    if (!matcher1.matches()) {
                        start2 = i;
                        continue;
                    } else if (!matcher2.matches()) {
                        start2 = j;
                        continue;
                    }

                    if (word_set.contains(combination_word)){

                        intersection ++;
                    } else {

                        word_set.add(combination_word);


                }

            }


            if (start1 == start2) {

                return 65536;
            }

            return answer = word_set.size() == 0 ? 65536 : intersection / word_set.size() * 65536;
        }
    }
}
