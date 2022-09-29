package ex08_12_polymorphism;
public class BonusPointAccount extends Account{
	int bonusPoint;   // 누적 포인트 필드
      BonusPointAccount(String accountNo, String ownerName, int balance, 
    		  			int bonusPoint) {
         super(accountNo, ownerName, balance);   //부모 클래스의 생성자 호출
         this.bonusPoint = bonusPoint;
      }
      void deposit(int amount) {
         balance +=amount;
         bonusPoint += (int)(amount * 0.001);
      }
}