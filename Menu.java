//Mohammad Naimur Rashid
//40027867 ASSIGNMENT 4 
//COMP 248 FALL 2016

import java.util.Scanner;
public class Menu {
	
private String openingm;
private String closingm;
private String top_prompt;
private String bottom_prompt;
private String[] options;
private String m = "?->";
Scanner in = new Scanner(System.in);

public Menu(String [] options){
	this.options = options;
	openingm = null;
	closingm = null;
	top_prompt = "Chose an option:";
	bottom_prompt = "Enter an option number:";
	List();	
	
}

public Menu(){
	openingm = null;
	closingm = null;
	top_prompt = null;
	bottom_prompt = null;
	options = null;
	
}

public String isEmpty(){
	
	if (options == null)
		return ("The options list is null/empty");
	
	else
		return ("The options list is not null/empty");
}
	
public int length(){
	if (options.length == 0)
		return 0;
	else
		return (options.length);
	
	
}

String list= "";
public void List(){
	
	for (int i = 0 ; i<options.length; i++){
		 list+= ("   ("+(i+1)+ ")  "+ options[i] + "\n");
	}
	
	
}

public String toString(){

return (((top_prompt!=null) ? top_prompt : "")+"\n"+ list + ((bottom_prompt!=null) ? ((closingm !=null)? closingm: "")+"\n" + m+ bottom_prompt : ""));
	
}
private int n;
public void readOptionsNumber(){
	System.out.println(this);
	n = in.nextInt();
	if (options == null)
		System.out.println(n);
	else if( n>options.length || n<=0)
		readOptionsNumber();
	
	else if (options[n-1]!=null)
		System.out.println("You entered "+n);; 
	
	 	
	}

public int getOptionNumber(){
	return n;
}

public void getBottomPrompt(){
	System.out.println(bottom_prompt);
}

public void setBottomPrompt(String bottom_prompt){
	this.bottom_prompt=bottom_prompt;
}

public void getTopPrompt(){
	System.out.println(top_prompt);
}

public void setTopPrompt(String top_prompt){
	this.top_prompt=top_prompt;
}

public void getBottomMessage(){
	System.out.println(closingm);
}

public void setBottomMessage(String closingm){
	this.closingm=closingm;
}

public void getTopMessage(){
	System.out.println(openingm);
}

public void setTopMessage(String openingm){
	this.openingm=openingm;
}





	
}




