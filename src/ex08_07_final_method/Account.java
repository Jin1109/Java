//final 키워드를 이용한 메소드 오버라이딩 금지
package ex08_07_final_method;
class Account {	
	String accountNo;	
	String ownerName;	
	int balance;	
	Account(String accountNo, String ownerName, int balance){// 생성자
	   this.accountNo = accountNo; 
	   this.ownerName = ownerName; 
	   this.balance = balance;
	}
	
	void deposit(int amount) {	//예금한다
		balance += amount;
	}
	
	final int withdraw(int amount) throws Exception	{	
		if (balance < amount)
			throw new Exception("잔액이 부족합니다.");
		 balance -= amount;
		 return amount;
	}

}
