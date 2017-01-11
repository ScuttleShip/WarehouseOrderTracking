package warehouse;
/**
 * @author Hannah Evans <hannah.c.evans@live.co.uk>
 * @version 4.4.0 (current version number of program)
 * @since 4.4.0 (the version of the package this class was first added to)
 */

public class Customer extends Person {

	// Attributes

	int customerID = 0;

	// Getter & Setter

	public int getCustomerID() {
		return this.customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	// Constructor
	public Customer(String forename, String surname, int customerID) {
		super(forename, surname);
		this.customerID = customerID;

	}
}
