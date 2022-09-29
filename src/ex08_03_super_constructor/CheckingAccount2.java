//�����ڰ� �߰��� ���� ���� Ŭ����
package ex08_03_super_constructor;
public class CheckingAccount2 extends Account{
   String cardNo;
   
   // �Ķ���� 3���� ���� Ŭ���� ������ ȣ�⹮
   // �ݵ�� �������� ù��° ��ɹ��̾�� �մϴ�.
   
   CheckingAccount2(String accountNo, String ownerName,
		   			int balance,	String cardNo){
	   //������ ù �ٿ��� �θ� �����ڸ� ȣ������ �ʾұ� ������ �����Ϸ��� �θ��� �����ڸ�
	   //ȣ���ϴ� ������ super();�� ���⿡ �����Ѵ�.
	   super(accountNo, ownerName, balance);
	   this.cardNo = cardNo;	   
   }   
   int pay(String cardNo, int amount) throws Exception{
	   if(!cardNo.equals(this.cardNo) || (balance < amount))
		     throw new Exception("������ �Ұ����մϴ�.");
      return super.withdraw(amount);
   }

}