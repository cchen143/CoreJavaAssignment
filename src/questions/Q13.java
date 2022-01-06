package questions;

public class Q13 {
	public static void print() {
		int num = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < i; j++) {
				num = 1 - num;
				System.out.print(num + " ");
			}
			System.out.println("");
		}
	}
}
