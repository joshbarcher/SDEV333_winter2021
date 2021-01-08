package data_structures;

import interfaces.Collection;

import java.util.Iterator;

public class Bag implements Collection
{
    private Object[] data;

    //this is the index where the next element is added to the bag
    private int nextIndex = 0;

    public Bag(int capacity)
    {
        if (capacity <= 0)
        {
            throw new IllegalArgumentException("Capacity must be positive");
        }

        data = new Object[capacity];
    }

    @Override
    public boolean add(Object element)
    {
        //precondition (is the bag full?)
        if (nextIndex == data.length)
        {
            return false;
        }

        data[nextIndex++] = element;
        return true;
    }

    @Override
    public boolean contains(Object element)
    {
        for (int i = 0; i < nextIndex; i++)
        {
            if (data[i].equals(element))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size()
    {
        return nextIndex;
    }

    @Override
    public boolean isEmpty()
    {
        return nextIndex == 0;
    }

    @Override
    public void clear()
    {

    }

    @Override
    public boolean remove(Object element)
    {
        return false;
    }

    @Override
    public boolean addAll(Collection other)
    {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public boolean containsAll(Collection other)
    {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public boolean removeAll(Collection other)
    {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public boolean retainAll(Collection other)
    {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public int hashcode()
    {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public Iterator iterator()
    {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public Object[] toArray()
    {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
