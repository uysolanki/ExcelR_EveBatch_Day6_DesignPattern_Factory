package day6.DesignPatterns.factory.bankexample.model;

public class BankFactory {
	static Bank b=null;
	
	public static Bank getBank(int bankChoice)
	{
		switch(bankChoice)
		{
		case 1: 
			b=new Hdfc(); break;
		case 2: 
			b=new Icici(); break;
		case 3: 
			b=new Axis(); break;
		}
		return b;
	}
}
