package questions;
public class Q5 {
	public static String subString(String s, int idx) {
		if (idx >= s.length()) return s;
		if (idx <= 0) return "";
		char [] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < idx; i++) {
			sb.append(ch[i] + "");
		}
		return sb.toString();
	}
}
