package com.kang.vmv1;

import java.util.*;

public class VendingMachine {
	private List<Drink> drinks = new ArrayList();

	public VendingMachine() {
		drinks.add(new Drink("콜라", 1000));
		drinks.add(new Drink("사이다", 1100));
		drinks.add(new Drink("환타", 1200));
		drinks.add(new Drink("2%", 1300));
		drinks.add(new Drink("마운틴듀", 1400));
	}

	public void purchase(int idx, int money) {
		// 해당 제품의 주소값을 빼온다음, money값과 제품의 price값을 비교, 금액이 부족하면 "금액이 부족합니다.", else 잔돈을
		// 나타낸다. idx값이 마이너스 값이거나
		// int targetIdx = idx - 1;
		// Drink d = drinks.get(tagetIdx);
		if (idx > 0 && idx < drinks.size()) {
			for (int i = (idx - 1); i < idx; i++) {
				Drink d = drinks.get(i);
				if (money < d.getPrice()) {
					System.out.println("금액이 부족합니다.\n");
				} else {
					System.out.println(d.getPName() + "를 뽑으셨습니다");
					System.out.println("잔돈 : " + (money - d.getPrice()));
				}
			}
		} else {
			System.out.println("올바르지 않은 버튼입니다");
		}
	}

	public void showDrinks() {
		for (int i = 0; i < drinks.size(); i++) {
			Drink d = drinks.get(i);
			System.out.println((i + 1) + "." + d.getPName() + " : " + d.getPrice());
		}
		System.out.printf("--------------------\n");
	}
}
