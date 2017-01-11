package warehouse;

/**
 * @author Hannah Evans <hannah.c.evans@live.co.uk>
 * @version 4.4.0 (current version number of program)
 * @since 4.4.0 (the version of the package this class was first added to)
 */

public class PurchaseOrder {
	// array moved to warehouse
	// Attributes

	int purchaseOrderID = 0;
	int supplierID = 0;
	int itemID = 0;
	int quantity = 0; // new
	orderStatus newStatus;

	// Getters & Setters

	public int getPurchaseOrderID() {
		return this.purchaseOrderID;
	}

	public void setPurchaseOrderID(int purchaseOrder) {
		this.purchaseOrderID = purchaseOrder;
	}

	public int getSupplierID() {
		return this.supplierID;
	}

	
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public orderStatus getNewStatus() {
		return newStatus;
	}

	public void setNewStatus(orderStatus newStatus) {
		this.newStatus = newStatus;
	}


	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getitemID() {
		return this.itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	// Constructor

	public PurchaseOrder(int purchaseOrderID, int supplierID, int itemID,
			int quantity, orderStatus newStatus) {
		this.purchaseOrderID = purchaseOrderID;
		this.supplierID = supplierID;
		this.quantity = quantity;
		this.newStatus = newStatus;
		this.itemID = itemID;
	}

	public PurchaseOrder(int purchaseOrderID, int supplierID) {
		this.purchaseOrderID = purchaseOrderID;
		this.supplierID = supplierID;
	}

	public PurchaseOrder(){
		
	}
	
	// Methods

	public void orderReceived(int purchaseOrderID)// need something that creates
													// the purchase order array
													// and another that creates
													// the purchase order
	{
		// for each item in a list for(Item i : itemList)
		for (PurchaseOrder po : Warehouse.purchaseOrderArray) {
			if (po.purchaseOrderID == purchaseOrderID) {
				po.newStatus = orderStatus.Received;
				break;
			}
		}

		/*
		 * public void updateStockLevel(int itemID, int scanQuantity) { for
		 * (WarehouseItem wi : inventory) { if(wi.itemID == itemID) {
		 * wi.quantity = wi.quantity + scanQuantity; //need a scanner break; } }
		 * }
		 */
	}

	public void checkPorousWare() {

	}
}
