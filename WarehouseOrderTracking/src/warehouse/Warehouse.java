/**
 * @author Hannah Evans <hannah.c.evans@live.co.uk>
 * @version 4.4.0 (current version number of program)
 * @since 4.4.0 (the version of the package this class was first added to)
 */
package warehouse;

import java.awt.EventQueue;

/**
 * @author Rupert Langford
 * @version 4.4.0 (current version number of program)
 * @since 4.4.0 (the version of the package this class was first added to)
 */
import java.util.ArrayList;

public class Warehouse {

	static ArrayList<CustomerOrder> customerOrderArray = new ArrayList<CustomerOrder>();
	static ArrayList<PurchaseOrder> purchaseOrderArray = new ArrayList<PurchaseOrder>();
	ArrayList<WarehouseItem> inventory = new ArrayList<WarehouseItem>();
	static ArrayList<Customer> customer = new ArrayList<Customer>();
	static ArrayList<WarehouseWorker> warehouseworker = new ArrayList<WarehouseWorker>();
	static ArrayList<PurchaseOrder> purchaseOrder = new ArrayList<PurchaseOrder>();
	static ArrayList<WarehouseItem> customerOrder = new ArrayList<WarehouseItem>();

	// Method that changes the current status of the order
	public void changeStatus(orderStatus currentStatus) {

	}

