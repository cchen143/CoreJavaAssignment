import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(Q1.bubbleSort(new int[] {1,0,5,6,3,2,3,7,9,8,4})));
		
		Q2.fib(25);
		
		System.out.println(Q3.reverse("reverse"));
		
		System.out.println(Q4.factorial(5));
		
		System.out.println(Q5.subString("reverse", 0));
		System.out.println(Q5.subString("reverse", 2));
		System.out.println(Q5.subString("reverse", 10));
		
		for (int i = -3; i < 3; i++) {
			System.out.println(i + ": " + Q6.isEven(i));
		}
		
		System.out.println(Q10.min(-2, 3));
	}

}
