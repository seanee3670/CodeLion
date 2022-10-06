package collection.map;

public class MapExercise2 {

    public static void main(String[] args) {
        // 특정 String 에 있는 알파벳 개수 세기
        // String s에 있는 a~z까지 알파벳의 개수를 세는 알고리즘을 구현 해보세요 (대소문자 불문)
        // array 로 해결 가능
        String s = "a2f39S8h^f2l";
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (isAlphabet(ch)) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }

    static boolean isAlphabet(char ch) {
        if ( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ) {
            return true;
        }

        return false;
    }
}
