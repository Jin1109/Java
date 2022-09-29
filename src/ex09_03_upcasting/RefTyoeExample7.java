package ex09_03_upcasting;

public class RefTyoeExample7 {
	public static void main(String[] args) {
		Account obj = 
		(Account) new CheckingAccount("111-22-33333333", "홍길동", 10000, "4444-5555-6666-7777");
		try {
			obj.withdraw(1000);
			System.out.println("계좌번호:" + obj.accountNo);
			System.out.println("예금주 이름: " + obj.ownerName);
			System.out.println("잔액: " + obj.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
