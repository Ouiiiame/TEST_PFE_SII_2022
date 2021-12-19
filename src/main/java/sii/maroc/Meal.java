package sii.maroc;

public class Meal {
	Ticket ticket; //contains the dishes for the meal
	String dish1String, dish2String; //the 2 dishes
	int dish1Number, dish2Number; //the number of dishes for every type in the ticket
	
	//constructor
	public Meal(Ticket ticket) {
		this.ticket = ticket;
		this.dish1String = ticket.getDish1();
		this.dish2String = ticket.getDish2();
	}
	
	//returns the int number of dishes for 1 type of dishes (exp : 2 pizzas)
	public int dishNumber(String s) {
		return s.charAt(0) - '0';
	}

	//the number of served dishes (its the total number of dishes in the ticket)
	public int servedDishes() {
		dish1Number = dishNumber(dish1String); //the number of dishes for the first command in the ticket
		dish2Number = dish2String != null ? dishNumber(dish2String) : 0; //the number of dishes for the second command in the ticket
		
	    return dish1Number + dish2Number; //the total
	}

	//the cooking duration for all the meal
	public int cookingDuration() {	
		int dishNumber = dish1Number + dish2Number; 
		String dish1Type = dish1String.substring(2, dish1String.length() - 2); //the type of the first dish
		boolean isPizza = dish1Type == "Pizza";
        boolean Thereis2ndDish = dish2String != null;
		
		if(dishNumber == 1 && !isPizza) return 6;  // the first dish is just 1 "Tomato Mozzarella Salad" 
		if(dishNumber == 1 && isPizza) return 10; // just 1 pizza
		
		if(!isPizza && !Thereis2ndDish) return 6 + 3 * (dish1Number - 1); // more than 1 "Tomato Mozzarella Salad" dish and no second dish
		if(isPizza && !Thereis2ndDish) return 10 + 5 * (dish1Number - 1); // more than 1 pizza
		
		return 6 + 3 * (dish1Number - 1) + 10 + 5 * (dish2Number - 1); // 2 types of dishes
		
		
		
	}

}
