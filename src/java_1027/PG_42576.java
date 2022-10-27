package java_1027;

import java.util.Arrays;

public class PG_42576 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int pLen = participant.length - 1;

        String answer = participant[pLen];

        for (int i = 0; i < pLen; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }

        }
        return answer;
    }
}
