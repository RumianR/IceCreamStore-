//Mohammad Naimur Rashid
//40027867 ASSIGNMENT 4 
//COMP 248 FALL 2016

public class IceCreamOrder {
private String flavor;
private String vessel;
private String amount;
private double unit_price;
private int quantity;


public String toString(){

	return (quantity+ " orders of "+amount+ " of "+ flavor +
			" ice cream in a "+ vessel+" for $" +price()
			+" = "+ quantity+" x "+ unit_price);
	
	
}

public double price(){
	return (quantity*unit_price);
	
}

public String GetFlavor(){
	return flavor;
}

public void SetFlavor(String flavor){
	this.flavor =flavor;
}

public String GetVessel(){
	return vessel;
}

public void SetVessel(String vessel){
	this.vessel =vessel;
}

public String GetAmount(){
	return amount;
}

public void SetAmount(String amount){
	this.amount =amount;
}

public double GetUnitPrice(){
	return unit_price;
}

public void SetUnitPrice(double unit_price){
	this.unit_price =unit_price;
}

public double GetQuantity(){
	return quantity;
}

public void SetQuantity(int quantity){
	this.quantity =quantity;
}

IceCreamOrder(String flavor, String vessel, String amount, double unitPrice, int quantity){
	this.flavor=flavor;
	this.vessel = vessel;
	this.amount = amount;
	this.unit_price = unitPrice;
	this.quantity =quantity;
	
}

IceCreamOrder(String flavor, String vessel, String amount, double unitPrice){
	this.flavor=flavor;
	this.vessel = vessel;
	this.amount = amount;
	this.unit_price = unitPrice;
	this.quantity =1;
	
}

IceCreamOrder(){
	//Making a menu with an array of flavors
	String[] flavors = {"Avocado", "Banana", "Chocolate", "Hazelnut", 
			"Lemon", "Mango", "Mocha", "Vanilla"};
	Menu a = new Menu(flavors);
	a.setTopMessage("Placing an order is as easy as ABC, and D.");
	a.getTopMessage();
	
	a.setTopPrompt("Step A: Select your favorite flavour");
	
	a.readOptionsNumber();
	int option1 = (a.getOptionNumber());
	
	
		flavor = flavors[option1-1];
	System.out.println(this.flavor);
	//Making a menu with an array of vessels
	String[] a_vessel = {"Cone", "Cup", "Sundae"};
	Menu b = new Menu(a_vessel);
	
	b.setTopPrompt("Step B: Select a vessel for your ice cream:");
	
	b.readOptionsNumber();
	int option2 = (b.getOptionNumber());
	
		this.vessel = a_vessel[option2-1];
		System.out.println(this.vessel);
		
	//Making a menu with an array of amounts
		String[] a_amount = {"Single Scoop", "Double Scoop", "Triple Scoop"};
		Menu c = new Menu(a_amount);
		
		c.setTopPrompt("Step C: How much ice cream?");
		
		c.readOptionsNumber();
		int option3 = (c.getOptionNumber());
		
			this.amount = a_amount[option3-1];
			System.out.println(this.amount);
	//Making a menu with an array of quantity
		int[] a_quantity = {1,2,3,4,5,6,7,8,9,10};//decided to make 2 arrays to use integers
											   //in the background while showing user String
		String[] s_quantity = {"One", "Two", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine","Ten"};
		Menu d = new Menu(s_quantity);
		d.setTopPrompt("Step D: how many orders of your current selection?");
		d.setBottomPrompt("Enter how many orders");
		
		d.readOptionsNumber();
		int option4 = (d.getOptionNumber());
		
			this.quantity = a_quantity[option4-1];//records integer value
			System.out.println(s_quantity[option4-1]);//reads out from String array
		
	if (amount==("Single Scoop")){
		if (vessel==("Cup"))
			unit_price= 2.99;
		else if (vessel==("Cone"))
			unit_price= 3.49;
		else if (vessel==("Sundae"))
			unit_price= 4.25;
	}
	if (amount==("Double Scoop")){
		if (vessel==("Cup"))
			unit_price= 3.99;
		else if (vessel==("Cone"))
			unit_price= 4.49;
		else if (vessel==("Sundae"))
			unit_price= 5.25;
	}
	
	if (amount==("Triple Scoop")){
		if (vessel==("Cup"))
			unit_price= 4.99;
		else if (vessel==("Cone"))
			unit_price= 5.49;
		else if (vessel==("Sundae"))
			unit_price= 6.25;
	}
	
	
}



}
