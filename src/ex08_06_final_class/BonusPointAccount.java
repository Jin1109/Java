//final class Account를 상속 받아 에러 발생 
//The type BonusPointAccount cannot subclass the final class
package ex08_06_final_class;
public class BonusPointAccount extends Account{
    public static void main(String[] args) {
		
	}  
	int bonusPoint;   // 누적 포인트 필드
      BonusPointAccount(String accountNo, String ownerName, int balance, 
    		  			int bonusPoint) {
         super(accountNo, ownerName, balance);   //부모 클래스의 생성자 호출
         this.bonusPoint = bonusPoint;
      
      }
      void deposit(int amount) {
         super.deposit(amount);
         bonusPoint += (int)(amount * 0.001);
      }
}