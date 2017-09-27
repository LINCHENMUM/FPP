package Lesson3HW;

class Account {
	//public final static String CHECKING = "checking";
	//public final static String SAVINGS = "savings";
	//public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private String acctType;
	private Employee employee;

	Account(Employee emp, String acctType, double balance) {
		employee = emp;
		//this.acctType = acctType;
		getAccountInfo(acctType);
		
		this.balance = balance;
	}

	Account(Employee emp, String acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		this.balance=this.balance+deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if (amount>this.balance)
			return false;
		else{
			this.balance=this.balance-amount;
			return true;
		}
	}
	public void getAccountInfo(String accountType){
		if (accountType.equals(AccountType.CHECKING.toString()))
			this.acctType=AccountType.CHECKING.toString();
		if (accountType.equals(AccountType.RETIREMENT.toString()))
			this.acctType=AccountType.RETIREMENT.toString();
		if (accountType.equals(AccountType.SAVINGS.toString()))
			this.acctType=AccountType.SAVINGS.toString();
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	
	public void setBalance(double amount){
		this.balance=amount;
	}
	public double getBalance(){
		return this.balance;
	}
}
