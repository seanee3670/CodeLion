package java_1028;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PG_42577 {
    public boolean solution(String[] phone_book) {

        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], "prefix");
        }

        for(String s : phone_book) {
            for(int i = 1; i < s.length(); i++) {
                if(map.containsKey(s.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
