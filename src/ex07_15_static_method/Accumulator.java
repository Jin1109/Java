//���� �ʵ尡 �ִ� Ŭ����
//total �ʵ�� ��ü���� ���� ��������
//grandTotal �ʵ�� Ư�� ��ü�� ������� Ŭ���� ��ü�� �ϳ��� ����� ���� �ʵ��̴�.
package ex07_15_static_method;
class Accumulator {
	int total = 0;
	static int grandTotal;		// ���� �ʵ带 �����ϴ� ����
	
	void accumulate(int amount) {	//�޼���
		total += amount;
		grandTotal += amount;
	}

	/*
	 * ���� �޼���ȿ����� �ν��Ͻ� ����, �ν��Ͻ� �޼��� ����� �� �����ϴ�.
	 * �ν��Ͻ� ������ �ν��Ͻ� �޼���� ��ü ������ ����� �� �ִ� ������̱� ������
	 * �ν��Ͻ� ������ ���þ��� static �޼���ȿ����� ����� �� �����ϴ�.
	 * ���� this�� ����� �� �����ϴ�. 
	 */
	static int getGrandTotal() {	// ���� �޼��� ����
		//total = 5;				// ���� �߻�
		//accumulator(100)			// ���� �߻�
		return grandTotal;
	}
}
