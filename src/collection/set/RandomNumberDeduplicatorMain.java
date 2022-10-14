package collection.set;

import java.util.Iterator;

public class RandomNumberDeduplicatorMain {
    public static void main(String[] args) {
        RandomNumberDeduplicator randomNumberDeduplicator = new RandomNumberDeduplicator();

        for (int i = 0; i < 50; i++) {
            randomNumberDeduplicator.add(randomNumberDeduplicator.generateNumber(i));
        }

        System.out.println(randomNumberDeduplicator);

//        Iterator<Integer> iterator = randomNumberDeduplicator.iterator();
//        while (iterator.hasNext()) {
//            System.out.println("iterator = " + iterator.next());
//        }
    }
}
