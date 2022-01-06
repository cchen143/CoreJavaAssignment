package questions;
import java.util.Comparator;

public class employeeComparator  implements Comparator<Employee> {
	 
    @Override
    public int compare(Employee e1, Employee e2) {

        int nameCompare = e1.getName().compareTo(e2.getName());

        int ageCompare = e1.getAge().compareTo(e2.getAge());
        
        int depCompare = e1.getDepartment().compareTo(e2.getDepartment());

        return (nameCompare == 0) ? (depCompare == 0)? ageCompare : depCompare : nameCompare;
    }
}

