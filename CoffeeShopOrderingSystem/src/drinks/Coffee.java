package drinks;

public class Coffee implements Drink{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Coffee";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	public String getPriceDetail() {
		// TODO Auto-generated method stub
		return "Rp 20000";
	}

}
