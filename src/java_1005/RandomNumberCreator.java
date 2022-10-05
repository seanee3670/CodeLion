package java_1005;

public class RandomNumberCreator implements NumberCreator {
    @Override
    public int generateRandomNumber() {
        return (int)(Math.random() * 10);
    }
}
