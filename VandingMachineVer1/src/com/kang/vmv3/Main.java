package com.kang.vmv3;

public class Main {
	public static void main(String[] args) {
		VendingMachine drink = new VendingMachine();

		drink.showDrinks();
		drink.putProduct(1, 10);
		drink.putProduct(2, 10);
		drink.putProduct(3, 10);
		drink.putProduct(4, 10);
		drink.showDrinks();
		drink.sales(4, 10000);
		drink.showDrinks();
	}
}
