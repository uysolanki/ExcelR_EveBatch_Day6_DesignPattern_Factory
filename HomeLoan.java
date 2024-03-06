package day6.DesignPatterns.factory.bankexample.model;

public class HomeLoan implements Loan{

	@Override
	public double calculateInterest(double p, double n, double r) {
		return (p*n*r)/100;
	}

	@Override
	public String loanType() {
		return "Home Loan";
	}

}
