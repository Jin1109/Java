//�����ڰ� �߰��� ���� ���� Ŭ����
package ex08_03_super_constructor;
public class CheckingAccount extends Account{
   String cardNo;
   
   //�ڹ� �����Ϸ��� ������ �� ���� Ŭ������ ������ ù��° ��ɹ���
   //���� Ŭ������ ������ ȣ�⹮�� �ƴϸ�
   //�ڵ����� ���� Ŭ������ no-arg constructor ȣ�⹮�� �߰��մϴ�.
   //������ ���� Ŭ�������� no-arg constructor�� ��� �����Ͽ��� �߻�
   CheckingAccount(String accountNo, String ownerName,
		   			int balance,	String cardNo){
	   //������ ù �ٿ��� �θ� �����ڸ� ȣ������ �ʾұ� ������ �����Ϸ��� �θ��� �����ڸ�
	   //ȣ���ϴ� ������ super();�� ���⿡ �����Ѵ�.
	   super();	//Account(){}
	   this.accountNo = accountNo;  
	   this.ownerName = ownerName; 
	   this.balance = balance;	   
	   this.cardNo = cardNo;	   
   }   
   int pay(String cardNo, int amount) throws Exception{
	   if(!cardNo.equals(this.cardNo) || (balance < amount))
		     throw new Exception("������ �Ұ����մϴ�.");
      return withdraw(amount);
   }

}