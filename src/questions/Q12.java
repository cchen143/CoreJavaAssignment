package questions;

public class Q12 {
	public static int[] run() {
		int [] ary = new int [100];
		for (int i = 1; i <= 100; i++) {
			ary[i - 1] = i;
		}
		
		for (int num : ary) {
			if(isEven(num)) System.out.print(num + " ");
		}
		System.out.println("");
		return ary;
	}
	
	public static boolean isEven(int num) {
		return (num & 1) == 0;
	}
}
