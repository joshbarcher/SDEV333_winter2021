package tables;

/**
 * This is a hash table using linear probing
 *
 * @author Josh Archer
 * @version 1.0
 */
public class HashTable<T>
{
    private Element[] table;
    private int size;

    /**
     * Create a table with an initial (default) size.
     */
    public HashTable()
    {
        table = (Element[]) new Object[10];
    }

    /**
     * Create a table with an initial size.
     *
     * @param size the starting size (must be positive)
     */
    public HashTable(int size)
    {
        table = (Element[]) new Object[size];
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
        if (loadFactor >= 0.6)
        {
            resize();
        }

        //find where the element "should" be
        int hashCode = Math.abs(element.hashCode());
        int index = hashCode % table.length;

        //find a spot for the element, if not already present
        while (table[index] != null)
        {

        }

        //assign the empty spot
        table[index] = new Element(element, false);
        size++;
        return true; //I found a spot for the element
    }

    private void resize()
    {
        //TODO write this later
    }

    /**
     * Determines if an element is in the table.
     *
     * @param element the element to search for
     * @return true if found, otherwise false
     */
    public boolean contains(T element)
    {
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
        return false;
    }

    /**
     * An inner class to store elements in the table.
     * These may have been previously removed...
     *
     * @author Josh Archer
     * @version 1.0
     */
    private class Element
    {
        private T data;
        private boolean removed;

        public Element(T data, boolean removed)
        {
            this.data = data;
            this.removed = removed;
        }
    }
}
