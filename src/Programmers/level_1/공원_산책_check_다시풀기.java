package Programmers.level_1;

import java.util.Arrays;

public class 공원_산책_check_다시풀기 {

    public static void main(String[] args) {

        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(park,routes)));

    }


// 이제 제대로 푼거 같은데 런타임 오류 및 틀린 에제들이 뭔지 모르겠으니 나중에 비교하면서 풀기 https://123okk2.tistory.com/432
    static class Solution {
        public int[] solution(String[] park, String[] routes) {

            int[][] square = new int[51][51];

            int start_x = 0;
            int start_y = 0;

            for (int i = 0; i < park.length; i++) {

                String[] s_arr = park[i].split("");

                for (int j = 0; j < s_arr.length; j++) {

                    if (s_arr[j].equals("S")) {

                        square[i][j] = 1;
                        start_x = i;
                        start_y = j;
                    } else if (s_arr[j].equals("O")) {

                        square[i][j] = 1;
                    } else {

                        square[i][j] = 0;
                    }
                }
            }

            for (int i = 0 ; i < routes.length; i++ ) {

                String route = routes[i].split(" ")[0];
                int cnt = Integer.parseInt(routes[i].split(" ")[1]);

                for (int j = 1; j < cnt +1; j++) {

                    if (route.equals("E")) {

                        if (start_y + cnt -j + 1>= park[i].split("").length)  {


                            break;
                        }
                        start_y += 1;

                        if (square[start_x][start_y] == 0) {

                            start_y -=1;
                            break;
                        }
                    } else if (route.equals("S")) {


                        if (start_x + cnt -j +1>= park[i].split("").length)  {

                            break;
                        }

                        start_x += 1;

                        if (square[start_x][start_y] == 0) {

                            start_x -=1;
                            break;
                        }
                    } else if (route.equals("W")) {

                        if (start_y - cnt +j -1< 0)  {

                            break;
                        }

                        start_y -= 1;
                        if (square[start_x][start_y] == 0) {

                            start_y +=1;
                            break;
                        }

                    } else if (route.equals("N")) {

                        if (start_x - cnt +j -1< 0)  {

                            break;
                        }

                        start_x -= 1;
                        if (square[start_x][start_y] == 0) {

                            start_x +=1;
                            break;
                        }
                    }
                }
            }

            return new int[]{start_x, start_y};
        }
    }
}
