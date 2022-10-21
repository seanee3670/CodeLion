import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalAmountOfMoney {
    public static void main(String[] args) throws IOException {
        /*
         * 다음과 같이 화폐 매수를 구하는 프로그램을 구현하시오.
         * ```
            금액을 넣으세요:[숫자입력]
            50000원?개
            10000원?개
            5000원?개
            1000원?개
            500원?개
            100원?개
            50원?개
            10원?개
            ```
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] amountUnit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int totalAmount;

        System.out.print("금액을 넣으세요:");
        totalAmount = Integer.valueOf(br.readLine());

        for (int unit : amountUnit) {
            int quotient = totalAmount / unit;
            System.out.printf("%d원%d개%n", unit, quotient);
            totalAmount -= unit * quotient;
        }
    }

}
