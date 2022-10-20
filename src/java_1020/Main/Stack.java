package java_1020.Main;

public class Stack {
    private int[] stack;
    private int ptr = -1;

    public Stack() {
        this.stack = new int[100];
    }

    public Stack(int size) {
        this.stack = new int[size];
    }

    public void push(int value) {
        this.stack[ptr] = value;
        ptr++;
    }

    public int[] getStack() {
        return stack;
    }

    public int getArrById(int idx) {
        return stack[idx];
    }

    public boolean isEmpty() {
        if (ptr == -1) {
            return true;
        }

        return false;
    }

    public Integer pop() {
        if (!isEmpty()) {
            return stack[ptr--];
        }
        return null;
    }




}
