package com.kang.vmv3;

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

	public void sales(int idx, int money) {
		// 해당 제품의 주소값을 빼온다음, money값과 제품의 price값을 비교, 금액이 부족하면 "금액이 부족합니다.", else 잔돈을
		// 나타낸다. idx값이 마이너스 값이거나
		int targetIdx = idx - 1;
		// Drink d = drinks.get(targetIdx);
		if (targetIdx >= 0 && targetIdx < drinks.size()) {
			for (int i = (idx - 1); i < idx; i++) {
				Drink d = drinks.get(i);
				if (money < d.getPrice()) {
					System.out.println("금액이 부족합니다.\n");
				} else {
					if(d.getStock() > 0) {
						System.out.println(d.getPName() + "를 뽑으셨습니다.");
						System.out.println("잔돈 : " + (money - d.getPrice()));
						System.out.printf("--------------------\n");
						d.setStock(d.getStock() - 1);
					} else {
						System.out.println("재고가 부족합니다.");
					}
				}
			}
		} else {
			System.out.println("올바르지 않은 버튼입니다.");
		}
	}

	public void showDrinks() {
		for (int i = 0; i < drinks.size(); i++) {
			Drink d = drinks.get(i);
			System.out.println((i + 1) + "." + d.getPName() + " : " + d.getPrice() + " - (재고 : " + d.getStock() + ")");
		}
		System.out.printf("--------------------\n");
	}

	// 파라미터 idx, 갯수
	public void putProduct(int idx, int qty) {
		int targetIdx = idx - 1;
		if (targetIdx >= 0 && targetIdx < drinks.size()) {
			Drink d = drinks.get(targetIdx);
			d.setStock(qty);
		} else if (idx < 0 || idx >= drinks.size()){
			System.out.println("없는 물건입니다.");
		} else if (qty < 0) {
			System.out.println("재고는 마이너스 불가.");
		}
	}
}
