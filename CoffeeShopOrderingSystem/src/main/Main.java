package main;

import data.MenuRepository;
import decorator.Boba;
import decorator.WhipeCream;
import drinks.Drink;
import factory.DrinkFactory;
import java.util.Scanner;

public class Main {

	public Main() {

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		MenuRepository repository = new MenuRepository();

		Drink drink = null;

		while (drink == null) {

			String[] menuList = repository.getAllDrinks();

			System.out.println("=== Coffee Shop ===");
			System.out.println("Choose your drink:");

			for (int i = 0; i < menuList.length; i++) {
				System.out.println((i + 1) + ". " + menuList[i]);
			}

			System.out.print("Input your choice: ");
			int choice = input.nextInt();

			drink = DrinkFactory.createDrink(choice);

			if (drink == null) {
				System.out.println("Invalid choice! Please try again.\n");
			}
		}

		boolean validTopping = false;

		while (!validTopping) {

			System.out.println("\nChoose your topping:");
			System.out.println("1. Boba");
			System.out.println("2. Whipped Cream");
			System.out.println("3. Both");
			System.out.println("4. No Topping");

			System.out.print("Input your topping: ");
			int topping = input.nextInt();

			if (topping == 1) {
				drink = new Boba(drink);
				validTopping = true;
			} else if (topping == 2) {
				drink = new WhipeCream(drink);
				validTopping = true;
			} else if (topping == 3) {
				drink = new Boba(drink);
				drink = new WhipeCream(drink);
				validTopping = true;
			} else if (topping == 4) {
				validTopping = true;
			} else {
				System.out.println("Invalid choice! Please try again.");
			}
		}

		System.out.println("\n=== Your Order ===");
		System.out.println("Drink: " + drink.getDescription());
		System.out.println("Price Detail: " + drink.getPriceDetail());
		System.out.println("Total Price: Rp " + drink.getPrice());

		input.close();
	}
}