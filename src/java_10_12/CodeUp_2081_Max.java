package java_10_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CodeUp_2081_Max {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 9;
        int[] numbers = new int[N];

        // 이건 왜 입력이 안될까
//        for (int number : numbers) {
//            number = Integer.parseInt(br.readLine());
//        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int idx = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }
}
