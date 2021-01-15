package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tetrad<T extends Comparable<T>> extends Triad<T>
{
    private T fourth;

    public Tetrad(T first, T second, T third, T fourth)
    {
        super(first, second, third);
        this.fourth = fourth;
    }

    public T getFourth()
    {
        return fourth;
    }

    @Override
    public List<T> sort()
    {
        List<T> sorted = new ArrayList<>(List.of(getFirst(), getSecond(), getThird(), fourth));
        Collections.sort(sorted);
        return sorted;
    }

    @Override
    public String toString()
    {
        return "(" + getFirst() + ", " + getSecond() + ", " + getThird() + ", " + fourth + ")";
    }
}
