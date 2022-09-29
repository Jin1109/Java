//은행 계좌 클래스
package ex08_02_constructor;

class Account {	
	String accountNo;	//계좌번호
	String ownerName;	//예금주 이름
	int balance;		//잔액
	
	// 기본 생성자를 컴파일러가 자동 추가합니다.
	// Account (){}
	
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
