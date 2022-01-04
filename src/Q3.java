
public class Q3 {
	public static String reverse(String s) {
		char[] ch = s.toCharArray();
		int start = 0, end = ch.length - 1;
		
		while (start < end) {
			char temp = ch[start];
			ch[start++] = ch[end];
			ch[end--] = temp;
		}
		
		return new String(ch);
	}
}
