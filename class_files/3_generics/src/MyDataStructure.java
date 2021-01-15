public class MyDataStructure<T extends Comparable<T>>
{
    public void foo()
    {
        T[] array = (T[]) new Comparable[10];
    }

    private class Node
    {
        private T data;
        private Node next;
    }
}
