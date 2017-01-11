package warehouse;
/**
 * @author Hannah Evans <hannah.c.evans@live.co.uk>
 * @version 4.4.0 (current version number of program)
 * @since 4.4.0 (the version of the package this class was first added to)
 */

public class WarehouseWorker extends Person {

	// Attributes

	public int employeeID = 0;

	// Getters & Setters

	public int getemployeeID() {
		return this.employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	// Constructor

	public WarehouseWorker(String forename, String surname, int employeeID) {
		super(forename, surname);
		this.employeeID = employeeID;
	}
}
