package tables;

/**
 * This is a hash table using linear probing
 *
 * @author Josh Archer
 * @version 1.0
 */
public class HashTable<T>
{
    private static final int DEFAULT_TABLE_SIZE = 10;
    private static final double MAX_LOAD_FACTOR = 0.6;

    private Element[] table;
    private int size;

    /**
     * Create a table with an initial (default) size.
     */
    public HashTable()
    {
        table = new Element[DEFAULT_TABLE_SIZE];
    }

    /**
     * Create a table with an initial size.
     *
     * @param size the starting size (must be positive)
     */
    public HashTable(int size)
    {
        table = new Element[size];
    }

    /**
     * Adds an element to the table, if not already present.
     *
     * @param element the new element
     * @return true if added, otherwise false
     */
    public boolean add(T element)
    {
        //if we have exceeded our load factor, resize...
        double loadFactor = (double)size / table.length;
        if (loadFactor >= MAX_LOAD_FACTOR)
        {
            resize();
        }

        //find where the element "should" be
        int hashCode = Math.abs(element.hashCode());
        int index = hashCode % table.length;

        //find a spot for the element, if not already present
        while (table[index] != null)
        {
            if (table[index].data.equals(element)) //current element is a duplicate
            {
                return false;
            }

            //move to the next index in the table
            index = (index + 1) % table.length;
        }

        //assign the empty spot
        table[index] = new Element(element, false);
        size++;
        return true; //I found a spot for the element
    }

    private void resize()
    {
        //save the old table, make a new table, double the size
        Element[] oldTable = table;
        table = new Element[oldTable.length * 2];

        //set size to zero, the calls to add() below will move size back to the original value
        size = 0;

        //loop over elements in the old table, and if not removed, rehash them
        for (int i = 0; i < oldTable.length; i++)
        {
            if (oldTable[i] != null && !oldTable[i].previouslyRemoved)
            {
                add((T)oldTable[i].data);
            }
        }
    }

    /**
     * Determines if an element is in the table.
     *
     * @param element the element to search for
     * @return true if found, otherwise false
     */
    public boolean contains(T element)
    {
        //1: get a hash code and index
        int hashCode = Math.abs(element.hashCode());
        int index = hashCode % table.length;

        //2: start looping at the provided index (null means the element is not found, otherwise use equals())
        while (table[index] != null)
        {
            if (table[index].data.equals(element) && !table[index].previouslyRemoved)
            {
                return true;
            }

            //move to the next index in the table
            index = (index + 1) % table.length;
        }
        return false;
    }

    /**
     * Removes an element in the table, if found.
     *
     * @param element the element to search for
     * @return true if found and removed, otherwise false
     */
    public boolean remove(T element)
    {
        //1: get a hash code and index
        int hashCode = Math.abs(element.hashCode());
        int index = hashCode % table.length;

        //2: start looping at the provided index (null means the element is not found, otherwise use equals())
        while (table[index] != null)
        {
            if (table[index].data.equals(element) && !table[index].previouslyRemoved)
            {
                //3: if we found the element, mark as removed
                table[index].previouslyRemoved = true;
                size--;
                return true;
            }

            //move to the next index in the table
            index = (index + 1) % table.length;
        }
        return false;
    }

    public int size()
    {
        return size;
    }

    /**
     * An inner class to store elements in the table.
     * These may have been previously removed...
     *
     * @author Josh Archer
     * @version 1.0
     */
    private class Element<T>
    {
        private T data;
        private boolean previouslyRemoved;

        public Element(T data, boolean previouslyRemoved)
        {
            this.data = data;
            this.previouslyRemoved = previouslyRemoved;
        }

        @Override
        public String toString()
        {
            return data + (previouslyRemoved ? ", removed!" : "");
        }
    }
}
