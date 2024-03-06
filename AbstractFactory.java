package day6.DesignPatterns.factory.bankexample.model;

public class AbstractFactory {
	static Bank b=null;
	static Loan l=null;
	
	public static void displayInterestAmount(int bankChoice, int loanChoice, double p, double n)
	{
		b=BankFactory.getBank(bankChoice);
		l=LoanFactory.getLoan(loanChoice);
		double interestRate=0;
		switch(b.getBankName())
		{
		case "HDFC Bank":
			switch(l.loanType())
			{
			case "Home Loan":
				interestRate=10.0; break;
			case "Car Loan":
				interestRate=11.0; break;
			case "Education Loan":
				interestRate=12.0; break;
			}
		break;
		
		case "ICICI Bank":
			switch(l.loanType())
			{
			case "Home Loan":
				interestRate=5.0; break;
			case "Car Loan":
				interestRate=6.0; break;
			case "Education Loan":
				interestRate=7.0; break;
			}
			break;
		
		case "AXIS Bank":
			switch(l.loanType())
			{
			case "Home Loan":
				interestRate=20.0; break;
			case "Car Loan":
				interestRate=21.0; break;
			case "Education Loan":
				interestRate=22.0; break;
			}
			break;
		}
		System.out.println(b.getBankName() + " "+ l.loanType()+ " approved, at Rate of Interest " + interestRate+ ", Total Interest Payable" + l.calculateInterest(n,p,interestRate));
		
	}
}
