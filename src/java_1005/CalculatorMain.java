package java_1005;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator cal = new Calculator(10, 20);

        System.out.println(cal.add());
        System.out.println(cal.subtract());
        System.out.println(cal.multiply());
        System.out.println(cal.divide());

    }
}
