import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		Q1 q1 = new Q1();
		System.out.println(Arrays.toString(q1.bubbleSort(new int[] {1,0,5,6,3,2,3,7,9,8,4})));
		
		Q2 q2 = new Q2();
		q2.fib(25);
		
		Q3 q3 = new Q3();
		System.out.println(q3.reverse("reverse"));
		
		Q4 q4 = new Q4();
		System.out.println(q4.factorial(5));
		
		Q5 q5 = new Q5();
		System.out.println(q5.subString("reverse", 0));
		System.out.println(q5.subString("reverse", 2));
		System.out.println(q5.subString("reverse", 10));
	}

}
