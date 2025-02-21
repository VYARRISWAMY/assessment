package assessment;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7 };
		shuffleArray(arr1);
	}

	public static void shuffleArray(int[] arr) {
		// it will iterate the length of the array
		for (int i = 0; i < arr.length; i++) {
			// it will generate one random number from 0 to length of the array - 1  
			int rand = new Random().nextInt(arr.length - 1); // 8-1 =7 5
			// it will swap the value according to index value of i and rand i.e generate number
			int temp = arr[i];   // 1
			arr[i] = arr[rand]; // 6 
			arr[rand] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
