package Programmers.level_2;


public class k진수에서_소수_개수_구하기_다시풀기 {


    public static void main(String[] args) {

        int n  = 437674;
        int k = 3;

        Solution solution = new Solution();

        System.out.println(solution.solution(n, k));

    }

// 거대한 숫자에 감당이 안됨 소수 판별 다른버전을 써야함
//    static class Solution {
//        public int solution(int n, int k) {
//            int answer = 0;
//
//            String s = Integer.toString(n, k);
//
//            int[] map = new int[1000000];
//
//            map[0] = 1;
//            map[1] = 1;
//
//            // 소수 지도.
//            for (int i = 2; i < map.length; i++) {
//
//                if (map[i] == 0) {
//
//                    for (int j = i + i; j < map.length; j = j + i) {
//
//                        map[j] = 1;
//                    }
//
//                }
//            }
//
//            // 조건 4번
//            if (s.length() == 1 && map[Integer.parseInt(s)] == 0) {
//
//                return 1;
//            }
//
//            char[] words = s.toCharArray();
//
//            // 조건 2번
//            int start = 0;
//            String check = "";
//
//            while (words[start] != '0') {
//
//                check += words[start];
//                start++;
//            }
//
//            if (start > 0 && map[Integer.parseInt(check)] == 0) {
//
//                answer ++;
//            }
//
//            // 조건 3번
//            int last = words.length - 1;
//            check = "";
//
//            while (words[last] != '0') {
//
//                last --;
//            }
//
//            for (int i = last + 1; i < words.length; i++) {
//
//                check += words[i];
//            }
//
//            if (last < words.length - 1 && map[Integer.parseInt(check)] == 0) {
//
//                answer ++;
//            }
//
//            check = "";
//            for (int i = start + 1; i < last; i++) {
//
//                if (words[i] != '0') {
//
//                    check += words[i];
//
//                } else {
//
//                    if (map[Integer.parseInt(check)] == 0) {
//
//                        // 조건 1번
//                        if (words[i - check.length() - 1] == '0' ) {
//
//                            answer ++;
//                            check = "";
//
//                        }
//                    }
//                }
//
//            }
//
//
//            return answer;
//        }
//    }

    static class Solution {

        public int solution(int n, int k) {
            int answer = 0;
            String num = Integer.toString(n, k);
            String[] num_array = num.split("0");

            for(String s:num_array){
                if(s.equals("")) continue;
                long number = Long.parseLong(s);
                if(isPrime(number)){
                    answer++;
                }
            }
            return answer;
        }

        public static boolean isPrime(long num){
            if(num == 1){
                return false;
            }

            if(num == 2) return true;

            for(int i=2;i<=(int)Math.sqrt(num);i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }


    }
}
