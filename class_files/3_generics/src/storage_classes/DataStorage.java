package storage_classes;

//declare a single generic type "T"
public class DataStorage<T>
{
    private T data;

    public DataStorage(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return data;
    }
}