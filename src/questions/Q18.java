package questions;

public class Q18 extends Q18P{
	public boolean hasUppercase(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) return true;
		}
		return false;
	}
	
	public String toUppercase(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 97 && ch[i] <= 122) ch[i] -= 32;
		}
		return new String(ch);
	}
	
	public void addTen(String str) {
		System.out.println(Integer.parseInt(str) + 10);
	}
}
