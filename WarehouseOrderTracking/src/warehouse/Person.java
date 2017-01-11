package warehouse;
/**
 * @author Hannah Evans <hannah.c.evans@live.co.uk>
 * @version 4.4.0 (current version number of program)
 * @since 4.4.0 (the version of the package this class was first added to)
 */

public abstract class Person {

	// Attributes
	
	String forename;
	String surname ;
	
	// Getters & Setters
	
	public String getForename(){
		return this.forename;
	}
	
	public void setForename(String forename){
		this.forename = forename;
	}
	
	public String getSurname(){
		return this.surname;
	}
	
	public void setSurname(String surname){
		this.surname = surname;
	}
	
	// Constructor
	
	public Person(String forename, String surname){
		super();
		this.forename = forename;
		this.surname = surname;
	}
	
}
