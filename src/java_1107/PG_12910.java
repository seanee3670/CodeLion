package java_1107;

import java.util.stream.*;
import java.util.ArrayList;

public class PG_12910 { // 나누어 떨어지는 숫자 배열
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> arrList = new ArrayList<>();

        for (int e : arr) {
            if (e % divisor == 0) {
                arrList.add(Integer.valueOf(e));
            }
        }

        // if no element is divisible
        if (arrList.size() == 0) {
            return new int[] {-1};
        }

        // ArrayList to int array
        int[] answer = arrList.stream().sorted()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
