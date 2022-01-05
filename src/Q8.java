import java.util.*;

public class Q8 {
	
	public static void create(List<String> list, List<String> palindromes) {
		String[] source = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john",  "refer", "billy", "did"};
		Collections.addAll(list, source);
		for (String s : list) {
			if (isPalindrome(s)) {
				palindromes.add(s);
			}
		}
	}
	
	public static boolean isPalindrome(String str) {
		char[] chAry = str.toCharArray();
		int lo = 0, hi = str.length() - 1;
		while (lo < hi) {
			if (chAry[lo++] != chAry[hi--]) return false;
		}
		return true;
	}

}
