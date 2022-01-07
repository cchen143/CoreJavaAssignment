package questions;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q14 {
	public static void run(Scanner sc) {
		
		while(true) {
			System.out.println("Enter an option 1-3, q to quit: ");
			String s = sc.nextLine();
			if (s.equals("q")) break;
			switch (s) {
			case "1":
				System.out.println("square root of 4 is " + Math.sqrt(4) + "\n");
				break;
			case "2":
				
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
				LocalDateTime now = LocalDateTime.now();  
				System.out.println("Today is " + dtf.format(now) + "\n");
				break;
			case "3": 
				String message = "I am learning Core Java";
				System.out.println(message);
				String [] ary = message.split(" ");
				System.out.println(Arrays.toString(ary) + "\n");
				break;
			}
		}
	}
}
