package data_structures;

import interfaces.Collection;

import java.util.Iterator;

public class Bag<T> implements Collection<T>, Iterable<T>
{
    private T[] data;

    //this is the index where the next element is added to the bag
    private int nextIndex = 0;

    public Bag(int capacity)
    {
        if (capacity <= 0)
        {
            throw new IllegalArgumentException("Capacity must be positive");
        }

        data = (T[]) new Object[10];
    }

    @Override
    public boolean add(T element)
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
    public boolean contains(T element)
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
    public boolean remove(T element)
    {
        return false;
    }

    @Override
    public Iterator<T> iterator()
    {
        return new BagIterator();
    }

    @Override
    public boolean addAll(Collection<T> other)
    {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public boolean containsAll(Collection<T> other)
    {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public boolean removeAll(Collection<T> other)
    {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public boolean retainAll(Collection<T> other)
    {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public int hashcode()
    {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public T[] toArray()
    {
        throw new UnsupportedOperationException("Operation not supported");
    }

    private class BagIterator implements Iterator<T>
    {
        //this is the index of the next element to return from the iterator!
        private int current;

        public BagIterator()
        {
            current = 0;
        }

        @Override
        public boolean hasNext()
        {
            //return true if the element at index "current" is not null
            return data[current] != null;
        }

        @Override
        public T next()
        {
            //return the next element in the iteration and prepare for
            //the element after that one
            T result = data[current];
            current++;
            return result;
        }
    }
}











