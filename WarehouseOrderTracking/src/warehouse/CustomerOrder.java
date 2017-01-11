package warehouse;

/**
 * @author Hannah Evans <hannah.c.evans@live.co.uk>
 * @version 4.4.0 (current version number of program)
 * @since 4.4.0 (the version of the package this class was first added to)
 */

public class CustomerOrder {

	// Attributes

	int customerOrderID = 0;
	int customerID = 0;
	orderStatus newStatus;
	int employeeID = 0;

	// Getters & Setters

	public int getCustomerOrderID() {
		return this.customerOrderID;
	}

	public void setCustomerOrderID(int customerOrderID) {
		this.customerOrderID = customerOrderID;
	}

	public int getCustomerID() {
		return this.customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getEmployeeID() {
		return this.employeeID;
	}

	public orderStatus getNewStatus() {
		return newStatus;
	}

	public void setNewStatus(orderStatus newStatus) {
		this.newStatus = newStatus;
	}

	// Constructor

	public CustomerOrder(int customerOrderID, int customerID,
			orderStatus newStatus, int employeeID) {
		this.customerOrderID = customerOrderID;
		this.customerID = customerID;
		this.newStatus = newStatus;
		this.employeeID = employeeID;
	}
	
	public CustomerOrder(){
		
	};

	// Methods

	public void dispatchCO(int customerOrderID) {
		for (CustomerOrder co : Warehouse.customerOrderArray) {
			if (co.customerOrderID == customerOrderID) {
				co.newStatus = orderStatus.Dispatched;
				break;
			}
		}
	}

	public void checkoutCO(int customerOrderID, int employeeID) {
		for (CustomerOrder co : Warehouse.customerOrderArray) {
			if (co.customerOrderID == customerOrderID) {
				co.newStatus = orderStatus.Checkedout;
				break;
			}
		}
	}
	public void pickCO(int customerOrderID, int employeeID) {
		for (CustomerOrder co : Warehouse.customerOrderArray) {
			if (co.customerOrderID == customerOrderID) {
				co.newStatus = orderStatus.Picked;
				break;
			}
		}
	}
	
	public void completeCO(int customerOrderID, int employeeID) {
		for (CustomerOrder co : Warehouse.customerOrderArray) {
			if (co.customerOrderID == customerOrderID) {
				co.newStatus = orderStatus.Completed;
				break;
			}
		}
	}
	
	public void locateItem(int itemID, String itemLocation) {
		// Need to implement travelling salesman
		for (CustomerOrder co : Warehouse.customerOrderArray) {
			if (co.customerOrderID == customerOrderID) {
				co.newStatus = orderStatus.Located;
				// TS would produce an array that would state the order in which the items should be picked
				TravellingSalesman.permutations("", "co.customerOrder.customerOrderID");
				break;
			}
	}
	}
}

