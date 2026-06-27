package decorator;

import drinks.Drink;

public class Boba extends ToppingDecorator{

	public Boba(Drink drink) {
		super(drink);
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return drink.getPrice() + 5000;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return drink.getDescription() + " + Boba"; 
	}

	@Override
	public String getPriceDetail() {
		// TODO Auto-generated method stub
		return drink.getPriceDetail() + " + Rp 5000";
	}

}
