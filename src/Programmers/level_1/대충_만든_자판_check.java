package Programmers.level_1;

import java.util.Arrays;
import java.util.HashMap;

public class 대충_만든_자판_check {

    public static void main(String[] args) {

//        String[] keymap = {"ABACD", "BCEFD"};
//        String[] target = {"ABCD", "AABB"};

//        String[] keymap = {"AA"};
//        String[] target = {"B"};

        String[] keymap = {"ABCE"};
        String[] target = {"ABDE"};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(keymap, target)));

    }

    // 이건 되고 내껀 안되는거 하아... 나중에 곱 씹어봐야지
    static class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            HashMap<Character, Integer> hm = new HashMap<>();
            int[] ret = new int[targets.length];

            for(String key : keymap) {
                for(int i=0 ; i<key.length() ; i++) {
                    char c = key.charAt(i);
                    if(!hm.containsKey(c) || i<hm.get(c)) {
                        hm.put(c, i+1);
                    }
                }
            }

            for(int i=0 ; i<targets.length ; i++) {
                int cnt = 0;
                for(int j=0 ; j<targets[i].length() ; j++) {
                    char c = targets[i].charAt(j);
                    if(!hm.containsKey(c)) {
                        cnt = 0;
                        break;
                    } else {
                        cnt += hm.get(c);
                    }
                }
                ret[i] = cnt==0?-1:cnt;
            }
            return ret;
        }
    }
}

//    // 반레를 못찾아서 풀지를 못하겟다. 후... 테스트코드는 다 맞는데. 런타임 오류도 뜨고 후...
//    static class Solution {
//        public int[] solution(String[] keymap, String[] targets) {
//            int[] answer = new int[keymap.length];
//
//            // a = 한번 / b =2 / c =3;
//            // "abacd" = a는 1 / b는 2 / a = 3 /
//
//            // keymap 을 배열 26개 해가지고 각 알파벳에 최소값을 구하는게 속도면에서 이득일려나
//
//            int[] arr_alpha = new int[27];
//            for (int i = 0; i < arr_alpha.length; i++) {
//
//                arr_alpha[i] = 101;
//            }
//
//            for (int i = 0; i < keymap.length; i++) { // keymap 하나씩
//
//                char[] arr_char = keymap[i].toCharArray(); // keymap 배열화
//
//                for (int j = 0; j < arr_char.length; j++) { // 배열화한거 하나씩 비교
//
//                        arr_alpha[arr_char[j] - 64] = Math.min(arr_alpha[arr_char[j]  - 64],
//                                keymap[i].indexOf(Character.toString(arr_char[j])) + 1); // 기존 배열 값과 새로운 인덱스 값 비교 // +1를 한 이유는 a = 1로 처리하기 위해 비교할려고 처음부터 설정.
//
//                }
//            }
//
//            for (int i = 0; i< targets.length; i++) {
//
//                int sum = 0;
//
//                char[] arr_char = targets[i].toCharArray();
//
//                for (int j = 0; j < arr_char.length; j++) {
//
//                    if (arr_alpha[arr_char[j] - 64] == 101) {
//
//                        sum = -1;
//                        break;
//                    } else {
//
//                        sum += arr_alpha[arr_char[j] - 64];
//                    }
//                }
//                answer[i] = sum;
//            }
//
//            return answer;
//        }
//    }
//}
