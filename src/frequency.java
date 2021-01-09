
public class frequency {

	public void frequencySort(int[] sort) {
		int len = sort.length;
		int maxVal = sort[0];
		for(int i = 1; i < len; i++) {
			if(sort[i] > maxVal) {
				maxVal = sort[i];
			}
		}
		System.out.println(len);
		System.out.println(maxVal);
		int[] tally = new int[maxVal + 1];
		for(int i = 0; i < len; i++) {

			tally[sort[i]]++;
			//for(int j = 0)
		}
		System.out.println("frequency table");
		int a = 0;
		for(int i : tally) {
			System.out.println(a + ": " + i);
			a++;
		}
		for(int i = 0; i < tally.length; i++) {
			if(tally[i] != 0) {
				sort[tally[i] - 1] = tally[i];
			}
			//sort[tally[i]]
		}


	}

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
