package java_1024;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        // https://school.programmers.co.kr/learn/courses/30/lessons/42748?language=java

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int beg = commands[i][0] - 1;
            int end = commands[i][1];
            int target = commands[i][2] - 1;

            int[] subArray = Arrays.copyOfRange(array, beg, end);
            Arrays.sort(subArray);

            answer[i] = subArray[target];
        }
        return answer;
    }
}
