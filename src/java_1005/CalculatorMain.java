package java_1005;

public class CalculatorMain {

    public static void main(String[] args) {
        NumberCreator numberCreator = new RandomNumberCreator();
        Calculator randomCalculator = new Calculator(numberCreator);
        randomCalculator.plus(50);

        Calculator byPassCalculator = new Calculator(new ByPassNumberCreator(), 50);
        byPassCalculator.plus(20);

    }
}
