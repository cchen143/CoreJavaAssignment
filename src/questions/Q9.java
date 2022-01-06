package questions;
import java.util.*;

public class Q9 {
	public static List<Integer> findPrimes(List<Integer> nums) {
		nums.remove(0);
		int curr = 0;
		while (curr < nums.size()) {
			int i = nums.size() - 1, temp = nums.get(curr);
			while (i > curr) {
				if (nums.get(i) % temp == 0) nums.remove(i);
				i--;
			}
			curr++;
		}
		
		return nums;
	}
}
