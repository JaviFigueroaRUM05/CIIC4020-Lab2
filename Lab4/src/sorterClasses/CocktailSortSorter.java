package sorterClasses;

public class CocktailSortSorter<E> extends AbstractSorter<E>{

	private int leftBound = 0, rightBound = arr.length, direction = 1;
	
	public CocktailSortSorter() {
		super("Cocktail Sort");
	}

	@Override
	protected void auxSort() {
		while(rightBound - leftBound > 0) {
			for(int j = leftBound; j < rightBound; j++) {
				if (cmp.compare(arr[j], arr[j+1]) >	 0) {
					super.swapArrayElements(j, j+1);
				}
			}
			rightBound--;
			for(int j = rightBound-1; j > leftBound; j--) {
				if (cmp.compare(arr[j-1], arr[j]) >	 0) {
					super.swapArrayElements(j, j-1);
				}
			}
			leftBound++;
		}
	}
}
