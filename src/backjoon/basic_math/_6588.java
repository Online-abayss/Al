package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _6588 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] test_case = new int[100001];

        for (int i = 2; i < test_case.length; i++) {

            for (int j = 1; j * i < test_case.length; j++) {

                test_case[i * j] += 1;
            }
        }

        for (int i = 0; i < test_case.length; i++) {

            if (test_case[i] != 1) {

                test_case[i] = 0;
            } else {

                test_case[i] = i;
            }
        }

        Integer[] Integer_test = Arrays.stream(test_case).boxed().toArray(Integer[]::new);
        HashSet<Integer> test_set = new HashSet<>(Arrays.asList(Integer_test));
        List<Integer> test_lst = new ArrayList<>(test_set);

        while (true) {

            int n = Integer.parseInt(br.readLine());


            if (n == 0) {

                break;
            } else {

                int sum = 0;
                int answer_sum = 0;

                for (int i = test_lst.size() -1 ; i > 0; i--) {

                    for (int j = 1; j <= i - 1; j++ ) {

                        answer_sum = test_lst.get(i) + test_lst.get(j);

                        if (answer_sum == n) {

                            System.out.println(n + " = " + test_lst.get(j) +" + " + test_lst.get(i));
                            break;
                        } else {

                            answer_sum = 0;
                        }
                    }
                    if (answer_sum == n) {

                        break;
                    }
                }
                if (answer_sum == sum) {

                    System.out.println("Goldbach's conjecture is wrong.");
                }
            }
        }
    }
}
