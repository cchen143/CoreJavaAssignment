import java.util.*;

public class Employee {
		 
	    String name;
	    String department;
	    int age;
	 
	    // Parameterized constructor
	    public Employee(String Name, String department, Integer Age)
	    {
	        this.name = Name;
	        this.department = department;
	        this.age = Age;
	    }
	 
	    // Getter setter methods
	    public String getName() { return name; }
	 
	    public void setName(String name) { this.name = name; }
	    
	    public String getDepartment() { return department; }
		 
	    public void setDepartment(String department) { this.department = department; }
	 
	    public Integer getAge() { return age; }
	 
	    public void setAge(Integer age) { this.age = age; }
	 
	    @Override 
	    public String toString()
	    {
	        return "Employee{" + "Name=" + name + ", Department=" + department + ", Age=" + age + '}';
	    }
	
}
