package sorterClasses;

public class CombSortSorter<E> extends AbstractSorter<E>{
	
	private double gap = (arr.length/1.3);
	
	public CombSortSorter() {
		super("Comb Sort");
	}

	@Override
	protected void auxSort() {
		while(gap > 0) {
			for (int j=0; (int)(j+gap)-1< arr.length; j++) {
				if (cmp.compare(arr[j], arr[(int)(j + gap) - 1]) >	 0) {
					super.swapArrayElements(j, j+1);
				}
			}
			gap -= 1.3;
		}
		
	}

}
