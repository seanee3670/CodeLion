package java_1005;

public class RandomCalculator extends RandomNumberCreator {

    public int add(int a) {
        return a + generateRandomNumber();
    }

    public int subtract(int a) {
        return a - generateRandomNumber();
    }

    public int multiply(int a) {
        return a * generateRandomNumber();
    }

    public int divide(int a) {
        try {
            return a / generateRandomNumber();
        } catch (Exception e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
            return 0;
        }
    }
}
