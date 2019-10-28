package com.kang.vmv3;

public class Drink {
	private String pName;
	private int price;
	private int stock;

	public Drink(String pName, int price) {
		this.pName = pName;
		this.price = price;
	}

	public String getPName() {
		return this.pName;
	}

	public int getPrice() {
		return this.price;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return String.format("%s: %d", pName, price);
	}
}
