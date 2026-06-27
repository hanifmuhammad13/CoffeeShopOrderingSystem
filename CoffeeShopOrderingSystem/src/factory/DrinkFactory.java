package factory;

import drinks.Coffee;
import drinks.Drink;
import drinks.Matcha;
import drinks.Milktea;

public class DrinkFactory {
	
	public static Drink createDrink(int choise) {
		
		if(choise == 1) {
			return new Coffee();
		} 
		else if(choise == 2) {
			return new Matcha();
		} 
		else if(choise == 3) {
			return new Milktea();
		}
		
		return null;
	}

}
