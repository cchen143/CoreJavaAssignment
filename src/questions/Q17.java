package questions;
import java.util.*;

public class Q17 {
	public static void simpleInterest(Scanner sc) {
		System.out.println("Enter the amount of principle: ");
		double principle = sc.nextDouble();
		System.out.println("Enter the interest rate(percentage): ");
		double rate = sc.nextDouble() / 100;
		System.out.println("Enter the peiod(year): ");
		double time = sc.nextDouble();
		System.out.println("The total amount is " + (principle * (1 + rate * time)));
	}
}
