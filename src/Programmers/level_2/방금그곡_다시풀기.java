package Programmers.level_2;

public class 방금그곡_다시풀기 {


    public static void main(String[] args) {

        String m = "ABC";

        String[] musicinfos = {"12:00,12:06,HELLO,ABC#ABC#ABC"};

        Solution solution = new Solution();

        System.out.println(solution.solution(m, musicinfos));

    }
// 메모리 초과로 떙.
//    static class Solution {
//        public String solution(String m, String[] musicinfos) {
//
//            String answer = "";
//
//            for (int i = 0; i < musicinfos.length; i++) {
//
//                String[] page = musicinfos[i].split(",");
//
//                // 시간차를 구하기
//
//                String[] time_first = page[0].split(":");
//                String[] time_second = page[1].split(":");
//
//                int first_time = Integer.parseInt(time_first[0]) * 60 + Integer.parseInt(time_first[1]);
//                int second_time = Integer.parseInt(time_second[0]) * 60 + Integer.parseInt(time_second[1]);
//
//                int diff_time = second_time - first_time;
//
//                String Sheet_music = page[3];
//
//                // 시간차만큼 단어채우기
//
//                int rep = (int) Math.ceil((double) diff_time / Sheet_music.length());
//
//                for (int j = 0; j < rep + 1; j++) {
//
//                    Sheet_music += Sheet_music;
//                }
//
//                if (Sheet_music.charAt(diff_time + 1) == '#') {
//
//                    Sheet_music = Sheet_music.substring(0, diff_time + 2);
//                } else {
//
//                    Sheet_music = Sheet_music.substring(0, diff_time + 1);
//                }
//
//                // A# , A 구분을 위한 치환
//                Sheet_music = change_word(Sheet_music);
//
//
//                // m이 포함되여있는지 여부 파악
//
//                m = change_word(m);
//
//                if (Sheet_music.contains(m)) {
//
//                    answer = page[2];
//                }
//
//            }
//
//            if (answer.isEmpty()) {
//
//                answer = "None";
//            }
//
//            return answer;
//        }
//
//    private String change_word(String sheet_music) {
//
//        if (sheet_music.contains("A#")) {
//
//            sheet_music = sheet_music.replace("A#", "H");
//        }
//        if (sheet_music.contains("C#")) {
//
//            sheet_music = sheet_music.replace("C#", "I");
//        }
//        if (sheet_music.contains("D#")) {
//
//            sheet_music = sheet_music.replace("D#", "J");
//        }
//        if (sheet_music.contains("F#")) {
//
//            sheet_music = sheet_music.replace("F#", "K");
//        }
//
//        return sheet_music;
//    }
//}

    static class Solution {
        public String solution(String m, String[] musicinfos) {
            String answer = "";



            return answer;
        }
    }
}

//https://velog.io/@hyunjkluz/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A417683-3%EC%B0%A8-%EB%B0%A9%EA%B8%88%EA%B7%B8%EA%B3%A1-Java
