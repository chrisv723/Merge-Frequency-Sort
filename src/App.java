
import java.math.BigDecimal;
import java.util.Random;

public class App {


	public static void main(String[] args) {
		Random ran = new Random();

		int[] my = {ran.nextInt(1000), ran.nextInt(1000), ran.nextInt(1000), ran.nextInt(1000), ran.nextInt(1000), ran.nextInt(1000), ran.nextInt(1000),
				ran.nextInt(1000), ran.nextInt(1000), ran.nextInt(1000), ran.nextInt(1000),
				ran.nextInt(1000), ran.nextInt(1000)};
		


		System.out.println("\nOriginal Unsorted Array: ");
		for(int i : my) {
			System.out.println("\t" + i);
		}

		sort test = new sort();

		// HERE STARTS MERGE SORT

		long startTime = System.nanoTime();
		test.mergeSort(my);
		long duration = System.nanoTime() - startTime;
		float seconds = ((float)duration / (float)1000000000);

		System.out.println("\nArray After Merge Sort: with a total runtime of " + duration + "ns OR " + new BigDecimal(seconds + "") + "s\n");
		for(int i : my) {
			System.out.println("\t " + i);
		}
	}


}
