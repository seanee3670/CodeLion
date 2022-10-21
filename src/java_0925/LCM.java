public class LCM {
    public static void main(String[] args) {
        /*
         * 1부터 100 까지의 숫자 중 7의 배수 이자 8의 배수인 첫 번째 수를 구하는 프로그래밍을 구현하시오.
         */
        int num1 = 7;
        int num2 = 8;

        System.out.println("찾는정수:" + lcm(num1, num2));
    }

    static int lcm (int a, int b) {
        return a * b / gcd(a, b);
    }

    static int gcd (int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
