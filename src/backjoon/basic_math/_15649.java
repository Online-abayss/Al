package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _15649 {

    static Stack<Integer> case_stack = new Stack<>();

    static int n;
    static int m;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        s();
    }

    private static void s() {

        if (case_stack.size() == m) {

            for (int i : case_stack) {

                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i ++) {

            if (!case_stack.contains(i)) {

                case_stack.add(i);
                s();
                case_stack.pop();

            }
        }

    }
}

// 처음에 1 넣고 재귀해서 2 넣어지고 , 사이즈가 2가 되서 다 튕겨져서 s() 재귀가 끝나고 pop으로 인해 2가 빠지고, 이떄 맨 처음의 반복문 1은 진행중이며,
// 그 다음 반복문 1 부터 진행하는게 2까지 진행되서 1,2가 나온것이며, 이건 pop으로 인해 빠져 나오며, 다시 3일떄 1,3으로 넣어지고 이렇게 무한반복.
