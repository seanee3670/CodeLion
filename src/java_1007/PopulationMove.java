package java_1007;

public class PopulationMove {
    private int fromSido; // 시 와 도
    private int toSido;

    // constructor 추가 fromSido, toSido 를 받아서 멤버변수에 넣는 기능


    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }


}
