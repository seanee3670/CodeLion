import java.util.ArrayList;

public class Supoja {
    public static void main(String[] args) {
        int[] answers = { 1, 2, 3, 4, 5 };

        Student[] students = new Student[3];
        students[0] = new FailedStudent1();
        students[1] = new FailedStudent2();
        students[2] = new FailedStudent3();

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == students[0].generateAnswer(i)) {
                students[0].plusScore(1);
            }
            if (answers[i] == students[1].generateAnswer(i)) {
                students[1].plusScore(1);
            }
            if (answers[i] == students[2].generateAnswer(i)) {
                students[2].plusScore(1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int maxScore = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].getScore() > maxScore) {
                maxScore = students[i].getScore();
            }
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i].getScore() == maxScore) {
                list.add(i + 1);
            }
        }

        int[] winners = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            winners[i] = list.get(i);
        }

        for (int winner : winners) {
            System.out.println("winner = " + winner);
        }
    }
}
class Student {
    private int score = 0;

    int generateAnswer(int idx) {
        return 0;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void plusScore(int cnt) { this.score += cnt; }

    public int getScore() {
        return score;
    }
}

class FailedStudent1 extends Student {
    @Override
    int generateAnswer(int idx) {
        return idx % 5 + 1;
    }
}

class FailedStudent2 extends Student {
    @Override
    int generateAnswer(int idx) {
        if (idx % 2 == 0) {
            return 2;
        }

        int answer = 0;
        idx = idx % 8;

        if (idx == 1) {
            answer = 1;
        } else if (idx == 3) {
            answer = 3;
        } else if (idx == 5) {
            answer = 4;
        } else if (idx == 7) {
            answer = 5;
        }

        return answer;
    }
}

class FailedStudent3 extends Student {
    @Override
    int generateAnswer(int idx) {
        idx = idx % 10;
        int answer = 0;

        if (idx == 0 || idx == 1) {
            answer = 3;
        } else if (idx == 2 || idx == 3) {
            answer = 1;
        } else if (idx == 4 || idx == 5) {
            answer = 2;
        } else if (idx == 6 || idx == 7) {
            answer = 4;
        } else if (idx == 8 || idx == 9) {
            answer = 5;
        }

        return answer;
    }
}
