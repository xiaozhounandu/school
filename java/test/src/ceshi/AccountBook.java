package ceshi;

public class AccountBook {
	
	private String accountName;
	private int income;
	private int outcome;
	
	public int compute(){
		return income-outcome;
	}
	

	public AccountBook(int income, int outcome) {
		super();
		this.income = income;
		this.outcome = outcome;
	}
	


	public int getIncome() {
		return income;
	}


	public void setIncome(int income) {
		this.income = income;
	}


	public  int  getOutcome() {
		return outcome;
	}


	public void setOutcome(int outcome) {
		this.outcome = outcome;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountBook Zhangsan = new AccountBook(30,10);
		System.out.print("Zhangsan"+", "+"income: "+Zhangsan.getIncome()+"*, "+"outcome: "+Zhangsan.getOutcome()+"*, "+"balance: "+Zhangsan.compute()+"*.");
	}

}
