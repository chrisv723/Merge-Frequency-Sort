
/**
 * Integer sorting class implementing merge sort algorithm
 * @author Christopher Valerio
 */
public class sort {

	/**
	 * 
	 * implements a divide and conquer sorting algorithm. 
	 * given unsorted array is split into a sub list, each containing one element
	 * these divided sub list are repeatedly merged until only one sub list is produced.
	 * containing all elements in a sorted fashion
	 * 
	 * @param array - unsorted array of random integer numbers to be sorted via merge sort
	 */
	public void mergeSort(int[] array) {
		int len = array.length;
		if(len < 2)
			return;

		int mid = len / 2;
		int[] tempLArray = new int[mid];
		int[] tempRArray = new int[len - mid];
		int index = 0;
		for(int i = 0; i < mid; i++) {
			tempLArray[index] = array[i];
			index++;
		}
			

		index = 0;
		for(int i = mid; i < len; i++) {
			tempRArray[index] = array[i];
			index++;
		}
			

		mergeSort(tempLArray);
		mergeSort(tempRArray);

		merge(tempLArray, tempRArray, array);	
	}


	/**
	 * 
	 * merge method which takes two array sub lists
	 * and sorts them. to be later merged with the rest of array sub lists
	 * until entire unsorted array is sorted
	 * 
	 * @param lArray - newly created left sub list array
	 * @param rArray - newly created right sub list array
	 * @param tempArray - original unsorted array
	 */
	public void merge(int[] lArray, int[] rArray, int[] tempArray) {
		int lLen = lArray.length;
		int rLen = rArray.length;
		int li = 0; int ri = 0;
		
		int index = 0;

		while((li < lLen) && (ri < rLen)) {
			if(lArray[li] <= rArray[ri]){
				tempArray[index] = lArray[li];
				li++;
			}else {
				tempArray[index] = rArray[ri];
				ri++;
			}
			index++;
		}

		while(li < lLen) {
			tempArray[index] = lArray[li];
			li++;
			index++;
		}

		while(ri < rLen) {
			tempArray[index] = rArray[ri];
			ri++;
			index++;
		}
	}

}
