package java_1025;

public class HashFunction2 {
    public int hash(String key) {
        int asciiSum = 0;

        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            int ascii = c;
            System.out.printf("%s %d\n", c, ascii);
            asciiSum += ascii;
        }
        System.out.println("asciiSm = " + asciiSum);
        return 0;
    }

    public static void main(String[] args) {
        HashFunction2 hf = new HashFunction2();
        hf.hash("seeyun");
    }
}
