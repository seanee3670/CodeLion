package java_1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionTriangleStars {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        printTriangle(N, N);
    }

    static void printTriangle(int depth, int loops) {
        if (depth == 0) {
            return;
        }

        if (loops == 0) {
            System.out.println();
            return;
        }

        if (depth == loops) {
            printTriangle(depth - 1, depth - 1);
        }

        System.out.print("*");

        printTriangle(depth, loops - 1);


    }
}
