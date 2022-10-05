package java_1005;

public class Calculator {

    private int a;
    private int b;

    public Calculator() {}

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }


/*
    더하기 빼기 곱하기 나누기
     */

    public int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public double divide() {
        return (double) a / (double) b;
    }
}
