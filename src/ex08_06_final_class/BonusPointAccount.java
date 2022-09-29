//final class Account�� ��� �޾� ���� �߻� 
//The type BonusPointAccount cannot subclass the final class
package ex08_06_final_class;
public class BonusPointAccount extends Account{
    public static void main(String[] args) {
		
	}  
	int bonusPoint;   // ���� ����Ʈ �ʵ�
      BonusPointAccount(String accountNo, String ownerName, int balance, 
    		  			int bonusPoint) {
         super(accountNo, ownerName, balance);   //�θ� Ŭ������ ������ ȣ��
         this.bonusPoint = bonusPoint;
      
      }
      void deposit(int amount) {
         super.deposit(amount);
         bonusPoint += (int)(amount * 0.001);
      }
}