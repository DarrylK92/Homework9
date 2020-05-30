import java.util.Date;

public class Employee extends Person{
	private double salary;
	private Date hireDate = new Date();
	
	//Constructor
	public Employee(double salary, Date hireDate, String name, String email) {
		super(name, email);
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the hireDate
	 */
	public Date getHireDate() {
		return hireDate;
	}
	/**
	 * @param hireDate the hireDate to set
	 */
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	/**
	 * @return The class name and person name
	 */
	@Override
	public String toString() {
		return "Class name: Employee\nPerson's name: " + super.getName();
	}
}
