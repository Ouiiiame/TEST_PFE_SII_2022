package sii.maroc;

//import java.util.HashMap;

public class Restaurant {
	private String stock, stock2, stock3, stock4, stock5, stock6;
	//private HashMap<String, Integer> m = new HashMap<String, Integer>();

	public Restaurant(String string, String string2, String string3, String string4) {
		this.stock = string;
		this.stock2 = string2;
		this.stock3 = string3;
		this.stock4 = string4;
	}

	public Restaurant(String string, String string2, String string3, String string4, String string5, String string6) {
		this(string, string2, string3, string4);
		this.stock5 = string5;
		this.stock6 = string5;
	}

	//write the order into the ticket and return the ticket
	public Ticket order(String string) {
		
		return new Ticket(string);
	}

	public Meal retrieve(Ticket ticket) {
		return new Meal(ticket);
	}


	
}
