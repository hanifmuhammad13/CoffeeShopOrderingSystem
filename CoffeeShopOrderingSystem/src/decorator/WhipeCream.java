package decorator;

import drinks.Drink;

public class WhipeCream extends ToppingDecorator{

	public WhipeCream(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return drink.getPrice() + 7000; 
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return drink.getDescription() + " + Whipped Cream"; 
	}

	@Override
	public String getPriceDetail() {
		// TODO Auto-generated method stub
		return drink.getPriceDetail() + " + Rp 7000";
	}

}
