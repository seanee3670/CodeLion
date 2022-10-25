package java_1025;

import static java.util.Objects.hash;

public class HashTable {

    private int size = 10000;
    private int[] table = new int[size];

    public HashTable() {}

    public HashTable(int size) {
        this.size = size;
        this.table = new int[size];
    }

    public void insert(String key, Integer value) {
        int hashCode = hash(key);
        this.table[hashCode] = value;
        System.out.println(key + " " + hashCode + " 방에 저장이 완료되었습니다.");
    }

    public int search(String key) {
        return this.table[hash(key)];
    }


}
