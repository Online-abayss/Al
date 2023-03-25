package Programmers.level_1;

// 차근차근 하나씩 하는게 중요하다. 꼭 다시보기
public class 옹알이_2_check {

    public static void main(String[] args) {

//        String[] babbling = {"aya" ,"yee", "u", "maa"};
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa", "mawoowoo"};

        Solution solution = new Solution();

        System.out.println(solution.solution(babbling));
    }

    static class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            for(int i = 0; i < babbling.length; i++) {
                if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) {
                    continue;
                }

                babbling[i] = babbling[i].replace("aya", " ");
                babbling[i] = babbling[i].replace("ye", " ");
                babbling[i] = babbling[i].replace("woo", " ");
                babbling[i] = babbling[i].replace("ma", " ");
                babbling[i] = babbling[i].replace(" ", "");

                if(babbling[i].length()  == 0) answer++;

            }
            return answer;
        }
    }
}
