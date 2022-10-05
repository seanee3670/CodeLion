package java_1005;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.add(10, 20));
        System.out.println(cal.subtract(10, 20));
        System.out.println(cal.multiply(10, 20));
        System.out.println(cal.divide(10, 20));

    }
}
