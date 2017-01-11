package warehouse;
/**
 * @author Hannah Evans <hannah.c.evans@live.co.uk>
 * @version 4.4.0 (current version number of program)
 * @since 4.4.0 (the version of the package this class was first added to)
 */

public class GardenPots extends WarehouseItem implements PorousWare {

	// Attributes

	int size = 0;
	String type = "default";

	// Getter & Setter

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// Constructor

	public GardenPots(int itemID, int xItemLocation, int yItemLocation, String itemName,
			int stockLevel, boolean porousApplicable, int size, String type) {
		super(itemID, xItemLocation, yItemLocation, itemName, stockLevel, porousApplicable);
		this.size = size;
		this.type = type;
	}

	// Methods

	@Override
	public void applyPorousWare() {
		System.out.println("PorousWare applied to Garden Pots");
	}


	public void addNewItem(int itemID, String itemLocation, String itemName, int quantity, boolean porousApplicable, int size, String type)
	{
		Warehouse wh = new Warehouse();
		GardenPots tempGardenPots = new GardenPots(itemID, xItemLocation, yItemLocation, itemName, quantity, porousApplicable, size, type);
		wh.inventory.add(tempGardenPots);
	}
	public void addNewItem(GardenPots gp)
	{
		Warehouse wh = new Warehouse();
		wh.inventory.add(gp);
	}
	
	@Override
	public void addNewItem() {
		
	}
}
