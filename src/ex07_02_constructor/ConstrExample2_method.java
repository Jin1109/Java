//선언된 생성자를 이용하여 객체를 생성하는 프로그램
package ex07_02_constructor;
public class ConstrExample2_method {
	public static void main(String[] args) {
		GoodsStock obj;
		obj = new GoodsStock("52135", 200);//선언된 생성자를 이용해서 객체를 생성
		print(obj);
		
		obj.addStock(1000);			//메소스 호출
		System.out.println("=====obj.addStock(1000) 후====");
		print(obj);
		
		obj.addStock(500);
		System.out.println("=====obj.addStock(500) 후====");
		print(obj);
		
		
	}

	private static void print(GoodsStock obj) {
		System.out.println("상품코드:" + obj.goodsCode);
		System.out.println("재고상품:" + obj.stockNum);
		
	}
}
