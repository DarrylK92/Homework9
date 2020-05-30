
public class Student extends Person {
	public static final String FRESHMAN = "freshman";
	public static final String SOPHOMORE = "sophomore";
	public static final String JUNION = "junior";
	public static final String SENIOR = "senior";
	
	private String status = FRESHMAN;
	
	//Constructor
	public Student(String status, String name, String email) {
		super(name, email);
		this.status = status;
	}
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return The class name and person name
	 */
	@Override
	public String toString() {
		return "Class name: Student\nPerson's name: " + super.getName();
	}
}
