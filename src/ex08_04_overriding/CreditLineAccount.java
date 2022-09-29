//���̳ʽ� ���� Ŭ����
// - ��� ���� withdraw�޼ҵ带 �ٽ� ����(�޼ҵ� �������̵�)�ϴ� Ŭ����
/* �޼ҵ� �������̵�(����Ŭ������ ���ǵ� �޼ҵ带 ���� Ŭ�������� �������ϴ� ��) ����
   1. ��� ����
   2. �θ� Ŭ������ ����ο� ��ġ(���ϰ� Ÿ��, �޼��� �̸�, �Ű����� ���)
   3. ���� �������� ������ ���ų� �о�� �Ѵ�.
 */
package ex08_04_overriding;

public class CreditLineAccount extends Account {
   int creditLine;      //���̳ʽ� �ѵ� �ʵ�
   CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine){
      super(accountNo, ownerName, balance);
      this.creditLine = creditLine;
   }
      // �޼ҵ� �������̵� - �����Ѵ� ��� �ٽ� ����
      // (�ܾ� + ���̳ʽ� �ѵ�) < ����� ��� "������ �Ұ����մϴ�" ���� �߻���ŵ�ϴ�.
      int withdraw(int amount) throws Exception {   //�����Ѵ�.
         if(balance + creditLine < amount)
            throw new Exception("�ܾ��� �����մϴ�.");
         balance -= amount;
         return amount;
   }
}