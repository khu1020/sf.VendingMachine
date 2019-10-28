package com.kang.vmv2;

import java.util.*;

public class Customer {
	private List<Drink> drinks = new ArrayList();
	private String name;
	private int money;
	
	public Customer (String name, int money) {
		this.name = name;
		this.money = money;
		
		drinks.add(new Drink("콜라", 1000));
		drinks.add(new Drink("사이다", 1100));
		drinks.add(new Drink("환타", 1200));
		drinks.add(new Drink("2%", 1300));
		drinks.add(new Drink("마운틴듀", 1400));
	}
	
	public String getName () {
		return this.name;
	}
	
	public int getmoney () {
		return this.money;
	}
}