	public static void main(String[] args) {

		addCustomer("Hannah", "Evans", 1);
		addCustomer("Ruper", "Lang", 2);

		addWarehouseWorker("Ste", "Casey", 1);

		addPurchaseOrder(1, 1, 1, 2, orderStatus.Default);
		/*
		 * int purchaseOrderID, int supplierID, int itemID, int quantity,
		 * orderStatus newStatus
		 */
		addPurchaseOrderArrayItem(1, 1);

		addGnomeCustomerOrder(1, 0, 1, "Santa Gnome", 1 , true, 12);
		/*
		 * int itemID, int xItemLocation, int yItemLocation, String itemName,
		 * int quantity, boolean porousApplicable, int gnomeID
		 */
		addGardenPotsCustomerOrder(2, 3, 4, "Hippy Flower Pot", 1, true, 25,
				"Ceramic");
		/*
		 * int itemID, int xItemLocation, int yItemLocation, String itemName,
		 * int quantity, boolean porousApplicable, int size, String type
		 */
		addTableAndChairsCustomerOrder(3, 3, 2, "Recliner", 1, false, "Plastic");
		addTableAndChairsCustomerOrder(4, 2, 4, "Summer Time", 1, false, "Wooden");
		/*
		 * int itemID, int xItemLocation, int yItemLocation, String itemName,
		 * int quantity, boolean porousApplicable, String material
		 */
		addCustomerOrderArrayItem(1, 1, orderStatus.Default, 1);
		/*
		 * int customerOrderID, int customerID, boolean checkedOut, orderStatus
		 * newStatus, int employeeID
		 */

	

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				GUI GUI = new GUI();
				GUI.setVisible(true);
			}
		});

		orderStatus currentStatus = orderStatus.Default;

		switch (currentStatus) {

		case Checkedout:
			System.out.println("Order has been checkedout");
			currentStatus = orderStatus.Checkedout;
			break;

		case Received:
			System.out.println("Order has been received");
			currentStatus = orderStatus.Received;
			break;

		case Located:
			System.out.println("Item has been located");
			currentStatus = orderStatus.Located;
			break;

		case Picked:
			System.out.println("Item has been picked");
			currentStatus = orderStatus.Picked;
			break;

		case Completed:
			System.out.println("Order has been completed");
			currentStatus = orderStatus.Completed;
			break;

		case Delivered:
			System.out.println("Order has been delivered");
			currentStatus = orderStatus.Delivered;
			break;

		case Dispatched:
			System.out.println("Order has been dispatched");
			break;

		case Default:
			// System.out.println("Default status");
			break;
		}

	}

	public static void addCustomer(String forename, String surname,
			int customerID)
	{
		Customer tempCustomer = new Customer(forename, surname, customerID);
		customer.add(tempCustomer);
	}

	public void addCustomer(Customer c) {
		customer.add(c);
	}

	public void removeCustomer(int customerID) {
		for (Customer c : customer) {
			if (c.customerID == customerID) {
				customer.remove(c);
				break;
			}
		}
	}

	public static void addWarehouseWorker(String forename, String surname,
			int employeeID)// Forename, surname, customerID
	{
		WarehouseWorker tempWarehouseWorker = new WarehouseWorker(forename,
				surname, employeeID);
		warehouseworker.add(tempWarehouseWorker);
	}

	public void addWarehouseWorker(WarehouseWorker ww) {
		warehouseworker.add(ww);
	}

	public void removeWarehouseWorker(int employeeID) {
		for (WarehouseWorker ww : warehouseworker) {
			if (ww.employeeID == employeeID) {
				warehouseworker.remove(ww);
				break;
			}
		}
	}

	public static void addPurchaseOrder(int purchaseOrderID, int supplierID,
			int itemID, int quantity, orderStatus newStatus)// Might not be
															// needed.
	{
		PurchaseOrder tempPurchaseOrder = new PurchaseOrder(purchaseOrderID,
				supplierID, itemID, quantity, newStatus);
		purchaseOrder.add(tempPurchaseOrder);
	}

	public void addPurchaseOrder(PurchaseOrder po) {
		purchaseOrder.add(po);
	}

	public void removePurchaseOrder(int purchaseOrderID) {
		for (PurchaseOrder po : purchaseOrder) {
			if (po.purchaseOrderID == purchaseOrderID) {
				purchaseOrder.remove(po);
				break;
			}
		}
	}

	/*
	 * public void updatePurchaseOrder(int purchaseOrderID, orderStatus
	 * newStatus) { for (PurchaseOrder po : purchaseOrder) { if
	 * (po.purchaseOrderID == purchaseOrderID) { //po.orderReceieved = true; } }
	 * }
	 */

	public static void addPurchaseOrderArrayItem(int purchaseOrderID,
			int supplierID/*
						 * , int itemID , int quantity , boolean orderReceived
						 */) {
		PurchaseOrder tempPurchaseOrderArray = new PurchaseOrder(
				purchaseOrderID, supplierID/* , itemID, quantity, orderReceived */);// fixed
		purchaseOrderArray.add(tempPurchaseOrderArray);
	}

	public void addPurchaseOrderArrayItem(PurchaseOrder poa) {
		purchaseOrderArray.add(poa);
	}

	public void removePurchaseOrderArrayItem(int purchaseOrderID) {
		for (PurchaseOrder poa : purchaseOrderArray) {
			if (poa.purchaseOrderID == purchaseOrderID) {
				purchaseOrderArray.remove(poa);
				break;
			}
		}
	}

	public static void addCustomerOrderArrayItem(int customerOrderID,
			int customerID, orderStatus newStatus, int employeeID) {
		// this is for the array of orders rather than the items within
		CustomerOrder tempCustomerOrderArray = new CustomerOrder(
				customerOrderID, customerID, newStatus, employeeID);
		customerOrderArray.add(tempCustomerOrderArray);
	}

	public void addCustomerOrderArrayItem(CustomerOrder coa) {
		customerOrderArray.add(coa);
	}

	public void removeCustomerOrderArrayItem(int customerOrderID) {
		for (CustomerOrder coa : customerOrderArray) {
			if (coa.customerOrderID == customerOrderID) {
				customerOrderArray.remove(coa);
				break;
			}
		}
	}

	public static void addGnomeCustomerOrder(int itemID, int xItemLocation,
			int yItemLocation, String itemName, int quantity,
			boolean porousApplicable, int gnomeID)// this
													// uses
													// the
													// warehouse
													// items
													// information
	{
		Gnome tempGnomeOrder = new Gnome(itemID, xItemLocation, yItemLocation,
				itemName, quantity, porousApplicable, gnomeID);// might be
																// warehouseitem
																// that is
																// needed
		customerOrder.add(tempGnomeOrder);
	}

	public static void addGardenPotsCustomerOrder(int itemID,
			int xItemLocation, int yItemLocation, String itemName,
			int quantity, boolean porousApplicable, int size, String type) {
		GardenPots tempGardenPotsOrder = new GardenPots(itemID, xItemLocation,
				yItemLocation, itemName, quantity, porousApplicable, size, type);
		customerOrder.add(tempGardenPotsOrder);
	}

	public static void addTableAndChairsCustomerOrder(int itemID,
			int xItemLocation, int yItemLocation, String itemName,
			int quantity, boolean porousApplicable, String material) {
		TableAndChairs tempTableAndChairsOrder = new TableAndChairs(itemID,
				xItemLocation, yItemLocation, itemName, quantity,
				porousApplicable, material);
		customerOrder.add(tempTableAndChairsOrder);
	}

	public void addCustomerOrder(Gnome gn) {
		customerOrder.add(gn);
	}

	public void addCustomerOrder(GardenPots gp) {
		customerOrder.add(gp);
	}

	public void addCustomerOrder(TableAndChairs tac) {
		customerOrder.add(tac);
	}

	public void deleteStockItem(int itemID) {
		for (WarehouseItem wi : inventory) {
			if (wi.itemID == itemID) {
				inventory.remove(wi);
				break;
			}
		}
	}

	public void updateStockLevel(int itemID, int scanQuantity) {
		for (WarehouseItem wi : inventory) {
			if (wi.itemID == itemID) {
				wi.quantity = wi.quantity + scanQuantity; // need a scanner
				break;
			}
		}
	}
}
