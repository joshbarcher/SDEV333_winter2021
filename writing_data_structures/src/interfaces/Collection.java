package interfaces;

import java.util.Iterator;

public interface Collection<T>
{
	//basic methods
	public boolean add(T element);
	public boolean remove(T element);
	public boolean contains(T element);
	public void clear();
	public int size();
	public boolean isEmpty();
	
	//set methods
	public boolean addAll(Collection<T> other);
	public boolean containsAll(Collection<T> other);
	public boolean removeAll(Collection<T> other);
	public boolean retainAll(Collection<T> other);
	
	//misc methods
	public boolean equals(Object other);
	public int hashcode();
	public Iterator iterator();
	public T[] toArray();
}

