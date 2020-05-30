import java.util.Date;

public class Faculty extends Employee{
	public static final String[] RANKLIST = new String[] {"Professor", "Associate Professor", "Assistant Professor", "Instructor"};
	
	private String rank = RANKLIST[0];
	
	//Constructor
	public Faculty(String rank, double salary, Date hireDate, String name, String email) {
		super(salary, hireDate, name, email);
		this.rank = rank;
	}
	
	/**
	 * @return the rank
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}

	/**
	 * @return The class name and person name
	 */
	@Override
	public String toString() {
		return "Class name: Faculty\nPerson's name: " + ((Employee)this).getName();
	}
}
