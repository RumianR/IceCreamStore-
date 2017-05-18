//Mohammad Naimur Rashid
//40027867 ASSIGNMENT 4 
//COMP 248 FALL 2016


public class IceCreamStore {
	private ShoppingCart sc = new ShoppingCart();

public IceCreamStore(){
	intro();
}


public void run(){
	intro();  //was too lazy to change my names for the methods, so run is basically intro...
	
}

	
public void intro(){	
	String[] a_options = {"Place an order", "Delete an order", "Price the chart", "List the cart", 
			"Proceed to checkout", "Exit this menu"};
	Menu a = new Menu(a_options);
	if (sc.size()==5){
		a.setTopMessage("Your Shopping Cart is full with 5 ice cream orders.");
		a.setTopPrompt("Cannot place orders! what would you like to do?");
		a.setBottomMessage("Please select option 2, 3, 4, 5, or 6");
	}
	else if (sc.size()==0){
		a.setTopMessage("Your Shopping Cart is empty.");
		a.setTopPrompt("You have only two options: 1 or 6");
		a.setBottomMessage("Please enter 1 or 6");
	}
	
	else{
		a.setTopMessage("Your shopping cart contains "+ sc.size() +" ice cream orders");
		a.setTopPrompt("What would you like to do?");
	}
	a.getTopMessage();
	
	a.readOptionsNumber();
	
	int option1 = (a.getOptionNumber());
	if (sc.size()==0){
		
	switch (option1) {
	
    case 1:  placeOrder();
             break;
    case 6:  bye();
    		 break;
    default: run();
    
	}
}
	
	else if (sc.size()==5){
		switch (option1) {
	    
	    case 2:  deleteOrder();
	    		 break;
	    case 3:  printTotalPrice();
		 		break;
	    case 4:  reviewOrders();
	    		break;
	    case 5:  checkout();
		 		break;
	    case 6:  bye();
		 		break;
		default: run();
					break;
		 		}
		
}
	else{
		
		switch (option1) {
	    case 1:  placeOrder();
	             break;
	    case 2:  deleteOrder();
	    		 break;
	    case 3:  printTotalPrice();
		 		break;
	    case 4:  reviewOrders();
	    		break;
	    case 5:  checkout();
		 		break;
	    case 6:  bye();
		 		break;
	    default: run();
					break;
		 		}
		
	}
	
	
	
}



public void placeOrder(){
	
	sc.add(new IceCreamOrder());
	intro();
	
}
	
public void deleteOrder(){
	sc.helpertool();
	sc.helper+="Exit This Menu";
	String [] a_orders = sc.helper.split("\n");
	
	Menu b = new Menu(a_orders);
	b.setTopMessage("\nYou have selected to remove an order from your cart\n");
	b.getTopMessage();
	
	b.readOptionsNumber();
	int option2 = (b.getOptionNumber());
	if (option2==a_orders.length)
		intro();
	else
		{sc.remove(option2);
		System.out.println("The order you selected was deleted");
		System.out.println("-----------------------------------------------------------------\n");
		intro();}
	
}

double total;
public void helpertotal(){
	total=0;
	for (int i=1; i<=sc.size();i++)
		if(sc.get(i)!=null){
		total += sc.get(i).price();}
		
	
}

public double computeTotalPrice(){
	helpertotal();
	return total;
	
}

public void printTotalPrice(){
	System.out.println("-----------------------------------------------------=");
	System.out.println("Total price of all your orders in the cart: $"+computeTotalPrice());
	System.out.println("-----------------------------------------------------=\n");
	intro();
}
	
public void reviewOrders(){
	sc.helpertool();
	String [] a_s = sc.helper.split("\n");
	Menu c = new Menu(a_s);
	c.setTopMessage("\nYour current selections of our scrumptious ice creams");
	c.getTopMessage();
	c.setTopPrompt("-----------------------------------------------------------------------------------------------");
	c.setBottomPrompt("--------------------------------------------------------------------------------------------");
	System.out.println(c);
	
	 intro();
	
	
	
}

public void reviewOrdersHelper(){
	sc.helpertool();
	String [] a_s = sc.helper.split("\n");
	Menu c = new Menu(a_s);
	c.setTopMessage("\nYour current selections of our scrumptious ice creams");
	c.getTopMessage();
	c.setTopPrompt("-----------------------------------------------------------------------------------------------");
	c.setBottomPrompt("--------------------------------------------------------------------------------------------");
	System.out.println(c);
	
	
	
	
}


public void checkout(){
	reviewOrdersHelper();
	printTotalPrice();
}



public void bye(){
	System.out.println("Cheers!");
	System.exit(0);
}
}
