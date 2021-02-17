package trees;

public interface ISearchTree<T extends Comparable<T>> extends Iterable<T>
{
    //base methods
    boolean add(T element);
    boolean contains(T element);
    int size();
    boolean isEmpty();
    void clear();
    boolean remove(T element);

    //fun methods
    T min();
    T max();
    T getRoot();
    int treeHeight(); //is it balanced?

    //traversals?
}
