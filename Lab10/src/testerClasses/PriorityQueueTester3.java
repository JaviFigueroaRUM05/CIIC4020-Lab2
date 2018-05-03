package testerClasses;

import java.util.Comparator;

import priorityQueue.UnsortedListPriorityQueue;
import priorityQueueInterfaces.PriorityQueue;

public class PriorityQueueTester3 {
	
	public class StringComparator1 implements Comparator<String> { 
	     public int compare(String s1, String s2) { 
	         return s2.compareTo(s1); 
	     } 
	}

	String[] arr = {"barrio", "pepe", "julia", "maria", "oliva", "meme", "parada", "baile", "enjendro", 
	         "vagabundo", "nota", "tienda", "zapato", "caballo", "cafe", "diodo", "multiplica"};

	
	PriorityQueue<String, String> pq;
	
	pq = new UnsortedListPriorityQueue<String, String>(new StringComparator1());    // 1
	//pq = new SortedListPriorityQueue<String, String>(new StringComparator1());    // 2
	//pq = new HeapListPriorityQueue<String, String>(new StringComparator1());      // 3
	//pq = new HeapPriorityQueue<String, String>(new StringComparator1());          // 4
	
	TesterUtils.displayArray("Content of the array before ", arr); 
	TesterUtils.what(arr, pq); 
	TesterUtils.displayArray("Content of the array after ", arr); 
}



