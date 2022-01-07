package questions;

import java.util.*;

public class Q19 {
	public static void run() {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		int sumEven = 0, sumOdd = 0;
		for (int num : list) {
			if ((num & 1) == 0) sumEven += num;
			else sumOdd += num;
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
		
		int i = 0;
		while (i != list.size()) {
			if (isPrime(list.get(i))) list.remove(i);
			else i++;
		}
		
		System.out.println(list); //list.toString()
	}
	
	public static boolean isPrime(int num) {
		if (num == 1) return false;
		if (num == 2) return true;
		for (int i = 2; i < Math.sqrt(num) + 1; i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
	
		
}
