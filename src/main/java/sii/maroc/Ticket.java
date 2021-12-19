package sii.maroc;

public class Ticket {
	private String dish1, dish2;
	
	//Getter for the dish number 1 in the ticket
	public String getDish1() {
		return this.dish1;
	}
	
	//Getter for the dish number 2 in the ticket
	public String getDish2() {
		return this.dish2;
	}
	
	//constructor (adding the dish number 1 to the ticket)
	public Ticket(String string) {
		this.dish1 = string;
	}

	//get the second dish and add it to the ticket, then return the ticket
	public Ticket and(String string) {
		this.dish2 = string;
		return this;
	}

}
