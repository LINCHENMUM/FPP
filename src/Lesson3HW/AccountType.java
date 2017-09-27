package Lesson3HW;

public enum AccountType {
CHECKING("checking"),SAVINGS("savings"),RETIREMENT("retirement");
	private String accountType;
	private AccountType(String accountType){
		this.accountType=accountType; 
	}
	@Override
	public String toString(){
		return this.accountType;
	}
	
}
