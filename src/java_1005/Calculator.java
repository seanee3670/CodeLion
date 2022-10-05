package java_1005;

public class Calculator {

    private int a;
    private int b;
    private NumberCreator numberCreator;
    private int baseNum = 10;

    public Calculator() {}
    public Calculator(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
    }

    public Calculator(NumberCreator numberCreator, int baseNum) {
        this.numberCreator = numberCreator;
        this.baseNum = baseNum;
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }


/*
    더하기 빼기 곱하기 나누기
     */

    public void plus (int num) {
        int left = num;
        int right = numberCreator.generateNumber(baseNum);
        int result = left + right;
        System.out.println(left + " + " + right + " = " + result);
    }
    public void minus (int num) {
        int left = num;
        int right = numberCreator.generateNumber(baseNum);
        int result = left - right;
        System.out.println(left + " - " + right + " = " + result);
    }
    public void multiple (int num) {
        int left = num;
        int right = numberCreator.generateNumber(baseNum);
        int result = left * right;
        System.out.println(left + " x " + right + " = " + result);
    }
}
