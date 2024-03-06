package day6.DesignPatterns.factory.bankexample.model;

public interface Loan {
	double calculateInterest(double p,double n,double r);
	String loanType();
}
