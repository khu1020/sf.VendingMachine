package com.kang.vmv3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		VendingMachine vm = new VendingMachine();
		
		System.out.print("이름을 입력해 주세요 : ");
		String name = scan.next();
		
		System.out.print("금액을 입력해 주세요 : ");
		int money = scan.nextInt();
		
		Customer cust = new Customer(name, money);
		System.out.println(cust);
		
		vm.showDrinks();
		while(true) {
			System.out.print("번호를 입력해 주세요 : ");
			int idx = scan.nextInt();
			
			if(idx == 0) {
				System.out.print("---자판기 게임 종료---\n");
				scan.close();
				break;
			}
			vm.sales(idx, cust);
			
			cust.purchase(idx);
			cust.showCustomer();
		}
		vm.showDrinks();
	}
}
