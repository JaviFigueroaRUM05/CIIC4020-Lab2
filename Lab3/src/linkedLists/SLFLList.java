package linkedLists;
/**
 * Singly linked list with references to its first and its
 * last node. 
 * 
 * @author pirvos
 *
 */

import java.util.NoSuchElementException;

import linkedLists.LinkedList;
import linkedLists.AbstractDLList.DNode;

public class SLFLList<E> extends SLList<E>
{
	private SNode<E> first, last;   // reference to the first node and to the last node
	int length; 
	
	public SLFLList() {       // to create an empty list instance
		first = last = null; 
		length = 0; 
	}
	
	
	public void addFirstNode(Node<E> nuevo) {
		super.addFirstNode(nuevo);
	}

	public void addNodeAfter(Node<E> target, Node<E> nuevo) {
		super.addNodeAfter(target, nuevo);
	}

	public void addNodeBefore(Node<E> target, Node<E> nuevo) {
		super.addNodeBefore(target, nuevo);
	}

	public Node<E> getFirstNode() throws NoSuchElementException {
		return super.getFirstNode();
	}

	public Node<E> getLastNode() throws NoSuchElementException {
		if (first == null) { throw new NoSuchElementException("getLastNode() : linked list is empty..."); }
		return last;
	}

	public Node<E> getNodeAfter(Node<E> target) throws NoSuchElementException {
		return super.getNodeAfter(target);
	}

	public Node<E> getNodeBefore(Node<E> target)
			throws NoSuchElementException {
		return super.getNodeBefore(target);
	}

	public int length() {
		return length;
	}

	public void removeNode(Node<E> target) {
		super.removeNode(target);
	}
	
	public Node<E> createNewNode() {
		return new SNode<E>();
	}
	public Object[] toArray() {
		Object[] arr = new Object[length];
		SNode<E> target = (SNode<E>) getNodeAfter(first); 
		for(int i = 0; i < length; i++) {
			arr[i] = target.getElement();
			target = (SNode<E>) getNodeAfter(target);
		}
		return arr;
	}

}
