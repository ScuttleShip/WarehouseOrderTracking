package warehouse;
/**
 * @author Rupert Langford
 * @version 4.4.0 (current version number of program)
 * @since 4.4.0 (the version of the package this class was first added to)
 */

public class TableAndChairs extends WarehouseItem{

	// Attributes

	String material = "default";

	// Getter & Setter

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}


	// Constructor
	public TableAndChairs(int itemID, int xItemLocation, int yItemLocation, String itemName, int stockLevel, boolean porousApplicable, String material) {
		super(itemID, xItemLocation, yItemLocation, itemName, stockLevel, porousApplicable);
		this.material = material;
	}

	public void addNewItem(int itemID, String itemLocation, String itemName, int quantity, boolean porousApplicable, String material)
	{
		Warehouse wh = new Warehouse();
		TableAndChairs tempTable = new TableAndChairs(itemID, xItemLocation, yItemLocation, itemName, quantity, porousApplicable, material);
		wh.inventory.add(tempTable);
	}
	public void addNewItem(TableAndChairs tac)
	{
		Warehouse wh = new Warehouse();
		wh.inventory.add(tac);
	}
	@Override
	public void addNewItem()
	{
		
	}
}

