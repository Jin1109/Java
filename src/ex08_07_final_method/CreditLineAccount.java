//��� ���� wihdraw �޼��尡 final �޼ҵ�� �������̵� �Ұ�
package ex08_07_final_method;
public class CreditLineAccount extends Account {
   int creditLine;      //���̳ʽ� �ѵ� �ʵ�
   CreditLineAccount(String accountNo, String ownerName, 
		   			int balance, int creditLine){
      super(accountNo, ownerName, balance);
      this.creditLine = creditLine;
   }
      int withdraw(int amount) throws Exception {   //�����Ѵ�.
         if(balance + creditLine < amount)
            throw new Exception("�ܾ��� �����մϴ�.");
         balance -= amount;
         return amount;
   }
}