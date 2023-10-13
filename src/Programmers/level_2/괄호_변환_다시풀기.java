package Programmers.level_2;

public class 괄호_변환_다시풀기 {

    public static void main(String[] args) {

        String p = "(()())()";

        Solution solution = new Solution();

        System.out.println(solution.solution(p));

    }


    static class Solution {
        public String solution(String p) {
            String answer = "";

            if (check(p)) {

                return p;
            }

            answer = change_line(p);


            return answer;
        }

        private String change_line(String p) {

            if (p.length() == 0) {

                return "";
            }

            StringBuilder u = new StringBuilder();
            StringBuilder v = new StringBuilder();


            int opne_line = 0;

            for (int i = 0; i < p.length(); i++) {

                if (p.charAt(i) == '(') {

                    opne_line ++;
                } else {

                    opne_line --;
                }

                if (opne_line == 0) {

                    u.append(p.substring(0, i + 1));
                    v.append(p.substring(i + 1, p.length() ));

                    if (check(u.toString())) {

                        u.append(change_line(v.toString()));
                    } else {

                        StringBuilder sb = new StringBuilder();

                        sb.append("(");
                        sb.append(change_line(v.toString()));
                        sb.append(")");
                        sb.append(reverse(u.toString()));

                        return sb.toString();

                    }
                    break;
                }

            }

            return u.toString();
        }

        private String reverse(String toString) {

            StringBuilder sb = new StringBuilder();

            for (int i = 1; i < toString.length() - 1; i++) {

                if (toString.charAt(i) == '(') {

                    sb.append(')');
                } else {

                    sb.append('(');
                }
            }
            return sb.toString();
        }

        private boolean check(String p) {

            int opne_line = 0;

            if (p.charAt(0) == ')') {

                return false;
            }

            for (int i = 0; i < p.length(); i++) {

                if (p.charAt(i) == '(') {

                    opne_line ++;
                } else {

                    opne_line --;

                    if (opne_line < 0) {

                        return false;
                    }
                }

            }
            return true;
        }
    }
}
