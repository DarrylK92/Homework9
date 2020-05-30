import java.util.Date;

public class Staff extends Employee{
	public static final String[] TITLELIST = new String[] {"Manager", "Supervisor", "Clerk", "Technician"};
	
	private String title = TITLELIST[0];
	
	//Constructor
	public Staff(String title, double salary, Date hireDate, String name, String email) {
		super(salary, hireDate, name, email);
		this.title = title;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return The class name and person name
	 */
	@Override
	public String toString() {
		return "Class name: Staff\nPerson's name: " + ((Staff)this).getName();
	}
}
