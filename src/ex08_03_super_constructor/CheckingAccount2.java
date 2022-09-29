//생성자가 추가된 직불 계좌 클래스
package ex08_03_super_constructor;
public class CheckingAccount2 extends Account{
   String cardNo;
   
   // 파라미터 3개의 슈퍼 클래스 생성자 호출문
   // 반드시 생성자의 첫번째 명령문이어야 합니다.
   
   CheckingAccount2(String accountNo, String ownerName,
		   			int balance,	String cardNo){
	   //생성자 첫 줄에서 부모 생성자를 호출하지 않았기 때문에 컴파일러가 부모의 생성자를
	   //호출하는 문장인 super();를 여기에 삽입한다.
	   super(accountNo, ownerName, balance);
	   this.cardNo = cardNo;	   
   }   
   int pay(String cardNo, int amount) throws Exception{
	   if(!cardNo.equals(this.cardNo) || (balance < amount))
		     throw new Exception("지불이 불가능합니다.");
      return super.withdraw(amount);
   }

}