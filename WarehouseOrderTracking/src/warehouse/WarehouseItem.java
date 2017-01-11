package warehouse;
/**
 * @author Hannah Evans <hannah.c.evans@live.co.uk>
 * @version 4.4.0 (current version number of program)
 * @since 4.4.0 (the version of the package this class was first added to)
 */

public abstract class WarehouseItem {

	// Attributes
	
	public int xItemLocation;
	public int yItemLocation;
	int itemID = 0;
	
	String itemName = "default";
	int quantity = 0;
	boolean porousApplicable= false;
	
	// Getters & Setters
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public int getXItemLocation() {
		return xItemLocation;
	}
	public void setXItemLocation(int xItemLocation) {
		this.xItemLocation = xItemLocation;
	}
	
	public int getYItemLocation() {
		return yItemLocation;
	}
	public void setYItemLocation(int yItemLocation) {
		this.yItemLocation = yItemLocation;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public boolean getPorousApplicable() {
		return porousApplicable;
	}
	public void setPorousApplicable(boolean porousApplicable) {
		this.porousApplicable = porousApplicable;
	}
	
	
// Constructor
	
	public WarehouseItem(int itemID, int xItemLocation, int yItemLocation, String itemName, int quantity, boolean porousApplicable){
		super();
		this.itemID = itemID;
		this.xItemLocation = xItemLocation;
		this.yItemLocation = yItemLocation;
		this.itemName = itemName;
		this.quantity = quantity;
		this.porousApplicable = porousApplicable;
		
	}
	public abstract void addNewItem();
	
	public void pickItem(int itemID, int quantity) {

	}
}


