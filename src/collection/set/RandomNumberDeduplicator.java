package collection.set;

import java_1005.RandomNumberCreator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RandomNumberDeduplicator extends RandomNumberCreator {

    private Set<Integer> set = new HashSet<>();

    public void add (int a) {
        this.set.add(a);
    }

    public Iterator iterator() {
        Iterator<Integer> iterator = set.iterator();
        return iterator();
    }

}
