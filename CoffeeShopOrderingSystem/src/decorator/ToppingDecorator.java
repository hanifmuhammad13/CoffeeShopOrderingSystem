package decorator;

import drinks.Drink;

public abstract class ToppingDecorator implements Drink{
	
	protected Drink drink;
	
	public ToppingDecorator(Drink drink) {
		this.drink = drink;
	}
	
	public abstract String getDescription();
}
