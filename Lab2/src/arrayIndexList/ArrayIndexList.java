package arrayIndexList;

import java.lang.reflect.Array;

import indexList.IndexList;

public class ArrayIndexList<E> implements IndexList<E> {
	private static final int INITCAP = 1; 
	private static final int CAPTOAR = 1; 
	private static final int MAXEMPTYPOS = 2; 
	private E[] element; 
	private int size; 

	public ArrayIndexList() { 
		element = (E[]) new Object[INITCAP]; 
		size = 0; 
	} 
	

	public void add(int index, E e) throws IndexOutOfBoundsException {
		// ADD CODE AS REQUESTED BY EXERCISES
		if(!(index >= 0 && index <= size)) { throw new IndexOutOfBoundsException(); }
		if(size == element.length) { this.changeCapacity(CAPTOAR); }
		this.moveDataOnePositionTR(index, size);
		element[index] = e;
		this.size++;
	}


	public void add(E e) {
		// ADD CODE AS REQUESTED BY EXERCISES
		if(size == element.length) { this.changeCapacity(CAPTOAR); }
		element[size] = e;
		this.size++;
	}


	public E get(int index) throws IndexOutOfBoundsException {
		// ADD AND MODIGY CODE AS REQUESTED BY EXERCISES
		if(!(index >= 0 && index <= size)) { throw new IndexOutOfBoundsException(); }
		return element[index]; 
	}


	public boolean isEmpty() {
		return size == 0;
	}


	public E remove(int index) throws IndexOutOfBoundsException {
		// ADD AND MODIFY CODE AS REQUESTED BY EXERCISES
		if(!(index >= 0 && index <= size)) { throw new IndexOutOfBoundsException(); }
		this.moveDataOnePositionTL(index, size);
		this.size--;
		return null;
	}


	public E set(int index, E e) throws IndexOutOfBoundsException {
		// ADD AND MODIFY CODE AS REQUESTED BY EXERCISES
		if(!(index >= 0 && index <= size)) { throw new IndexOutOfBoundsException(); }
		element[index] = e;
		return null;
	}


	public int size() {
		return size;
	}	
	
	public int capacity() {
		return element.length;
		
	}
	
	// private methods  -- YOU CAN NOT MODIFY ANY OF THE FOLLOWING
	// ... ANALYZE AND USE WHEN NEEDED
	
	// you should be able to decide when and how to use
	// following method.... BUT NEED TO USE THEM WHENEVER
	// NEEDED ---- THIS WILL BE TAKEN INTO CONSIDERATION WHEN GRADING
	
	private void changeCapacity(int change) { 
		int newCapacity = element.length + change; 
		E[] newElement = (E[]) new Object[newCapacity]; 
		for (int i=0; i<size; i++) { 
			newElement[i] = element[i]; 
			element[i] = null; 
		} 
		element = newElement; 
	}
	
	// useful when adding a new element with the add
	// with two parameters....
	private void moveDataOnePositionTR(int low, int sup) { 
		// pre: 0 <= low <= sup < (element.length - 1)
		for (int pos = sup; pos >= low; pos--)
			element[pos+1] = element[pos]; 
	}

	// useful when removing an element from the list...
	private void moveDataOnePositionTL(int low, int sup) { 
		// pre: 0 < low <= sup <= (element.length - 1)
		for (int pos = low; pos <= sup; pos++)
			element[pos-1] = element[pos]; 
	}


	// The following two methods are to be implemented as part of an exercise
	public Object[] toArray() {
		Object[] arr = new Object[size];
		for(int i = 0; i < size; i++) {
			arr[i] = this.element[i];
		}
		return arr;
	}


	@Override
	public <T1> T1[] toArray(T1[] array) {
		if(array.length < size) {
			Array.newInstance(array.getClass().getComponentType(), size);
		}
		else if(array.length > size) {
			for(int i = size; i < array.length; i++) {
				array[i] = null;
			}
		}
		for(int j = 0; j < array.length; j++) {
			array[j] = (T1) this.element[j];
		}
		return array;
	}

}
