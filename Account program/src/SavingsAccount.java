
public class SavingsAccount {
	 static double annualInterestRate;
	double savingsBalance;
	double deposit;
	double monthlyinterest;	
	double interest;
	public static double getAnnualInterestRate() {
		
		return annualInterestRate;
	}
	public static void setAnnualInterestRate(double annualInterestRate) 
	{
		annualInterestRate= annualInterestRate/100;
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public double calculateMonthlyInterest()
	{
		interest=(savingsBalance*annualInterestRate)/12.0;
		savingsBalance+=interest;
		return savingsBalance; 
	}
	
		public static void main(String args[]){
			SavingsAccount saver1=new SavingsAccount();
			SavingsAccount saver2=new SavingsAccount();
			SavingsAccount.setAnnualInterestRate(4);
			saver1.setSavingsBalance(2000);
			saver2.setSavingsBalance(3000);
			System.out.println(saver1.calculateMonthlyInterest());
			System.out.println(saver2.calculateMonthlyInterest());
			SavingsAccount.setAnnualInterestRate(5);
			System.out.println(saver1.calculateMonthlyInterest());
			System.out.println(saver2.calculateMonthlyInterest());
			
			
			
			
			
			
			
			
		}
			
		}

