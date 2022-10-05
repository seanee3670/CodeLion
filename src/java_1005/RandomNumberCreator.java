package java_1005;

public class RandomNumberCreator implements NumberCreator {
    @Override
    public int generateNumber(int a) {
        return (int)(Math.random() * a);
    }
}
