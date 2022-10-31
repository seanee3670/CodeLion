package java_1031;

import java.util.ArrayList;
import java.util.List;

public class PRG_42840 {
    public int[] solution(int[] answers) {
        /*
        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
         */

        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (isSupojaAnswer1(i, answers[i])) {
                scores[0]++;
            }
            if (isSupojaAnswer2(i, answers[i])) {
                scores[1]++;
            }
            if (isSupojaAnswer3(i, answers[i])) {
                scores[2]++;
            }
        }

        int maxScore = Math.max(Math.max(scores[0], scores[1]), scores[2]);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                list.add(i + 1);
            }
        }

//        return list.stream().mapToInt(i -> i).toArray(); // 테스트케이스 몇개 통과 하지 못함..
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }


    static boolean isSupojaAnswer1(int idx, int answer) {
        if (idx % 5 + 1 == answer) {
            return true;
        }
        return false;
    }

    static boolean isSupojaAnswer2(int idx, int answer) {
        int supojaAnswer = 0;
        int remainder = idx % 8;

        if (idx % 2 == 0) {
            supojaAnswer = 2;
        }
        else if (remainder == 1) {
            supojaAnswer = 1;
        } else if (remainder == 3) {
            supojaAnswer = 3;
        } else if (remainder == 5) {
            supojaAnswer = 4;
        } else if (remainder == 7) {
            supojaAnswer = 5;
        }

        return supojaAnswer == answer ? true : false;
    }

    static boolean isSupojaAnswer3(int idx, int answer) {
        int supojaAnswer = 0;
        int remainder = idx % 10;

        if (remainder == 0 || remainder == 1) {
            supojaAnswer = 3;
        } else if (remainder == 2 || remainder == 3) {
            supojaAnswer = 1;
        } else if (remainder == 4 || remainder == 5) {
            supojaAnswer = 2;
        } else if (remainder == 6 || remainder == 7) {
            supojaAnswer = 4;
        } else if (remainder == 8 || remainder == 9) {
            supojaAnswer = 5;
        }
        return supojaAnswer == answer ? true : false;
    }
}
