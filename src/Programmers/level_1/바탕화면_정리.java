package Programmers.level_1;

import java.util.Arrays;

public class 바탕화면_정리 {

    public static void main(String[] args) {

        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(wallpaper)));
    }
// 빈칸 . 파일칸 #

    // 첫번째 x는 String 마다 #이 포함되어 있는 것 중 가장 적은 index값 , y는 String 마다 가장 먼저 #이 포함되여 있는 index값.
    // 두번째 x는 뒤에서 부터 String 마다 #이 가장 먼저 포함되어 있는 idx , y는 String 마다 #이 포함되어 있는 것 중 가장 큰 index.
    static class Solution {
        public int[] solution(String[] wallpaper) {

            //x 관련
            int x1 = 0;
            int y1 = 51;
            int x2 = 0;
            int y2 = 0;

            int x = 0;
            int y = wallpaper.length ;

            for (int i = 0; i < wallpaper.length; i++) {

                if (wallpaper[i].contains("#")) {

                    y1 = Math.min(y1, wallpaper[i].indexOf("#"));
                    y2 = Math.max(y2, wallpaper[i].lastIndexOf("#") +1);
                }
            }

            while (x < wallpaper.length) {

                if (wallpaper[x].contains("#")) {

                    x1 = x;
                    break;
                } else {

                    x++;
                }
            }

            while (y > 0) {

                if (wallpaper[y-1].contains("#")) {

                    x2 = y;
                    break;
                } else {

                    y--;
                }
            }


            return new int[]{x1,y1,x2,y2};
        }
    }
}

// 다른사람 풀이

//
//
//class Solution {
//    public int[] solution(String[] wallpaper) {
//        int minX = Integer.MAX_VALUE;
//        int minY = Integer.MAX_VALUE;
//        int maxX = Integer.MIN_VALUE;
//        int maxY = Integer.MIN_VALUE;
//        for(int i=0; i< wallpaper.length;i++ ){
//            for(int j=0; j<wallpaper[i].length();j++){
//                if(wallpaper[i].charAt(j)=='#'){
//                    minX = Math.min(minX,i);
//                    minY = Math.min(minY,j);
//                    maxX = Math.max(maxX,i);
//                    maxY = Math.max(maxY,j);
//                }
//            }
//        }
//        return new int[]{minX,minY,maxX+1,maxY+1};
//    }
//}
