//���� ���� Ŭ����
package ex08_05_super_method;
class Account {	//���� ���� Ŭ����
	String accountNo;	//���¹�ȣ
	String ownerName;	//������ �̸�
	int balance;		//�ܾ�
	
	Account(String accounNo, String ownerName, int balance){// ������
	   this.accountNo = accounNo; 
	   this.ownerName = ownerName; 
	   this.balance = balance;
	}
	
	void deposit(int amount) {	//�����Ѵ�
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception	{	
		if (balance < amount)
			throw new Exception("�ܾ��� �����մϴ�.");
		 balance -= amount;
		 return amount;
	}

}
