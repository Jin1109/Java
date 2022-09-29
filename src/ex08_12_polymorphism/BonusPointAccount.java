package ex08_12_polymorphism;
public class BonusPointAccount extends Account{
	int bonusPoint;   // ���� ����Ʈ �ʵ�
      BonusPointAccount(String accountNo, String ownerName, int balance, 
    		  			int bonusPoint) {
         super(accountNo, ownerName, balance);   //�θ� Ŭ������ ������ ȣ��
         this.bonusPoint = bonusPoint;
      }
      void deposit(int amount) {
         balance +=amount;
         bonusPoint += (int)(amount * 0.001);
      }
}