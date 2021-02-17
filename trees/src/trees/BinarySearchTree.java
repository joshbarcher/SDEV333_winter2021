package trees;

import java.util.Iterator;

public class BinarySearchTree<T extends Comparable<T>> implements ISearchTree<T>
{
    private Node root;
    private int size;
    private int modCount; //this is for the iterator...

    @Override
    public boolean add(T element)
    {
        //is the tree empty?
        if (root == null)
        {
            root = new Node(element);
            size++;
            modCount++; //a change was made...
            return true;
        }
        else //move down the tree and place the new element
        {
            //start my search at the root
            root = add(root, element);
            return true;
        }
    }

    //this recursive method will add a new Node object recursively
    public Node add(Node current, T element)
    {
        int comparison = current.data.compareTo(element);
        if (comparison == 0) //duplicate!
        {
            return current; //no change...
        }
        else if (comparison < 0) //go to the right!
        {

        }
        else //if (comparison > 0) //go to the left
        {

        }

        return null;
    }

    @Override
    public boolean contains(T element)
    {
        return false;
    }

    @Override
    public int size()
    {
        return 0;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
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
    public T min()
    {
        return null;
    }

    @Override
    public T max()
    {
        return null;
    }

    @Override
    public T getRoot()
    {
        return null;
    }

    @Override
    public int treeHeight()
    {
        return 0;
    }

    @Override
    public Iterator<T> iterator()
    {
        return null;
    }

    //inner classes...
    public class Node
    {
        private T data;
        private Node left;
        private Node right;

        public Node(T data)
        {
            this.data = data;
        }

        public Node(T data, Node left, Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}








