
public class Person {
	private String name;
	private String email;
	
	//Constructor
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return The class name and person name
	 */
	@Override
	public String toString() {
		return "Class name: Person\nPerson's name: " + name;
	}
}
