package ex08_01_inheritance;
//���� ���� Ŭ������ ��ӹ޴� ���� ���� Ŭ����
//���� ���� Ŭ����(Account)         -���� Ŭ����(����� ���ִ� Ŭ����)
//���� ���� Ŭ����(CheckingAccount)   -���� Ŭ����(����� �޴� Ŭ����)
public class CheckingAccount extends Account{
   String cardNo;
   
   CheckingAccount(){
      
   }
   /*
    * �޼��� �̸� : pay
    * �Ű����� : ī�� ��ȣ(cardNo-���ڿ�), �����(amount-������)
    * ��ȯ�� : int
    * ��ȯ�Ǵ� �� : �θ� Ŭ������ ����޼��� ȣ��
    * 
      balance �ʵ�� withdraw() �޼ҵ�� AccountŬ�����κ��� ��� �޾� ��� �����մϴ�.
            �� Ŭ���� �ȿ� ����Ǿ� �ִ� ��ó�� ����ϰ� �ֽ��ϴ�.
    */
   // ���� ī�� ������ �����Ѵٿ� �ش��ϴ� �޼ҵ�
   int pay(String cardNo, int amount) throws Exception{
	   if(!cardNo.equals(this.cardNo) || (balance < amount))
		// if(!cardNo.equals(this.cardNo))
		     throw new Exception("������ �Ұ����մϴ�.");
      
      return withdraw(amount);
   }

}