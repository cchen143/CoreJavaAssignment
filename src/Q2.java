
public class Q2 {
	public static int fib(int n) {
		int prev = 0, curr = 1;
		while (n-- > 0) {
			System.out.print(prev + " ");
			int temp = curr;
			curr = prev + curr;
			prev = temp;
		}
		System.out.println("");
		return prev;
	}
}
