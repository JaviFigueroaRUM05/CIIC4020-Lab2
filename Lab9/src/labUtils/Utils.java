package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		Position<Integer> root = t.addRoot(4);
		Position<Integer> parent1 = t.addChild(root, 9);
		t.addChild(parent1, 7);
		t.addChild(parent1, 10);
		Position<Integer> parent2 = t.addChild(root, 20);
		Position<Integer> parent3 = t.addChild(parent2, 15);
		t.addChild(parent3, 12);
		Position<Integer> parent4 = t.addChild(parent3, 17);
		t.addChild(parent4, 19);
		Position<Integer> parent5 = t.addChild(parent2, 21);
		Position<Integer> parent6 = t.addChild(parent5, 40);
		t.addChild(parent6, 30);
		t.addChild(parent6, 45);
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		Position<Integer> root = t.addRoot(4);
		Position<Integer> parent1 = t.addLeft(root, 9);
		t.addLeft(parent1, 7);
		t.addRight(parent1, 10);
		Position<Integer> parent2 = t.addRight(root, 20);
		Position<Integer> parent3 = t.addLeft(parent2, 15);
		t.addLeft(parent3, 12);
		Position<Integer> parent4 = t.addRight(parent3, 17);
		t.addLeft(parent4, 19);
		Position<Integer> parent5 = t.addRight(parent2, 21);
		Position<Integer> parent6 = t.addRight(parent5, 40);
		t.addLeft(parent6, 30);
		t.addRight(parent6, 45);
		
		return t; 
	}


}
