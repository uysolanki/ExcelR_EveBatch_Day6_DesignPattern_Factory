package day6.DesignPatterns.factory.bankexample.model;

import java.util.Scanner;

public class DriverAppBank {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("*****BANK OPTIONS*****");
	System.out.println("1. Hdfc");
	System.out.println("2. Icici");
	System.out.println("3. Axis");
	int bankChoice=sc.nextInt();
	
	Bank b=BankFactory.getBank(bankChoice);
	System.out.println(b.getBankName());
}
}
