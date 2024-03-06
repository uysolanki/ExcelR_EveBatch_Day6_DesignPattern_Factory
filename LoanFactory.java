package day6.DesignPatterns.factory.bankexample.model;

public class LoanFactory {
		static Loan l=null;
		
		public static Loan getLoan(int loanChoice)
		{
			switch(loanChoice)
			{
			case 1: 
				l=new HomeLoan(); break;
			case 2: 
				l=new CarLoan(); break;
			case 3: 
				l=new EducationLoan(); break;
			}
			return l;
		}
}
