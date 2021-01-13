package example;

public class Bag<T>
{
    private T[] field;

    public void foo()
    {
        field = (T[]) new Object[10];
    }
}
