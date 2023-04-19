package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ARRAY_SIZE = 12;
    public static final int DEFAULT_NEGATIVE_VALUE = -1;
    private final int[] NUMBERS = new int[ARRAY_SIZE];

    public int total = DEFAULT_NEGATIVE_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_NEGATIVE_VALUE;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_NEGATIVE_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_NEGATIVE_VALUE;
        return NUMBERS[total--];
    }

}
