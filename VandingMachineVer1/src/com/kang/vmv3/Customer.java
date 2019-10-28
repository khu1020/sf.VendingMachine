package com.kang.vmv3;

import java.util.*;

import com.kang.vmv2.Drink;

public class Customer {
	private List<Drink> drinks = new ArrayList();
	private String name;
	private int money;

	public Customer(String name, int money) {
		init();
		this.name = name;
		this.money = money;
	}

	private void init() {
		drinks.add(new Drink("콜라", 1000));
		drinks.add(new Drink("사이다", 1100));
		drinks.add(new Drink("환타", 1200));
		drinks.add(new Drink("2%", 1300));
		drinks.add(new Drink("마운틴듀", 1400));
	}

	public void purchase(int idx) {
		addStock(idx);
		payMoney(idx);
	}
	
	//재고 1씩 올리기
	public void addStock(int idx) {
		Drink stock = drinks.get(idx-1);
		stock.setStock(stock.getStock() + 1);
	}
	
	//금액사용
	public void payMoney(int idx) {
		Drink d = drinks.get(idx - 1);
		this.money -= d.getPrice();
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void showCustomer() {
		System.out.println("--" + name + "님의 재고상태--");
		for (int i = 0; i < drinks.size(); i++) {
			Drink d = drinks.get(i);
			System.out.println((i + 1) + "." + d.getPName() + " : " + d.getPrice() + " - (재고 : " + d.getStock() + ")");
		}
		System.out.println("Money : " + money);
	}
	
	@Override
	public String toString() {
		return name + ", " + money;
	}
}
