//����Ʈ ���� ���� Ŭ����
package ex08_05_super_method;
class BonusPointAccount extends Account {
      int bonusPoint;   //���� ����Ʈ �ʵ�
      
      BonusPointAccount(String accountNo, String ownerName, 
                     int balance, int bonusPoint){// ������
         super(accountNo, ownerName, balance);//�θ� Ŭ������ ������ ȣ���մϴ�.
         this.bonusPoint = bonusPoint;
      }
      
      //�����ϴ� ����� �ٽ� ����(�޼ҵ� �������̵�)
      //��� ���� �޼ҵ��� �������ܼ����� Ȯ��
      //super�� �ڽ� Ŭ�������� �θ� Ŭ������ ��� ���� �ʵ�� �޼��带 �����ϴµ� ����մϴ�.
        void deposit(int amount){
           // balance += amount;      //super.balance
            super.deposit(amount);
            bonusPoint += (int)(amount * 0.001);
      }
   
  
}