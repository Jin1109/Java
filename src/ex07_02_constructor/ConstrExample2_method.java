//����� �����ڸ� �̿��Ͽ� ��ü�� �����ϴ� ���α׷�
package ex07_02_constructor;
public class ConstrExample2_method {
	public static void main(String[] args) {
		GoodsStock obj;
		obj = new GoodsStock("52135", 200);//����� �����ڸ� �̿��ؼ� ��ü�� ����
		print(obj);
		
		obj.addStock(1000);			//�޼ҽ� ȣ��
		System.out.println("=====obj.addStock(1000) ��====");
		print(obj);
		
		obj.addStock(500);
		System.out.println("=====obj.addStock(500) ��====");
		print(obj);
		
		
	}

	private static void print(GoodsStock obj) {
		System.out.println("��ǰ�ڵ�:" + obj.goodsCode);
		System.out.println("����ǰ:" + obj.stockNum);
		
	}
}
