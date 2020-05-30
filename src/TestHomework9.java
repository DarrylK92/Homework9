import java.util.Calendar;
import java.util.Date;

/**
 * Homework 9 - Creates an instance of the Person, Student, Employee, Faculty, and Staff classes and then prints the result of their corresponding overridden toString methods
 * 
 * CIS2571-001
 * @author Darryl Karney
 * @version 16Jul2018
 */

public class TestHomework9 {

	public static void main(String[] args) {
		//Create objects
		Person person = new Person("Jane Doe", "JDoe@gmail.com");
		Student student = new Student(Student.FRESHMAN, "John Smith", "JSmith@gmail.com");
		Calendar cal = Calendar.getInstance();
		cal.set(2018, 7, 16);
		Date hireDate = cal.getTime();
		Employee employee = new Employee(35165.0, hireDate, "Sam Brown", "SBrown@gmail.com");
		Faculty faculty = new Faculty(Faculty.RANKLIST[0], 23665.0, hireDate, "Jimmy Myo", "JMyo@gmail.com");
		Staff staff = new Staff(Staff.TITLELIST[0], 31564.0, hireDate, "Mike Rosen", "MRosen@gmail.com");
		
		//Print results
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());

	}

}
