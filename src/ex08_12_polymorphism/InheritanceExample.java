//자바는 한 타입의 참조 변수로 여려타입의 객체를 참조할 수 있도록 했는데
//조상 클래스 타입의 참조 변수로 자손 클래스의 인스턴스를 참조할 수 있도록 하였습니다.
//==> 다향성
package ex08_12_polymorphism;
class InheritanceExample {
   public static void main(String[] args) {
	Account obj1 = new Account("111-222-333333", "임꺽정", 10000);
	System.out.println("계좌변호:" + obj1.accountNo);
	System.out.println("예금주 이름:" + obj1.ownerName);
	System.out.println("잔액:" + obj1.balance);
	System.out.println();
	
	CheckingAccount obj2 = new CheckingAccount(
			"444-55-666666", "홍길동", 10000, 
			"5555-6666-7777-8888");
	System.out.println("계좌변호:" + obj2.accountNo);
	System.out.println("예금주 이름:" + obj2.ownerName);
	System.out.println("잔액:" + obj2.balance);
	System.out.println();
   
   
   CreditLineAccount obj3 = new CreditLineAccount(
			"777-88-999999", "김선달", 30000, 20000000);
	System.out.println("계좌변호:" + obj3.accountNo);
	System.out.println("예금주 이름:" + obj3.ownerName);
	System.out.println("잔액:" + obj3.balance);
	System.out.println();
  
   
   BonusPointAccount obj4 = new BonusPointAccount(
			"000-00-000000", "김미영", 0, 0);
	System.out.println("계좌변호:" + obj4.accountNo);
	System.out.println("예금주 이름:" + obj4.ownerName);
	System.out.println("잔액:" + obj4.balance);
	System.out.println();
  }
 
   
}