//생성자가 추가된 직불 계좌 클래스
package ex08_03_super_constructor;
public class CheckingAccount extends Account{
   String cardNo;
   
   //자바 컴파일러가 컴파일 시 서브 클래스의 생성자 첫번째 명령문이
   //슈퍼 클래스의 생성자 호출문이 아니면
   //자동으로 슈퍼 클래스의 no-arg constructor 호출문을 추가합니다.
   //하지만 슈퍼 클래스에서 no-arg constructor가 없어서 컴파일에러 발생
   CheckingAccount(String accountNo, String ownerName,
		   			int balance,	String cardNo){
	   //생성자 첫 줄에서 부모 생성자를 호출하지 않았기 때문에 컴파일러가 부모의 생성자를
	   //호출하는 문장인 super();를 여기에 삽입한다.
	   super();	//Account(){}
	   this.accountNo = accountNo;  
	   this.ownerName = ownerName; 
	   this.balance = balance;	   
	   this.cardNo = cardNo;	   
   }   
   int pay(String cardNo, int amount) throws Exception{
	   if(!cardNo.equals(this.cardNo) || (balance < amount))
		     throw new Exception("지불이 불가능합니다.");
      return withdraw(amount);
   }

}