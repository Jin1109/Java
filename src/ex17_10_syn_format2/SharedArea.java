//���� ���� Ŭ����
package ex17_10_syn_format2;

public class SharedArea {
	private Account account1;	// �̸����� ����
	private Account account2;	// �������� ����
	
	SharedArea(Account account1, Account account2){
		this.account1 = account1;
		this.account2 = account2;
	}
	
	/*
	����ȭ ��� 2.
	synchronized �޼ҵ� ����{
								�Ӱ� ���� �ڵ�
	}
	*/
	
	//����ȭ �޼ҵ�
	synchronized void thransfer() {	
			account1.withdraw(1000000);
			account2.deposit(1000000);
		}
	
	//����ȭ �޼ҵ�
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
