package java_1005;

public class RandomCalculator extends RandomNumberCreator {

    public int add(int a) {
        return a + generateNumber(a);
    }

    public int subtract(int a) {
        return a - generateNumber(a);
    }

    public int multiply(int a) {
        return a * generateNumber(a);
    }

    public int divide(int a) {
        try {
            return a / generateNumber(a);
        } catch (Exception e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
            return 0;
        }
    }
}
