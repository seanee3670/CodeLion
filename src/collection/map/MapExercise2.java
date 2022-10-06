package collection.map;

import java.util.HashMap;

public class MapExercise2 {

    public static void main(String[] args) {
        // 특정 String 에 있는 알파벳 개수 세기
        // String s에 있는 a~z까지 알파벳의 개수를 세는 알고리즘을 구현 해보세요 (대소문자 불문)
        // array 로 해결 가능

        String s = "a2f39S8h^f2l";
        int cnt = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (isAlphabet(ch)) {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                }
                else if (!map.containsKey(ch)) {
                    map.put(ch, 1);
                }
            }
        }

        System.out.println(map);

    }

    static boolean isAlphabet(char ch) {
        return ( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') );
    }

}
