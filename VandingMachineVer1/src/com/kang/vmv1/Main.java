package com.kang.vmv1;

public class Main {
	public static void main(String[] args) {
		VendingMachine drink = new VendingMachine();

		drink.showDrinks();
		drink.purchase(8, 900);
	}
}
