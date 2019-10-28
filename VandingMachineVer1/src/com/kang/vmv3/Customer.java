package com.kang.vmv3;

import java.util.*;

import com.kang.vmv2.Drink;

public class Customer {
	private List<Drink> drinks = new ArrayList();
	private String name;
	private int money;
	
	public Customer (String name, int money) {
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
	
	public void puchase(int idx) {
		
	}
	
	public String getName () {
		return this.name;
	}
	
	public int getmoney () {
		return this.money;
	}
}
