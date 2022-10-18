package java_1018;

public class SquareStar extends RectangleStar {


    private int width;
    private int length;

    public SquareStar() {};

    public SquareStar(int side) {
        super(side, side);
    }

    public SquareStar(int width, int length) {
        super(width, length);
    }
}
