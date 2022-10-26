package java_1026;

import java.util.HashSet;

public class Ponkemon {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int e : nums) {
            set.add(e);
        }

        // int setSize = set.size();
        // int numLen = nums.length;

        return set.size() > (nums.length / 2) ? (nums.length / 2) : set.size();
    }
}
