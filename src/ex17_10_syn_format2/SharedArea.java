//공유 영역 클래스
package ex17_10_syn_format2;

public class SharedArea {
	private Account account1;	// 이몽룡의 게좌
	private Account account2;	// 성춘향의 계좌
	
	SharedArea(Account account1, Account account2){
		this.account1 = account1;
		this.account2 = account2;
	}
	
	/*
	동기화 방법 2.
	synchronized 메소드 선업{
								임계 영역 코드
	}
	*/
	
	//동기화 메소드
	synchronized void thransfer() {	
			account1.withdraw(1000000);
			account2.deposit(1000000);
		}
	
	//동기화 메소드
	synchronized int getTotal() { 
			return account1.getBalance() + account2.getBalance();
		}
	
	public Account getAccount1() {
		return account1;
	}
	public void setAccount1(Account account1) {
		this.account1 = account1;
	}
	public Account getAccount2() {
		return account2;
	}
	public void setAccount2(Account account2) {
		this.account2 = account2;
	}
	
	
}
