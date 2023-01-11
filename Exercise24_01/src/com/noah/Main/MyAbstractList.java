package com.noah.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class MyAbstractList<E> implements MyList<E> {
	protected int size = 0; // The size of the list

	/** Create a default list */
	protected MyAbstractList() {
	}

	/** Create a list from an array of objects */
	protected MyAbstractList(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			add(objects[i]);
	}

	/** Add a new element at the end of this list */
	public void add(E e) {
		add(size, e);
	}

	/** Return true if this list contains no elements */
	public boolean isEmpty() {
		return size == 0;
	}

	/** Return the number of elements in this list */
	public int size() {
		return size;
	}

	/** Remove the first occurrence of the element o from this list.
	 *  Shift any subsequent elements to the left.
	 *  Return true if the element is removed. */
	public boolean remove(E e) {
		if (indexOf(e) >= 0) {
			remove(indexOf(e));
			return true;
		}
		else 
			return false;
	}
	

	public boolean addAll(MyList<E> otherList) {
		int x = otherList.size();
		for(int i = 0; i < otherList.size(); i++) {
			add(size, otherList.get(i));
		}
		if(x < otherList.size()) {
			return true;
		} else {
			return false;
		}
	}
	

	public boolean removeAll(MyList<E> otherList) {
		boolean y = false;
		
		for(int i = 0; i < otherList.size(); i++) {
			if(indexOf(otherList.get(i)) >= 0) {
				remove(otherList.get(i));
				y = true;
			} else {
				y = false;
			}
		}
		
		return y;
	}
	@Override
	public boolean retainAll(MyList<E> otherList) {
		int x = otherList.size();
		boolean y = false;
		
		List<E> retained = new ArrayList<E>();
		
		for(int i = 0; i < otherList.size(); i++) {
			
			
			if(indexOf(otherList.get(i)) <= 0) {
				retained.add(get(i));
				
				y = true;
			} else {

				y = false;
			}
		}
		for(int j = 0; j < retained.size(); j++) {
			remove(retained.get(j));
		}
		//System.out.println(retained);
		return y;
	}
}