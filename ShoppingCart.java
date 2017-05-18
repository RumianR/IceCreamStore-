//Mohammad Naimur Rashid
//40027867 ASSIGNMENT 4 
//COMP 248 FALL 2016


public class ShoppingCart {
private IceCreamOrder[] sc ;
private int max_cap = 5;

public String helper = "";  //a tool which filters out a list of available items in the cart

public ShoppingCart(){
	sc = new IceCreamOrder[max_cap];
	
}

public void add(IceCreamOrder order){
	
if (size()==0)
sc[0]=order;
else if (size()<5){
	
	
	
	for (int i = 0 ; i < 5 ; i++){
		if (sc[i] == null){
			sc[i]=order;
			if (sc[i] == order) 
				break;}
		}
}



else
	System.out.println("Max Order, remove something from the list");
	
}





public void remove(int position){
	if (position > sc.length || position <0 )
		System.out.println("The position is undefined" );
	
	else{
		
		sc[position-1] = null;
		reordertool();
				
		}
			
}


public void reordertool(){
	for (int i = 0 ; i < 5 ; i++){
		if (sc[i] != null){
			for (int j =0; j<5 ; j++){
				
			if(sc[j]==null){
					sc[j]=sc[i];
					sc[i] = null;
					
					
				}
			}
				
		}
	}
}

public void helpertool (){
	helper = "";
	for (int i = 0 ; i < sc.length ; i++){
			if (sc[i] != null){
				
				helper+= (sc[i].toString() +"\n");
				
			}
				
		
	}
	
	
}

public String toString(){
	helpertool();
	return helper;
	
	}





public boolean isEmpty(){
	int i =1;
	for ( ;i<=sc.length; i++){
		if (sc[i-1] != null)
			return false;}
	return (i==sc.length);
	
	
}

public boolean isFull(){
	return (size()==max_cap);
}
	
public IceCreamOrder get(int position){
	if (position > sc.length || position <0 )
		 System.out.println("Position out of range");
	return (position > sc.length || position <0 )? null :sc[position-1];
	
}

public int size(){
	int j = 0;
	for (int i = 0 ; i < sc.length ; i++){
		if (sc[i] != null)
			j++;
	}
return j;
}



}
	
		
		
	




