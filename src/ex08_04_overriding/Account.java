//생성자가 있는 Account 클래스
//은행 계좌 클래스
package ex08_04_overriding;
class Account {	//은행 계좌 클래스
	String accountNo;	//계좌번호
	String ownerName;	//예금주 이름
	int balance;		//잔액
	
	Account(String accountNo, String ownerName, int balance){// 생성자
	   this.accountNo = accountNo; 
	   this.ownerName = ownerName; 
	   this.balance = balance;
	}
	
	void deposit(int amount) {	//예금한다
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception	{	
		if (balance < amount)
			throw new Exception("잔액이 부족합니다.");
		 balance -= amount;
		 return amount;
	}

}
