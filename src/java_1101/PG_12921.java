package java_1101;

import java.util.Arrays;

public class PG_12921 { // 소수찾기
    public int solution(int n) {

        boolean[] primes = new boolean[n + 1];

        Arrays.fill(primes, true);

        primes[0] = false;
        primes[1] = false;

        int cnt = 0;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                cnt++;
                for (int j = i; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }
        }

        return cnt;
    }
}
