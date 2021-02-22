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
    private Node add(Node current, T element)
    {
        //if we encounter an spot for the element, then add it
        if (current == null)
        {
            size++;
            modCount++; //a change was made...
            return new Node(element);
        }

        //traverse down the tree
        int comparison = current.data.compareTo(element);
        if (comparison < 0) //go to the right!
        {
            current.right = add(current.right, element);
        }
        else if (comparison > 0) //go to the left
        {
            current.left = add(current.left, element);
        }
        return current;
    }

    @Override
    public boolean contains(T element)
    {
        return contains(root, element);
    }

    private boolean contains(Node current, T element)
    {
        if (current == null)
        {
            //didn't find it!
            return false;
        }

        //otherwise search for it!
        int comparison = current.data.compareTo(element);
        if (comparison == 0)
        {
            return true;
        }
        else if (comparison < 0) //look to the right
        {
            return contains(current.right, element);
        }
        else //if (comparison > 0)
        {
            return contains(current.left, element);
        }
    }

    @Override
    public boolean remove(T element)
    {
        return false;
    }

    @Override
    public T min()
    {
        //if there is no minimum...
        if (root == null)
        {
            return null;
        }

        return min(root);
    }

    private T min(Node current)
    {
        if (current.left == null)
        {
            return current.data;
        }
        //if this is not the smallest, move left!
        return min(current.left);
    }

    @Override
    public T max()
    {
        //if there is no minimum...
        if (root == null)
        {
            return null;
        }

        return max(root);
    }

    private T max(Node current)
    {
        if (current.right == null)
        {
            return current.data;
        }
        //if this is not the largest, move right!
        return max(current.right);
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








