package questions;
import java.util.*;

public class Driver {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Q1
		System.out.println("\nQ1:\n");
		System.out.println(Arrays.toString(Q1.bubbleSort(new int[] {1,0,5,6,3,2,3,7,9,8,4})));
		
		//Q2
		System.out.println("\nQ2:\n");
		Q2.fib(25);
		
		//Q3
		System.out.println("\nQ3:\n");
		System.out.println(Q3.reverse("reverse"));
		
		//Q4
		System.out.println("\nQ4:\n");
		System.out.println(Q4.factorial(5));
		
		//Q5
		System.out.println("\nQ5:\n");
		System.out.println(Q5.subString("reverse", 0));
		System.out.println(Q5.subString("reverse", 2));
		System.out.println(Q5.subString("reverse", 10));
		
		//Q6
		System.out.println("\nQ6:\n");
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
		System.out.println("\nQ7:\n");
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
        System.out.println("\nQ8:\n");
		List<String> strings = new ArrayList<>();
		List<String> palindromes = new ArrayList<>();
		
		Q8.create(strings, palindromes);
		System.out.println(Arrays.toString(strings.toArray(new String[strings.size()])));
		System.out.println(Arrays.toString(palindromes.toArray(new String[palindromes.size()])));
		
		//Q9
		System.out.println("\nQ9:\n");
		//list.toString()
		System.out.println(Q9.findPrimes(temp));
		
		//Q10
		System.out.println("\nQ10:\n");
		System.out.println("Minimun of " + -2 + " and " + 3 + " : " + Q10.min(-2, 3));
		
		//Q11
		System.out.println("\nQ11:\n");
		Q11.run();
		
		//Q12
		System.out.println("\nQ12:\n");
		System.out.println(Arrays.toString(Q12.run()));
		
		//Q13
		System.out.println("\nQ13:\n");
		Q13.print();
		
		//Q14
		System.out.println("\nQ14:\n");
		Q14.run(sc);
		
		//Q15
		System.out.println("\nQ15:\n");
		Q15 q15 = new Q15();
		int x = 5 ,y = 4;
		System.out.println("x = " + x + ", y = " + y + "\n");
		System.out.println("x  +  y = " + q15.addition(x, y));
		System.out.println("x  -  y = " + q15.subtraction(x, y));
		System.out.println("x  *  y = " + q15.multiplication(x, y));
		System.out.println("x  /  y = " + q15.division(x, y));
		
		//Q16
		System.out.println("\nQ16:\n");
		if (args.length != 1) System.out.println(("Wrong input."));
		else System.out.println(Q16.lengthOfString(args[0]));
		
		//Q17
		System.out.println("\nQ17:\n");
		Q17.simpleInterest(sc);
		
		//Q18
		System.out.println("\nQ18:\n");
		Q18 q18 = new Q18();
		System.out.println(q18.hasUppercase("babsjaGma"));
		System.out.println(q18.toUppercase("babsjaGma"));
		q18.addTen("20");
		
		//Q19
		System.out.println("\nQ19:\n");
		Q19.run();
		
		//Q20
		System.out.println("\nQ20:\n");
		Q20.printData();
		
		sc.close();
		
		
		
		}

}
