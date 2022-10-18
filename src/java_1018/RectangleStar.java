package java_1018;

public class RectangleStar {
    private int width;
    private int length;

    public RectangleStar() {};

    public RectangleStar(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
