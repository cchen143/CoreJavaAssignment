package questions;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		
		//Q1
		System.out.println(Arrays.toString(Q1.bubbleSort(new int[] {1,0,5,6,3,2,3,7,9,8,4})));
		
		//Q2
		Q2.fib(25);
		
		//Q3
		System.out.println(Q3.reverse("reverse"));
		
		//Q4
		System.out.println(Q4.factorial(5));
		
		//Q5
		System.out.println(Q5.subString("reverse", 0));
		System.out.println(Q5.subString("reverse", 2));
		System.out.println(Q5.subString("reverse", 10));
		
		//Q6
		for (int i = -3; i < 3; i++) {
			System.out.println(i + ": " + Q6.isEven(i));
		}
		
		List<Integer> nums = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		for (int i = 1; i < 101; i++) {
			nums.add(i);
			temp.add(i);
		}
		
		//Q7
		
		List<Employee> el = new ArrayList<>();
		 
        Employee e1 = new Employee("abc", "A", 27);
        Employee e3 = new Employee("abc", "B", 27);
        Employee e6 = new Employee("abc", "B", 29);
        Employee e2 = new Employee("bc", "A", 27);
        Employee e5 = new Employee("bc", "A", 29);
        Employee e4 = new Employee("bc", "C", 22);
        
        el.add(e1);
        el.add(e2);
        el.add(e3);
        el.add(e4);
        el.add(e5);
        el.add(e6);
 
        for (Employee e : el) {
            System.out.println(e);
        }
 
        Collections.sort(el, new employeeComparator());
        System.out.println("After sorting:\n");
 
        for (Employee e : el) {
            System.out.println(e);
        }
		
		//Q8
		
		List<String> strings = new ArrayList<>();
		List<String> palindromes = new ArrayList<>();
		
		Q8.create(strings, palindromes);
		System.out.println(Arrays.toString(strings.toArray(new String[strings.size()])));
		System.out.println(Arrays.toString(palindromes.toArray(new String[palindromes.size()])));
		
		//Q9
		System.out.println(Arrays.toString(Q9.findPrimes(temp).toArray(new Integer [temp.size()])));
		
		//Q10
		System.out.println("Minimun of " + -2 + " and " + 3 + " : " + Q10.min(-2, 3));
		
	}

}
