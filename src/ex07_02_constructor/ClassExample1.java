//GoodsStock Ŭ������ ��ü�� �����ؼ� ����ϴ� ���α׷�
package ex07_02_constructor;
public class ClassExample1 {
	public static void main(String[] args) {
		GoodsStock obj;				//���� ����
		obj = new GoodsStock("52135", 200);		//����� �����ڸ� �̿��ؼ� ��ü�� ����
		System.out.println("��ǰ�ڵ�:" + obj.goodsCode);// �ʵ� �� ���
		System.out.println("����ǰ:" + obj.stockNum);
		
		obj.addStock(1000); 		//�޼ҵ� ȣ��
		System.out.println("=====obj.addStock(1000) ��====");
		System.out.println("��ǰ�ڵ�:" + obj.goodsCode);
		System.out.println("����ǰ:" + obj.stockNum);
		
		obj.addStock(500); 		
		System.out.println("=====obj.addStock(500) ��====");
		System.out.println("��ǰ�ڵ�:" + obj.goodsCode);
		System.out.println("����ǰ:" + obj.stockNum);
		
	}

}
