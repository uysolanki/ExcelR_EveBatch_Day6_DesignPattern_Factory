package day6.DesignPatterns.factory.bankexample.model;

import java.util.Scanner;

public class DriverAppForLoanAbstractFactory {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("*****BANK OPTIONS*****");
	System.out.println("1. Hdfc");
	System.out.println("2. Icici");
	System.out.println("3. Axis");
	int bankChoice=sc.nextInt();
	
	//HDFC Bank Home Loan approved, at Rate of Interest 10.0, Total Interest Payable1000.0
	//ICICI Bank Home Loan approved, at Rate of Interest 5.0, Total Interest Payable500.0
	System.out.println("*****LOAN OPTIONS*****");
	System.out.println("1. Home"); 
	System.out.println("2. Car");  
	System.out.println("3. Education");
	int loanChoice=sc.nextInt();
	
	System.out.println("Enter loan Amount");
	double p=sc.nextDouble();
	System.out.println("Enter loan Duration");
	double n=sc.nextDouble();

	
	AbstractFactory.displayInterestAmount(bankChoice, loanChoice, p, n);
}
}
