/**
 * @author Rupert Langford 
 * @version 4.4.0 (current version number of program)
 * @since 4.4.0 (the version of the package this class was first added to)
 */
package warehouse;


import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;

public class GUI extends JFrame
{//Contains all the GUI information and boxes required for the Order system to work correctly 
	JButton pOButton, cOButton, wIButton, pButton; //Buttons named after what they are used for.
	JButton addCOButton, removeCOButton, searchCOButton, printCOButton, updateCOButton, backCOButton; //customer panel buttons
	JButton addPOButton, removePOButton, searchPOButton, printPOButton, updatePOButton, backPOButton, updateBackCOButton;//purchase order panel buttons
	JRadioButton checkedOutButton, locatedButton, pickedButton, dispatchedButton, completedButton;//Statuses for update customer order
	ButtonGroup group1;
	JList <String> customerOrdersList;
	JSplitPane updateCOSplitPane;
	
	//people panel buttons
	//warehouseitems panel buttons

	public GUI()
	{
		initUI();
	}

	private void initUI()
	{
		setTitle("Warehouse Order Management System");
		setSize(625, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		final Container container1 = this.getContentPane(); //Initial Window (I believe I can replace the panes when a button is clicked,
		//means I don't need a second window)

		//Container container2 = this.getContentPane();
		final JPanel panel1 = new JPanel(new GridLayout(2,2));
		final JPanel panel2 = new JPanel(new GridLayout(2,2));
		final JPanel panel3 = new JPanel(new GridLayout(2,2));
		final JPanel panel4 = new JPanel(new GridLayout(2,3));
		final JPanel panel5 = new JPanel();
		final JPanel panel6 = new JPanel(new GridLayout(2,3));
		//JSplitPane splitPane;

		createComponents();
		panel1.add(pOButton);
		panel1.add(cOButton);
		panel1.add(wIButton);
		panel1.add(pButton);

		panel2.add(addCOButton);
		panel2.add(removeCOButton);
		panel2.add(searchCOButton);
		panel2.add(printCOButton);
		panel2.add(updateCOButton);
		panel2.add(backCOButton);

		panel3.add(addPOButton);
		panel3.add(removePOButton);
		panel3.add(searchPOButton);
		panel3.add(printPOButton);
		panel3.add(updatePOButton);
		panel3.add(backPOButton);
		
		panel4.add(checkedOutButton);
		panel4.add(locatedButton);
		panel4.add(pickedButton);
		panel4.add(completedButton);
		panel4.add(dispatchedButton);
		panel4.add(updateBackCOButton);
		
		//panel5.add(backCOButton);

		//grouping the radiobuttons on panel 4
		group1 = new ButtonGroup();
		group1.add(checkedOutButton);
		group1.add(locatedButton);
		group1.add(pickedButton);
		group1.add(dispatchedButton);
		group1.add(completedButton);
		
		
		updateCOSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel6, panel4); //Splits the panels to create a list on one side and a series of radio buttons on the other
		updateCOSplitPane.setDividerLocation(100);
		updateCOSplitPane.setLeftComponent(panel6);
		updateCOSplitPane.setRightComponent(panel4);
		updateCOSplitPane.setOneTouchExpandable(true);
		Dimension minimumSize = new Dimension (100, 50);
		panel4.setMinimumSize(minimumSize);
		panel6.setMinimumSize(minimumSize);
		
		
		container1.add(panel1);//Initial window and initial pane
		//container1.add(panel2);

		//first panel buttons and the back functions to them
		cOButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == cOButton) //should make Customer Order Button remove the old panel and open a new one
				{
					panel1.setVisible(false);
					container1.add(panel2);
					panel2.setVisible(true);
				}
			}
		});
		backCOButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == backCOButton)
				{
					panel2.setVisible(false);
					panel1.setVisible(true);
				}
			}
		});
		pOButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == pOButton)
				{
					panel1.setVisible(false);
					container1.add(panel3);
					panel3.setVisible(true);
				}
			}
		});
		backPOButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == backPOButton)
				{
					panel3.setVisible(false);
					panel1.setVisible(true);
				}
			}
		});
		updateCOButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == updateCOButton)
				{
					container1.add(panel5);
					panel2.setVisible(false);
					panel5.add(updateCOSplitPane);
					updateCOSplitPane.add(panel6);
					updateCOSplitPane.add(panel4);
					panel6.setVisible(true);
					panel5.setVisible(true);
					panel4.setVisible(true);
				}
			}
		});
		updateBackCOButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == updateBackCOButton)
				{
					panel4.setVisible(false);
					panel2.setVisible(true);
				}
			}
		});
	}

	
	public void createComponents()
	{
		pOButton = new JButton("Purchase Orders"); //First panel buttons
		cOButton = new JButton("Customer Orders");
		wIButton = new JButton("Warehouse Items");
		pButton = new JButton("People");

		addCOButton = new JButton("Add Customer Order");//Second panel buttons
		removeCOButton = new JButton("Remove Customer Order");
		updateCOButton = new JButton("Update Customer Order");
		searchCOButton = new JButton("Search for a Customer Order");
		printCOButton = new JButton("Print all Customer Orders");
		backCOButton = new JButton("Go back");

		addPOButton = new JButton("Add Purchase Order");//Third panel buttons
		removePOButton = new JButton("Remove Purchase Order");
		updatePOButton = new JButton("Update Purchase Order");
		searchPOButton = new JButton("Search for a Purchase Order");
		printPOButton = new JButton("Print all Purchase Orders");
		backPOButton = new JButton("Go back");
		
		checkedOutButton = new JRadioButton("Check out an order");//Fourth panel buttons and list
		locatedButton = new JRadioButton("Items have been located");
		pickedButton = new JRadioButton("Items have been picked");
		completedButton = new JRadioButton("Order has been completed");
		dispatchedButton = new JRadioButton("Order has been dispatched");
		updateBackCOButton = new JButton("Go back");
		
		/*String[] customerOrders= ;
		customerOrderList = new JList<String>(customerOrders);*/
	}	
}