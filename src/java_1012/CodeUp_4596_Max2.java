package java_1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp_4596_Max2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = 9;
        int M = 9;

        int[][] numbers = new int[N][M];

        // receive input
        for (int i = 0; i < numbers.length; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        int max = 0;
        int col = 0;
        int row = 0;

        // find 'max' and 'idx'
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (max < numbers[i][j]) {
                    max = numbers[i][j];
                    row = i;
                    col = j;

                }
            }
        }

        System.out.println(max);
        System.out.println(++row + " " + ++col);         // 열과 행은 1부터 시작함으로 각각 1을 더해준다.
    }
}
