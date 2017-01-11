package warehouse;
/**
 * @author Hannah Evans <hannah.c.evans@live.co.uk>
 * @version 4.4.0 (current version number of program)
 * @since 4.4.0 (the version of the package this class was first added to)
 */

public class Gnome extends WarehouseItem implements PorousWare{

	// Attribute
	
	int gnomeID = 0;
	
	// Getter & Setter
	
	public int getGnomeID() {
		return gnomeID;
	}

	public void setGnomeID(int gnomeID) {
		this.gnomeID = gnomeID;
	}

	// Constructor
	public Gnome(int itemID, int xItemLocation, int yItemLocation, String itemName, int stockLevel, boolean porousApplicable, int gnomeID) {
		super(itemID, xItemLocation, yItemLocation, itemName, stockLevel, porousApplicable);
		this.gnomeID= gnomeID;
	}

	// Method
	
	@Override
	public void applyPorousWare(){
		System.out.println("PorousWare applied to Gnome");
	}
	
	public void addNewItem(int itemID, String itemLocation, String itemName, int quantity, boolean porousApplicable, int gnomeID)
	{
		Warehouse wh = new Warehouse();
		Gnome tempGnome = new Gnome(itemID, xItemLocation, yItemLocation, itemName, quantity, porousApplicable, gnomeID);
		wh.inventory.add(tempGnome);
	}
	public void addNewItem(Gnome gn)
	{
		Warehouse wh = new Warehouse();
		wh.inventory.add(gn);
	}
	@Override
	public void addNewItem()
	{
		
	}
	
	
}
