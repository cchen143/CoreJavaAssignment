package questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q20 {
	public static void printData() {
		
		//print current working directory
		//System.out.println("Working Directory = " + System.getProperty("user.dir"));
		
		try {
		      File myObj = new File("./src/questions/Data.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String str = myReader.nextLine();
		        String[] temp = str.split(":");
		        System.out.println("Name: " + temp[0] + " " + temp[1]);
		        System.out.println("Age: " + temp[2] + " years");
		        System.out.println("State: " + temp[3] + " State\n");
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}
