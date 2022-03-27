package extend;

public class Account   {

	private String account,name;
	private int cash;
	
	
	public Account(String account, String name, int cash) {
		super();
		this.account = account;
		this.name = name;
		this.cash = cash;
	}
	
	
	int AddCash(int money){
		this.cash+= money;
		return cash;
	}
	int SubCash(int money){
		this.cash-= money;
		return cash;
	
	
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	
	int deposit(int amount) {
		cash+=cash;
		return cash;
	}
	
	
}
