package ex13_7;
class Circle2 {
	int radius;				//������
	Circle2(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "radius=" + radius;
	}
	
	//obj�� ObjectŸ���̹Ƿ� radius�� �����ϱ����ؼ� Circle2Ÿ������ ����ȯ�� �ʿ�
	public boolean equals(Object obj) {
		/*	obj�� null�� �ƴϰ� obj�� Circle2�� ����ȯ�ϰ�
		 	������ �����ϸ� obj1�� Circle2�� ����ȯ�ϰ�
		 	����ȯ�� obj�� radius���� ���� ��ü�� radius���� ���ؼ� ���v��
		 	
		 	�� ������ �������� ������ false �����մϴ�. 
		 */
		if (obj != null && obj instanceof Circle2) {
			Circle2 obj2 = (Circle2)obj;
			return this.radius == obj2.radius;	
		}else {
			return false;
		}
	}
}
