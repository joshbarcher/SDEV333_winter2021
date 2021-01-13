package gardens;

public class Garden<T extends Plant>
{
    private T thing;

    public Garden(T thing)
    {
        this.thing = thing;
    }

    public T getThing()
    {
        return thing;
    }
}

