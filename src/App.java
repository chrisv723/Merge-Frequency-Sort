
import java.util.Random;

public class App {

	public static void main(String[] args) {
		Random ran = new Random();
		//int[] my = {6, 7, 5, 7, 7, 8, 7, 6, 9, 7, 4, 10,
				//6, 8, 8, 9, 5, 6, 4, 8}; 
		
		int[] my = {100, 67, 3, 2, 22,ran.nextInt(1000), ran.nextInt(1000),
				ran.nextInt(1000), ran.nextInt(1000), ran.nextInt(1000), ran.nextInt(1000),
				ran.nextInt(1000), ran.nextInt(1000)};
		
		System.out.println("\n");
		int a = 0;
		for(int i : my) {
			System.out.println(a + ": " + i);
			a++;
		}

		frequency test = new frequency();
		//test.frequencySort(my);
		test.mergeSort(my);

		System.out.println("\n");
		a = 0;
		for(int i : my) {
			System.out.println(a + ": " + i);
			a++;
		}


	}


}
