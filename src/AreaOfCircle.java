import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfCircle {
    public static void main(String[] args) throws IOException {
        /*
         * 원의 반지름을 입력 하면, 해당 넓이가 나오는 프로그램을 작성하시오.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double radius;

        System.out.print("반지름을 입력하세요 : ");
        radius = Integer.valueOf(br.readLine());

        System.out.println("반지름의 넓이는 : " + areaOfCircle(radius));
    }

    static double areaOfCircle(double r) {
        return Math.PI * r * r;
    }
}
