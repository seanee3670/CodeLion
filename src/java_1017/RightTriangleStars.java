package java_1017;

public class RightTriangleStars {

    public void print() {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }

    public void printLoop(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void printPyramid(int n) {
        for (int i = 0; i < n; i++) {
            // 공백
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }

            System.out.print("\n");

        }

    }

    public void printReversePyramid(int n) {
        for (int i = n - 1; i >= 0; i--) {
            // 공백
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }

    public void printRhombus(int n) {
        printPyramid(n);
        printReversePyramid(n);
    }
}
