package warehouse;
/**
 * @author Rupert Langford <langfordrt@gmail.co.uk>
 * @version 4.4.0 (current version number of program)
 * @since 4.4.0 (the version of the package this class was first added to)
 */
import static org.junit.Assert.*;

import org.junit.Test;

//import Library.Librarian;

//import Library.Librarian;


public class JUnit {

	@Test
	public void testCustomerOrder() {
		CustomerOrder co = new CustomerOrder(); //(1, 50, 1, 1, true);//itemID, quantity, CustomerOrderID, customerID, checked out.
		co.setCustomerOrderID(1);
		co.setCustomerID(1);
		//co.setNewStatus(orderStatus.Received);
		assertEquals("Error, does not return a Customer Order ID", co.getCustomerOrderID(), 1);
		assertEquals("Error, does not return a Customer ID", co.getCustomerID(), 1);
		assertEquals("Error, does not return whether it has been checked out or not", co.getNewStatus(), null);
		
	}
	
	@Test
	public void testPurchaseOrder() {// purchaseOrderID, SupplierID
		PurchaseOrder po = new PurchaseOrder ();//(2, 40, 2, 2);
		po.setPurchaseOrderID(2);
		po.setSupplierID(2);
		//po.setNewStatus(orderStatus.Received);
		assertEquals("Error, does not return a purchase order ID", po.getPurchaseOrderID(), 2);
		assertEquals("Error, does not return a supplier ID", po.getSupplierID(), 2);
		assertEquals("Error, cannot confirm if the order has been received", po.getNewStatus(), null);
	}
	@Test
	public void testWarehouse() {
		Warehouse wh = new Warehouse ();
		int answer1 = Warehouse.customerOrderArray.size();
		assertEquals(answer1, 0);
		int answer2 = Warehouse.purchaseOrderArray.size();
		assertEquals(answer2, 0);
		int answer3 = wh.inventory.size();
		assertEquals(answer3, 0);
		int answer4 = Warehouse.customer.size();
		assertEquals(answer4, 0);
		
	}
	@Test
	public void testWarehouseWorker() { 
		WarehouseWorker ww = new WarehouseWorker ("NULL", "NULL", 0);
		ww.setForename("James");
		ww.setSurname("Price");
		ww.setEmployeeID(1);
		assertEquals("Error, does not return a forename", ww.getForename(), "James");
		assertEquals("Error, does not return a surname", ww.getSurname(), "Price");
		assertEquals("Error, does not return an employee ID", ww.getemployeeID(),1);
	}
	@Test
	public void testCustomer() {
		Customer c = new Customer ("NULL","NULL",0);//("James", "Price", 1);
		Warehouse wh = new Warehouse();
		Warehouse.addCustomer("Jason", "Price", 1);
		Warehouse.addCustomer("Hannah", "Evans", 2);
		c.setForename("James");
		c.setSurname("Price");
		c.setCustomerID(1);
		assertEquals("Error, not return a forename", c.getForename(), "James");
		assertEquals("Error, not return a surname", c.getSurname(), "Price");
		assertEquals("Error, not return a customerID", c.getCustomerID(), 1);
		int answer = Warehouse.customer.size();
		assertEquals(answer, 2);
		wh.removeCustomer(1);
		int answer2 = Warehouse.customer.size();
		assertEquals(answer2, 1);
	}
	@Test
	public void testGnome() {
		Gnome gn = new Gnome (0, 1, 5, "NULL", 0, false, 0); 
		//int itemID, int xItemLocation, int yItemLocation, String itemName, int stockLevel, boolean porousApplicable, int gnomeID
		
		gn.setItemID(1);
		gn.setXItemLocation(1);
		gn.setYItemLocation(4);
		gn.setItemName("Santa");
		gn.setQuantity(55);
		gn.setPorousApplicable(true);
		gn.setGnomeID(66);
		assertEquals("Error, does not return an Item ID", gn.getItemID(),1);
		assertEquals("Error, does not return a default location", gn.getXItemLocation(),1);
		assertEquals("Error, does not return a default location", gn.getYItemLocation(),4);
		assertEquals("Error, does not return an Item Name", gn.getItemName(),"Santa");
		assertEquals("Error, does not return a Stock Level", gn.getQuantity(), 55);
		assertEquals("Error, does not return if the item is porous applicable", gn.getPorousApplicable(), true);
		assertEquals("Error, does not return the Gnomes ID", gn.getGnomeID(), 66);
	}
	@Test
	public void testGardenPots() {
		GardenPots gp = new GardenPots (0, 2, 4, "NULL", 0, false, 0, "NULL"); //(1, "defaultLocation", "Big Blue", 15, true, 89, "Wood");
		gp.setItemID(1);
		gp.setXItemLocation(2);
		gp.setYItemLocation(3);
		gp.setItemName("Big Blue");
		gp.setQuantity(55);
		gp.setPorousApplicable(true);
		gp.setSize(89);
		gp.setType("Wood");
		assertEquals("Error, does not return an Item ID", gp.getItemID(),1);
		assertEquals("Error, does not return a default location", gp.getXItemLocation(),2);
		assertEquals("Error, does not return a default location", gp.getYItemLocation(),3);
		assertEquals("Error, does not return an Item Name", gp.getItemName(),"Big Blue");
		assertEquals("Error, does not return a Stock Level", gp.getQuantity(), 55);
		assertEquals("Error, does not return if the item is porous applicable", gp.getPorousApplicable(), true);
		assertEquals("Error, does not return a size", gp.getSize(), 89);
		assertEquals("Error, does not return a type", gp.getType(),"Wood");
	}
	@Test
	public void testTableAndChairs() { //itemID, itemlocation, itemname, stocklevel, porousapplicable, material
		TableAndChairs tac = new TableAndChairs (0, 3, 1, "NULL", 0, false, "NULL"); //(1, "defaultLocation", "Tea in Wonderland", 55, false, "Wood");
		tac.setItemID(1);
		tac.setXItemLocation(0);
		tac.setYItemLocation(3);
		tac.setItemName("Tea in Wonderland");
		tac.setQuantity(55);
		tac.setPorousApplicable(true);
		tac.setMaterial("Wood");
		assertEquals("Error, does not return an Item ID", tac.getItemID(),1);
		assertEquals("Error, does not return a default location", tac.getXItemLocation(),0);
		assertEquals("Error, does not return a default location", tac.getYItemLocation(),3);
		assertEquals("Error, does not return an Item Name", tac.getItemName(),"Tea in Wonderland");
		assertEquals("Error, does not return a Stock Level", tac.getQuantity(), 55);
		assertEquals("Error, does not return if the item is porous applicable", tac.getPorousApplicable(), true);
		assertEquals("Error, does not return an Item Name", tac.getMaterial(),"Wood");
	}
	@Test
	public void testOrderDispatched(){
		CustomerOrder co = new CustomerOrder();
		//co.setNewStatus(orderStatus.Dispatched);
		
		assertEquals("Error, does not return true for the dispatched status", co.getNewStatus(), null);
	}
	@Test
	public void testOrderReceived(){
		PurchaseOrder co = new PurchaseOrder();
		co.orderReceived(54);
		assertEquals("Error, does not return true for the received status", co.getNewStatus(), null);
	}
	@Test
	public void testAddDeleteUpdateStockItem(){
		Warehouse wh = new Warehouse();
		Gnome gn = new Gnome(0, 2, 3, "NULL", 0, false, 0);
		GardenPots gp = new GardenPots(0, 2, 4, "NULL", 0, false, 0, "NULL");
		TableAndChairs tac = new TableAndChairs(0, 0, 5, "NULL", 0, false, "NULL");
		
		gn.addNewItem(22, "DefaultLocation", "Santa", 50, true, 1);//Gnome
		gp.addNewItem(23, "DefaultLocation", "Big Blue", 4, true, 5, "Seedling");//Gardenpots
		tac.addNewItem(24, "DefaultLocation", "Wonderland Experience", 4, false, "Wood");//Tables and chairs
		wh.deleteStockItem(23);
		int answer = wh.inventory.size();
		assertEquals(answer, 2);
		wh.updateStockLevel(24, 50);
		assertEquals(50, wh.inventory.get(1).quantity);
	}
	@Test
	public void testCheckOutOrder()
	{
		//Warehouse wh = new Warehouse();
		CustomerOrder co = new CustomerOrder();
		
		assertEquals(co.getNewStatus(), null); //wh.customerOrder.get(1).quantity
	}
	@Test
	public void testLocateItem()
	{
		//Warehouse wh =  new Warehouse();
		//CustomerOrder co = new CustomerOrder(76, 45, true, false, 4);
		// assertEquals("Error, does not return the best route to take", Warehouse.customerOrder);
	}
	
}