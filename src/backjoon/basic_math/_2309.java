package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class _2309 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> number_lst = new ArrayList<>();

        int sum = 0;

        for (int i  = 0 ; i < 9; i++) {

            number_lst.add(Integer.parseInt(br.readLine()));
            sum += number_lst.get(i);
        }

        int idx1 = 0;
        int idx2 = 0;

        for (int i = 0; i < 8; i++) {

            for (int j = i + 1; j < 9; j++) {

                if (sum - number_lst.get(i) - number_lst.get(j) == 100) {

                    idx1 = i;
                    idx2 = j;
                }
            }
        }
        number_lst.remove(idx2);
        number_lst.remove(idx1);

        Collections.sort(number_lst);

        for (Integer integer : number_lst) {

            System.out.println(integer);
        }
    }
}
