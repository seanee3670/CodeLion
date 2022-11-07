package java_1107;

public class PG_12947 { // 하샤드 수
    class Solution {
        public boolean solution(int x) {

            int sumDigits = 0;
            int temp = x;

            while (temp > 0) {
                sumDigits += temp % 10;
                temp /= 10;
            }

            return x % sumDigits == 0;
        }
    }
}
