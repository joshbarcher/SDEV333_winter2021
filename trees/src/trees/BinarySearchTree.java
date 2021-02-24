package trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
            int savedSize = size;
            root = add(root, element);
            if (savedSize != size)
            {
                modCount++;
                return true;
            }
            return false;
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
        //tree empty?
        if (root == null)
        {
            return false;
        }

        //start our search at the root
        int savedSize = size;
        root = remove(root, element);
        if (savedSize != size)
        {
            modCount++;
            return true;
        }
        return false;
    }

    //move down the tree and remove the element if found...
    private Node remove(Node current, T element)
    {
        //if we reach a leaf in the tree
        if (current == null)
        {
            return null; //not found!
        }

        //search for the element
        int comparison = current.data.compareTo(element);
        if (comparison == 0) //we found it!
        {
            //no children
            if (current.left == null && current.right == null)
            {
                size--;
                return null;
            }
            //two children (yikes!)
            else if (current.left != null && current.right != null)
            {
                //find the maximum in the left subtree
                T max = max(current.left);

                //replace the data in the current node
                current.data = max;

                //remove the node containing the maximum in the left subtree
                current.left = remove(current.left, max);
                //size--; //don't need this, it will happen in the recursive remove()
            }
            //one child (left)
            else if (current.left != null)
            {
                size--;
                return current.left;
            }
            //one child (right)
            else //if (current.right != null)
            {
                size--;
                return current.right;
            }
        }
        else if (comparison < 0) //go to the right reference
        {
            current.right = remove(current.right, element);
        }
        else //if (comparison > 0) //go to the left reference
        {
            current.left = remove(current.left, element);
        }
        return current;
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
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }

    @Override
    public void clear()
    {
        root = null;
        size = 0;
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

    //traversal order LNR
    public List<T> inOrder()
    {
        List<T> traversal = new ArrayList<>();
        inOrder(root, traversal);
        return traversal;
    }

    private void inOrder(Node current, List<T> traversal)
    {
        if (current == null)
        {
            return; //exit!
        }

        //left, node, right
        inOrder(current.left, traversal);   //L
        traversal.add(current.data);        //N
        inOrder(current.right, traversal);  //R
    }

    public List<T> preOrder()
    {
        List<T> traversal = new ArrayList<>();
        inOrder(root, traversal);
        return traversal;
    }

    private void preOrder(Node current, List<T> traversal)
    {
        if (current == null)
        {
            return; //exit!
        }

        //left, node, right
        traversal.add(current.data);        //N
        inOrder(current.left, traversal);   //L
        inOrder(current.right, traversal);  //R
    }

    public List<T> postOrder()
    {
        return null;
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








