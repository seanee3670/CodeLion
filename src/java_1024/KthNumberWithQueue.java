package java_1024;

import java.util.PriorityQueue;

public class KthNumberWithQueue {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            // 우선순위 큐에 from, to까지 넣기
            for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
                pq.add(array[j]);
            }
            // 정렬이 되었기 때문에 뽑기만 한다.
            for (int j = 0; j < commands[i][2]; j++) {
                answer[i] = pq.poll();
            }
        }
        return answer;

    }
}
