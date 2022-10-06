package collection.set;

import java.util.HashSet;
import java.util.Set;

public class RndABCGenerator {
    public String generateABC() {
        // 대문자 알파벳 (65 ~ 90) 랜덤 생성
        int rndNum = (int)(Math.random() * 26);
        char ch = (char)(rndNum + 65);
        return Character.toString(ch);
    }

    public static void main(String[] args) {
        RndABCGenerator rndABCGenerator = new RndABCGenerator();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            set.add(rndABCGenerator.generateABC());
        }

        System.out.println(set);

    }


}
