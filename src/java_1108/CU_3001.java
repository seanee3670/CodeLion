package java_1108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CU_3001 { // 데이터 탐색 (선형)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        String str = br.readLine();

        String[] arr = str.split(" ");

        String key = br.readLine();

        for (String e : arr) {
            if (key.equals(e)) {
                System.out.println(e);
                break;
            }
        }


    }
}
