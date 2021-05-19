package workshop.account.entity;

public class Account_Ex {

	private String custName; // 고객이름
	private String custId; // 고객번호
	private String accId; // 계좌번호
	private int balance; // 잔액

	// ============================= 매서드 ===================================

	// 입금 매서드
	public void deposit(int amount) {
		balance += amount;

	}

	// 출금 매서드

	public void withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
		}

	}

	// set 매서드

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public void setBalance(int newbalance) {
		this.balance = newbalance;
	}

	// get 매서

	public String getCustId() {
		return custId;
	}

	public String getAccId() {
		return accId;
	}

	public int getBalance() {
		return balance;
	}

	public String getCustName() {
		return custName;
	}

}
