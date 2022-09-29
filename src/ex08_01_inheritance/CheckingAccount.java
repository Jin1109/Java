package ex08_01_inheritance;
//은행 계좌 클래스를 상속받는 직불 계좌 클래스
//은행 계좌 클래스(Account)         -슈퍼 클래스(상속을 해주는 클래스)
//직불 계좌 클래스(CheckingAccount)   -서브 클래스(상속을 받는 클래스)
public class CheckingAccount extends Account{
   String cardNo;
   
   CheckingAccount(){
      
   }
   /*
    * 메서드 이름 : pay
    * 매개변수 : 카드 번호(cardNo-문자열), 인출액(amount-정수형)
    * 반환형 : int
    * 반환되는 값 : 부모 클래스의 인출메서드 호출
    * 
      balance 필드와 withdraw() 메소드는 Account클래스로부터 상속 받아 사용 가능합니다.
            이 클래스 안에 선언되어 있는 것처럼 사용하고 있습니다.
    */
   // 직불 카드 사용액을 지불한다에 해당하는 메소드
   int pay(String cardNo, int amount) throws Exception{
	   if(!cardNo.equals(this.cardNo) || (balance < amount))
		// if(!cardNo.equals(this.cardNo))
		     throw new Exception("지불이 불가능합니다.");
      
      return withdraw(amount);
   }

}