package questions;
public class Q1 {
	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
