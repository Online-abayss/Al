package Programmers.level_2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 거리두기_확인하기_다시풀기 {

    public static void main(String[] args) {

        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(places)));

    }
    // r1 + 2 - r1 > 2
    // 5*5
    // 맨해튼 거리 |r1 - r2 | + |c1 - c2| > 2
    //   ㄴ 단 사이에 파티션이 있을경우 허용
    // p = 사람 o = 빈 테이블 x = 파티션
    // 조건 충족 시 1, 아닐시 0;
    // {p,x} {x,p} 만 인정한다.

    static class Solution {
        public int[] solution(String[][] places) {
            int[] answer = new int[places.length];

            for (int i = 0; i < places.length; i++) {

                String[] p = places[i];

                boolean check = true;

                for (int r = 0; r < 5 && check; r++) {

                    for (int c = 0; c < 5 && check; c++) {

                        if (p[r].charAt(c) == 'P') {

                            if (!bfs(r,c,p)) {

                                check = false;
                            }
                        }
                    }
                }
                answer[i] = check ? 1 : 0;
            }


            return answer;
    }

        private boolean bfs(int r, int c, String[] p) {

            int dr[] = {-1,1,0,0};
            int dc[] = {0,0,-1,1};

            Queue<int[] > queue = new LinkedList<>();

            queue.offer(new int[]{r,c});

            while (!queue.isEmpty()) {

                int[] position = queue.poll();

                for (int i = 0; i < 4; i++) {

                    int nr =  position[0] + dr[i];
                    int nc = position[1] + dc[i];

                    if (nr < 0 || nc < 0 || nr >= 5 || nc >= 5 || (nr == r && nc == c))
                        continue;

                    int d = Math.abs(nr - r) + Math.abs(nc - c);

                    if (p[nr].charAt(nc) == 'P' && d <= 2)
                        return false;
                    else if (p[nr].charAt(nc) == 'O' && d < 2)
                        queue.offer(new int[] { nr, nc });
                }
            }
            return true;
        }
        }
    }
//https://velog.io/@yanghl98/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EA%B1%B0%EB%A6%AC%EB%91%90%EA%B8%B0-%ED%99%95%EC%9D%B8%ED%95%98%EA%B8%B0-JAVA%EC%9E%90%EB%B0%94
// https://jisunshine.tistory.com/148
